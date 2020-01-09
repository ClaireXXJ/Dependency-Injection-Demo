package vivianxia.springframework.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ge")
@Primary
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Pramarer Guru - German";
    }
}
