package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FilipaNunes.class)
class FilipaNunesTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnFilipaNunes() throws Exception {
        mockMvc.perform(get("/filipa-nunes"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Filipa', 'lastName':'Nunes'}"));
    }
}