package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(TomasRodrigues.class)
public class TomasRodriguesTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnTomasRodrigues() throws Exception {
        mockMvc.perform(get("/tomas-rodrigues"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Tomás', 'lastName':'Rodrigues'}"));
    }
    @Test
    void shouldReturnError() throws Exception {
        mockMvc.perform(get("/tomas-rodrigues"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'ola', 'lastName':'ola'}"));
    }
}
