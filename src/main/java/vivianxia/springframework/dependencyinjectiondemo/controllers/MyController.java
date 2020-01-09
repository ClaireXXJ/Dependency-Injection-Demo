package vivianxia.springframework.dependencyinjectiondemo.controllers;

import org.springframework.stereotype.Controller;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingService;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

@Controller
//spring component and indicate it is a spring bean
//managed by spring application context
//when spring starts up, will handle it as annotation controller
//create an instance and put instance into spring context
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! - MyController");
        return greetingService.sayGreeting();
    }
}
