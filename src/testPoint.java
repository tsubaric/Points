import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testPoint {
    Point tester;
    public void init()
    {
        tester = new Point(2.0,3.0);
    }
    @Test
    public void test_toString()
    {
        init();
        assertEquals(tester.toString(),"(2.0,3.0)");
    }

}

