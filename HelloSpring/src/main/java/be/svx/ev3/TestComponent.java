package be.svx.ev3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Stijn
 * Date: 2/09/13
 * Time: 18:36
 * To change this template use File | Settings | File Templates.
 */
@Component
public class TestComponent {

    @Autowired
    private TestComponent2 testComponent2;

    private String test = "Hello Spring";

    public TestComponent() {
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public TestComponent2 getComponent2() {
        return testComponent2;
    }

    public void setComponent2(TestComponent2 component2) {
        this.testComponent2 = component2;
    }
}
