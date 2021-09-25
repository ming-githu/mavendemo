package lin.com;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public static void main(String[] args) {

        Demo d = new Demo();
        String ret = d.say("xiaolin");
        Assert.assertEquals("hello xiaolin", ret);

    }
}
