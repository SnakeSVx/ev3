package be.svx.ev3.config;

import be.svx.ev3.HelloSpring;
import be.svx.ev3.TestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Stijn
 * Date: 2/09/13
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class MainConfig {

    @Bean
    public HelloSpring helloSpring(){
        return new HelloSpring();
    }

}
