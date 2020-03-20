package rocks.zipcode.assessment2.objectorientation.animals.animal;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;
import rocks.zipcode.assessment2.objectorientation.animals.Animal;

/**
 * @author leon on 29/11/2018.
 */
public class AnimalConstructorTest {

    @Test
    public void nullaryConstructor() {
        // Given
        Person expectedOwner = new Person();
        Address expectedAddress = expectedOwner.getAddress();
        Long expectedId = null;

        // when
        Animal animal = new Animal();
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();
        Long actualId = animal.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedAddress, actualAddress);
    }

    @Test
    public void nonNullaryConstructor() {
        // Given
        Person expectedOwner = new Person(null, null, new Address());
        Address expectedAddress = expectedOwner.getAddress();
        Long expectedId = null;

        // when
        Animal animal = new Animal(expectedId, expectedOwner);
        Person actualOwner = animal.getOwner();
        Address actualAddress = animal.getAddress();
        Long actualId = animal.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedAddress, actualAddress);
    }
}
