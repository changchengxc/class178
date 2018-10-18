package selenium1012;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class lalaTest {
    @Theory
    public void testLogin(@TestedOn(ints = {0,2,4}) int param) {
        System.out.println(param);
    }
}
