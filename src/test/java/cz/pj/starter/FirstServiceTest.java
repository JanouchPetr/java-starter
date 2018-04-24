package cz.pj.starter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstServiceTest {

    @Test
    void testBasic() {
        SecondService secondService = Mockito.mock(SecondService.class);
        Mockito.when(secondService.sayHello()).thenReturn("Hi");

        FirstService firstService = new FirstService(secondService);
        assertEquals("Hi Petr!", firstService.greet("Petr"));
    }
}
