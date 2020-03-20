package rocks.zipcode.assessment2.collections.inventory;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Inventory;

import java.util.Arrays;

public class AddItemToInventroy {

    @Test
    public void test0() {
        test("");
    }

    @Test
    public void test1() {
        test("Lamp", "Lamp", "Shade", "Lightbulb");
    }

    @Test
    public void test2() {
        test("Lamp", "Lamp", "Shade", "Lightbulb", "Lightbulb");
    }

    @Test
    public void test3() {
        test("Lamp", "Lamp", "Shade", "Shade");
    }

    private void test(String... itemsToAddToInventory) {
        Inventory inventory = new Inventory();
        for(String item : itemsToAddToInventory) {
            int preAddQuantity = inventory.getItemQuantity(item);
            int postAddQuantity = preAddQuantity + 1;
            int expected = postAddQuantity;
            inventory.addItemToInventory(item);
            int actual = inventory.getItemQuantity(item);

            Assert.assertEquals(expected, actual);
        }
    }
}
