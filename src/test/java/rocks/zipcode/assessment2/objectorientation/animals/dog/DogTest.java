package rocks.zipcode.assessment2.objectorientation.animals.dog;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.animals.Animal;
import rocks.zipcode.assessment2.objectorientation.animals.Dog;
import rocks.zipcode.assessment2.objectorientation.animals.Woofer;

/**
 * @author leon on 29/11/2018.
 */
public class DogTest {
    @Test
    public void testInheritance() {
        Animal dog = (Animal)(Object)new Dog();

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Woofer dog = (Woofer)(Object)new Dog();

        Assert.assertTrue(dog instanceof Woofer);
    }

    @Test
    public void testSpeak() {
        // given
        Dog dog = new Dog();
        String expected = "Woof!\nWoof!";

        // when
        String actual = dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }
}
