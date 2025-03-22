package sfg.pleasantkakamora.config;

/**
 * Created config folder and this config class to demonstrate "manual" bean setup.
 * "manual" bean setup refers to setting up with the @Bean annotation rather than @Component
 * This tactic would be used to make third party functionality available to existing applications where you don't have the source code.
 * This class works to manually construct the SwimCoach class as a bean
 * Otherwise, the application can't use SwimCoach.
 * Note: we require the @Configuration annotation and @Bean annotation
 * Note: Bean id defaults to method name used for construction ("swimCoach")
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sfg.pleasantkakamora.common.Coach;
import sfg.pleasantkakamora.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("aquatic") //"aquatic" defines custom bean id, used in controller with @Qualifier
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
