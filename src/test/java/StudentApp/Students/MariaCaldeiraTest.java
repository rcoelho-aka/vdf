package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RicardoCoelho.class)
class MariaCaldeiraTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnMariaCaldeira() throws Exception {
        mockMvc.perform(get("/maria-caldeira"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Maria', 'lastName':'Caldeira'}"));
    }
}
