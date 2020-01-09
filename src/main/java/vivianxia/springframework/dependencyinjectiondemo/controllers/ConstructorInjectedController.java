package vivianxia.springframework.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    //@Autowired
    //no autowired here is okay
    //automatic autowire
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
