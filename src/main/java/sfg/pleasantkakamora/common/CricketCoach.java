package sfg.pleasantkakamora.common;

//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) | new bean instance made with each injection
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define init method (demonstration purposes)
    @PostConstruct
    public void doMyStartup() {
        System.out.println("In startup: " + getClass().getSimpleName());
    }

    //define destroy method (demonstration purposes)
    @PreDestroy
    public void doMyCleanup() {
        System.out.println("In clean-up: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes >:[";
    }
}
