package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AfonsoAlves.class)
class AfonsoAlvesTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnAfonsoAlves() throws Exception {
        mockMvc.perform(get("/afonso-alves"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Afonso', 'lastName':'Alves'}"));
    }

    @Test
    void shouldReturnAfonsoAlvesTest() throws Exception {
        mockMvc.perform(get("/afonso-alves/test"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'AfonsoTest', 'lastName':'AlvesTest'}"));
    }
}