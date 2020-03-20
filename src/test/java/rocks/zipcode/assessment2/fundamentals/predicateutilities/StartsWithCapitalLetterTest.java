package rocks.zipcode.assessment2.fundamentals.predicateutilities;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

public class StartsWithCapitalLetterTest {
    @Test
    public void test1() {
        test("The", true);
    }

    @Test
    public void test2() {
        test("quick", false);
    }

    @Test
    public void test3() {
        test("%^&*", false);
    }

    @Test
    public void test4() {
        test("fox", false);
    }

    @Test
    public void test5() {
        test("Jumps", true);
    }


    private void test(String value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.startsWithCapitalLetter(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
