package vivianxia.springframework.dependencyinjectiondemo;

import org.junit.Before;
import org.junit.Test;
import vivianxia.springframework.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstrutorInjectedControllerTest {
    private ConstructorInjectedController construtorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.construtorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, construtorInjectedController.sayHello());
    }
}
