package rocks.zipcode.assessment2.generics.shelter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.generics.Shelter;
import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Cat;
import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.function.Supplier;

/**
 * A `.remove` must be tested with an `.add` must be tested with a `.contains`
 */
public class ShelterAddRemoveContainsTest {
    @Test
    public void testPerson() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Person::new;
        Shelter<Person> shelter = new Shelter<>();

        // when
        test(numberOfPerson, supplier, shelter);
    }

    @Test
    public void testDog() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Dog::new;
        Shelter<Person> shelter = new Shelter<>();

        // when
        test(numberOfPerson, supplier, shelter);
    }

    @Test
    public void testCat() {
        // given
        int numberOfPerson = 10;
        Supplier<Ageable> supplier = Cat::new;
        Shelter<Person> shelter = new Shelter<>();

        // when
        test(numberOfPerson, supplier, shelter);
    }


    private void test(int numberOfElements, Supplier<Ageable> supplier, Shelter shelter) {
        for (int i = 0; i < numberOfElements; i++) {
            Ageable ageable = supplier.get();

            // then
            shelter.add(ageable);
            Assert.assertTrue(shelter.contains(ageable));

            // then
            shelter.remove(ageable);
            Assert.assertFalse(shelter.contains(ageable));
        }
    }
}
