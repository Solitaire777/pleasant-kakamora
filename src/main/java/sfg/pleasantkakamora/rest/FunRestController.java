package sfg.pleasantkakamora.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that returns "hello world"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day!";
    }


}
