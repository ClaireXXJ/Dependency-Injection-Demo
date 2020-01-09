package vivianxia.springframework.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingService;
import vivianxia.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    //bean name in qualifier
    //qualifier can help to get in the right bean
    public void setGreetingService(@Qualifier("setterGreetingService")GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
