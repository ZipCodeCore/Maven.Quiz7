package rocks.zipcode.assessment2.generics.shelter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.generics.Shelter;
import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Cat;
import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.generics.ageable.Person;

public class ShelterGetTest {

    @Test
    public void testPerson() {
        // given
        Shelter shelter = new Shelter();
        Ageable ageable = new Person();

        // when
        test(shelter, ageable);
    }

    @Test
    public void testDog() {
        // given
        Shelter shelter = new Shelter();
        Ageable ageable = new Dog();

        // when
        test(shelter, ageable);
    }


    @Test
    public void testCat() {
        // given
        Shelter shelter = new Shelter();
        Ageable ageable = new Cat();

        // when
        test(shelter, ageable);
    }

    private void test(Shelter shelter, Ageable expected) {
        shelter.add(expected);
        Ageable actual = (Ageable) shelter.get(0);

        // then
        Assert.assertEquals(expected, actual);
    }
}
