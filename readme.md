
# Step 1 - Clone and create your branch

Clone the repo https://github.com/rcoelho-aka/vdf 



- Confirm that you are in `main` branch (`git status`, `git switch`)
- Create a branch with the format `firstName-lastName`, for example `ricardo-coelho` (`git branch`)
- Explore the files and try to understand what the application does
- Test that the application works
    - You can run the application in your favourite IDE or in the terminal by using these commands:
      - to compile: `javac *.java`
      - to execute the main class: `java Main`
      - the application should print "Hello world!" to the console
- Check the file `.gitignore`
    - It ignores all `*.class` files (java compiled classes that should not be commited to the repo)
    - Check with `git status` that these files are ignored by git


# Step 2 - Add your first file
- Add a new file named `FirstLast.java` (for example: RicardoCoelho.java)
- This file should be a java class with a static function that creates a new student with your name and print the first and last name - **you have an example in the branch `ricardo-coelho`** (`use git switch` to check the contents of other branches)
- Add in Main.java a line executing the code in your file (` RicardoCoelho.sayName();`) - check the example in the branch `ricardo-coelho`
- Test your code by compiling and executing the application again. The output should be:

```
Hello World!
RicardoCoelho
```

- Make a commit adding these changes to the repository. Remember to always use descriptions that clearly identify the change you made (`git status`, `git add`, `git commit`)
- Check the log and confirm your commit is there (`git log`, `git log --oneline --graph --all`)
- Send your changes to the remote repo. This branch is not associated with a branch in the remote, so you should use the complete push command that identifies the remote name and the remote branch, and the flag to automatically associate the local branch and the remote branch (`git push --set-upstream origin first-last`)
- Navigate to github and confirm that your commit and your file is there


# Step 3 - Change your code

- Change your FisrtLast.java class to print the phrase: "My name is First Last!" (note the space between first and last name and the exclamation mark in the end).
- TIP: You should still use the sayFirstName and sayLastName from the Student class. You can use System.out.print() to print text without adding a new line in the end.
- Test your code. The output should be:

```
Hello World!
My name is Ricardo Coelho!
```

- Commit your changes and push them to github

# Step 4 - Create a Pull Request
- Navigate to github and create a Pull Request from your branch into main.
- Confirm if the branch can be automatically merged or if it has conflicts.
- If you have conflicts you should fix them in your computer and commit the resolution:
  - Pull the latest changes into your main (`git switch main`, `git pull`)
  - Merge main into your branch (`git switch first-last`, `git merge main`)
  - Fix the conflicts and commit the result (`git commit`)
  - Push your branch again to Github

- Check your Pull Request. Can it be automatically merged now?
  - NOTE that it may have conflicts again if someone else was able to merge the PR to master in the mean time. If you have conflicts again, repeat the previous steps.
- If you have no conflicts, merge the Pull Request into main using a merge commit. Pull main into your computer and confirm your changes are there.

# Final notes
In the end, running the application should printo to the console the names of all students in the class.

This is an introdutory exercise that only touches the most frequent usage of git. You should play around with git and test all the other concepts and commands we saw during the class. Practice is the best way to consolidate knowledge!

Happy coding!