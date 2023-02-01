package StudentApp.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VascoBatista.class)
class VascoBatistaTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnVascoBatista() throws Exception {
        mockMvc.perform(get("/vasco-batista"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'firstName':'Vasco', 'lastName':'Baptista'}"));
    }

    @Test
    void shouldReturnVascoBatistaTest() throws Exception {
        mockMvc.perform(get("/vasco-batista/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("########## Vasco Baptista #############"));
    }
}