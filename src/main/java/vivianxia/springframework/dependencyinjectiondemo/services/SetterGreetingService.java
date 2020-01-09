package vivianxia.springframework.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - I am injected via the setter";
    }
}
