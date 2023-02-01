package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FilipeGuerreiro.class)
class FilipeGuerreiroTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnFilipeGuerreiro() throws Exception {
        mockMvc.perform(get("/filipe-guerreiro"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Filipe', 'lastName':'Guerreiro'}"));
    }

    @Test
    void shouldReturnFilipeGuerreiro2() throws Exception {
        mockMvc.perform(get("/filipe-guerreiro/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("test"));
    }
}
