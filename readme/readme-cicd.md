# Step 1 - Merge main into your branch

Merge the latest changes in main into your branch (you can use the same branch from previous git exercise)

You should now have a Spring application to play around with. Have fun :)

Some useful tips:
- You can use `mvn` if it is installed in your computer, or `mvnw` binary in the projetct root if not.
- The project is targeting java 17, you should check you have at least that version with `java --version`
- To run the app: `mvn spring-boot:run`
  - You should get a running app in port 8080. Visit http://localhost:8080 and you should see the message "Greetings from Spring Boot!"
- To run unit tests: `mvn test`
- To package the application (generate a jar file): `mvn clean package`
  - This will also run the tests, use `-Dmaven.test.skip` to skip tests
  - The generated jar will be in `target` folder

If everything is ok, push your changes to Github (to your branch)

# Step 2 - Create the pipeline
It's now time to create your first pipline.

- In Jenkins, create a new pipline (please give it your branch name)
- It should be triggered manually
- The pipeline should be organised in different stages to perform the following actions:
  - Get code from the repo using `git` command
  - Package and test the app: `mvn clean package` (remember: this is a shell command, you should use `sh` to run it.
  - Archive test results in jenkins (using junit plugin already installed): `junit '**/target/surefire-reports/TEST-*.xml'`
  - Build Docker image: `docker build -t ${env.DOCKER_TAG} .` 
    - `${env.DOCKER_TAG}` in above command refers to an environment variable that needs to be declared. The tag needs to follow this format exactly in order to be recognized by Heroku: `registry.heroku.com/${env.APP_NAME}/web` 
    - `${env.APP_NAME}` should have this format: `vdf-firstName-LastName`
    - Example of variable declaration: `env.APP_NAME = "vdf-ricardo-coelho"` (TIP: this is groovy syntax and needs to be used inside a script block)
  - Push the image to registry. This will require authenticaton in the Heroku registry:
    - Use withCredentials to read from jenkins credentials store and pass it to your script as an ENV variable.  `withCredentials([string(credentialsId: 'heroku-key', variable: 'HEROKU_API_KEY')]) { ... }`
    - Login in the registry. This command expects the API key to live in an ENV variable named "HEROKU_API_KEY": `heroku container:login`
    - And finally push the image to the registry: `docker push ${env.DOCKER_TAG}`
  - Deploy the new version: `heroku container:release web -a ${env.APP_NAME}` (Note: this will also require the environment variable with the API key)

If all goes well, you should be able to see your application running at the url:
https://vdf-firstName-lastName.herokuapp.com (example: https://vdf-ricardo-coelho.herokuapp.com)


TIP 1: Example pipeline:

````
pipeline {
    agent any

    stages {
        stage('Setup & Clone Repo') {
            steps {
                script {
                    // declare variables that are used in next steps
                    env.APP_NAME = "vdf-ricardo-coelho"
                    env.DOCKER_TAG = "registry.heroku.com/${env.APP_NAME}/web"
                }

                // TODO: Clone repo
            }
        }

        stage('Maven build & test') { ... }

        stage('Docker build') { ... }

        stage('Push to registry') { ... }

        stage('Deploy') { ... }
    }
````

TIP 2: Build your pipeline incrementally. Remember: short feedback loops are better.

# Step 3 - Move the pipeline code to git
Change your Jenkins job so that the pipeline definition is now read from your repo instead of being done inside jenkins.
- Copy the pipeline code to a file in the project `cicd/firstName-lastName.jenkinsfile` and commit/push it to github
- Change the Job in jenkins to use this file:
  - Definition: "Pipeline from SCM"
  - SCM: git
  - Repository Url: https://github.com/rcoelho-aka/vdf
  - Credentials: none (repo is public, otherwise we would need to give it credentials)
  - Branch Specifier: */your-branch
  - Script Path: cicd/your-jenkinsfile
- In your jenkins file, you should change the 'git' step to just `checkout scm`. This is because now there is a repo already associated with your pipeline, Jenkins knows to use that one (and can do some optimizations around if it needs to be cloned again)

# Step 4 - Automatic builds
 Lets now update the pipeline so that it builds automatically every time there is a new commit to the repo
 - Build triggers > Poll SCM 
 - Schedule: `* * * * *` (every minute, check examples here: https://crontab.guru/every-1-minute)

Save the pipeline and try making a new commit & push to your branch. The pipeline should start automatically (you'll need to wait 1 minute at most)

# Step 5 - Deploy only on demand
Modify your pipeline so that the deploy step is optional and only executes when the users chooses:
- When executing the build manually in jenkins, it should prompt the user if it should also deploy the application
- When executed automatically by SCM Pool, it should do everything except deploying the application

# Step 6 - Have fun coding!
Now that we have a cicd pipeline in place, let's do some coding!
- Change the file done in previous git exercise (`FirstLast.java`) and modify it to act as a Rest Controller, exposing an endpoint `/first-last` that when called returns a Student object, in json format, with your details.
- Check `RicardoCoelho.java` file for an example.
- Commit your code and let the cicd pipeline do it's magic. You will be able to check the result by visiting your deployed app (example: https://vdf-ricardo-coelho.herokuapp.com/ricardo-coelho)

# Step 7 - Adding some unit tests
- Add a unit test to test your controller. Check the file "RicardoCoelhoTest.java" for reference.
- When the pipeline runs, you should be able to see the test result
- Try adding a test that fails and confirm that the pipline fails without deploying the application
