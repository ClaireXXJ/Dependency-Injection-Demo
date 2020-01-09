package vivianxia.springframework.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingService;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

    @Autowired
    //ask spring to inject that
    //null pointer exception
    //if no autowired means haven't tell spring i want to inject that

    //when do qualifier and here type is GreetingService may cause fail because it does not know which to use
    //or can change variable name to bean name like "greetingServiceImpl" works

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
