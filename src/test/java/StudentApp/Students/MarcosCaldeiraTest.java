package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MarcosCaldeira.class)
class MarcosCaldeiraTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnRicardoCoelho() throws Exception {
        mockMvc.perform(get("/marcos-caldeira"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Marco', 'lastName':'Caldeira'}"));
    }
}
