package sfg.pleasantkakamora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//code for explicitly naming packages that should be scanned
//       (scanBasePackages = {
//                "sfg.pleasantkakamora",
//dir now deleted  "com.luv2code.util"})

public class PleasantKakamoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(PleasantKakamoraApplication.class, args);
    }

}
