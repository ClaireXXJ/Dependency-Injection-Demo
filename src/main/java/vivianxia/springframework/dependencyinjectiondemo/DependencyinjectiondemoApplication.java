package vivianxia.springframework.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vivianxia.springframework.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import vivianxia.springframework.dependencyinjectiondemo.controllers.MyController;
import vivianxia.springframework.dependencyinjectiondemo.controllers.PropertyInjectedController;
import vivianxia.springframework.dependencyinjectiondemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyinjectiondemoApplication {

    public static void main(String[] args) {

        //handle context
        ApplicationContext ctx = SpringApplication.run(DependencyinjectiondemoApplication.class, args);

        //make context get the Bean
        //create a spring bean named myController
        MyController controller = (MyController)ctx.getBean("myController" );
        //controller.hello();

        //property inject
        //if exception says no qualifing thing, because no @controller in class
        //use spring to do the injection
        System.out.println(controller.hello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
