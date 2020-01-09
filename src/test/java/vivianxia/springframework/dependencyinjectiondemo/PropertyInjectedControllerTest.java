package vivianxia.springframework.dependencyinjectiondemo;


import org.junit.Before;
import org.junit.Test;
import vivianxia.springframework.dependencyinjectiondemo.controllers.PropertyInjectedController;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

//JUnit test
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }

}
