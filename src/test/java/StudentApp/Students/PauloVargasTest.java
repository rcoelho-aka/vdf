package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PauloVargas.class)
class PauloVargasTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnPauloVargas() throws Exception {
        mockMvc.perform(get("/paulo-vargas"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Paulo', 'lastName':'Vargas'}"));
    }

    @Test
    void shouldReturnTest() throws Exception {
        mockMvc.perform(get("/paulo-vargas/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("Teste teste 123, isto está ligado?"));
    }

    @Test
    void skrrrtTest() throws Exception {
        mockMvc.perform(get("/paulo-vargas/skrrt"))
                .andExpect(status().isOk());
    }
}