package rocks.zipcode.assessment2.objectorientation.person;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 28/11/2018.
 */
public class SetAddressTest {
    @Test
    public void test1() {
        // given
        Person person = new Person();
        Address expected = new Address();
        
        // when
        person.setAddress(expected);
        Address actual = person.getAddress(); 
        
        // then
        Assert.assertEquals(expected, actual);
    }
}
