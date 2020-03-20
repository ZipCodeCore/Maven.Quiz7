package rocks.zipcode.assessment2.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;

/**
 * @author leon on 28/11/2018.
 */
public class SetStateTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "Pennsylvania";

        // when
        address.setState(expected);
        String actual = address.getState();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "Maryland";

        // when
        address.setState(expected);
        String actual = address.getState();

        // then
        Assert.assertEquals(expected, actual);
    }
}
