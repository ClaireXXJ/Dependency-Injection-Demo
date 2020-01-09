package vivianxia.springframework.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
//if there is more than one bean, prefer to use primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - Primary Greeting Service";
    }
}
