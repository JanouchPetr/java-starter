package cz.pj.starter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {Application.class})
@ExtendWith(SpringExtension.class)
class FirstServiceSpringTest {

    @MockBean
    private SecondService secondService;

    @Inject
    private FirstService firstService;

    @Test
    void testBasic() {
        Mockito.when(secondService.sayHello()).thenReturn("Hi");
        assertEquals("Hi Petr!", firstService.greet("Petr"));
    }
}
