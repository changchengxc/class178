package selenium1012;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import selenium1012.priority.HighPriority;

/**
 * Unit test for simple App.
 */
//@RunWith(Theories.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("sdfdsf");
        assertTrue( true );
    }

    @Category({HighPriority.class})
    @Test
    public void shouldAnswerWithTrue2()
    {
        System.out.println("sdfdsf2222");
        assertTrue( true );
    }

}
