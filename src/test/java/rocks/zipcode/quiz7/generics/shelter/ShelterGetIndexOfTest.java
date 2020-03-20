package rocks.zipcode.quiz7.generics.shelter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz7.generics.Shelter;
import rocks.zipcode.quiz7.generics.ageable.Ageable;
import rocks.zipcode.quiz7.generics.ageable.Cat;
import rocks.zipcode.quiz7.generics.ageable.Dog;
import rocks.zipcode.quiz7.generics.ageable.Person;

import java.util.function.Supplier;

public class ShelterGetIndexOfTest {
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
        for (int expected = 0; expected < numberOfElements; expected++) {
            Ageable ageable = supplier.get();
            shelter.add(ageable);
            int actual = shelter.getIndexOf(ageable);

            // then
            Assert.assertEquals(expected, actual);
        }
    }
}
