package be.svx.ev3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Stijn
 * Date: 2/09/13
 * Time: 18:34
 * To change this template use File | Settings | File Templates.
 */
@Component
public class HelloSpring {

    @Autowired
    private TestComponent testComponent;

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("be.svx.ev3"); // Use annotated beans from the specified package

        HelloSpring main = ctx.getBean(HelloSpring.class);
        System.out.println(main.getTestComponent().getTest());
    }

    public HelloSpring() {
    }

    public HelloSpring(TestComponent testComponent) {
        this.testComponent = testComponent;
    }

    public TestComponent getTestComponent() {
        return testComponent;
    }
}
