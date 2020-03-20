package rocks.zipcode.quiz7.generics.ageable;


/**
 * @ATTENTION_TO_STUDENTS - You are forbidden from modifying this class.
 */
public abstract class Ageable {
    private int yearOfBirth;

    public Ageable() {
        this(Integer.MIN_VALUE);
    }

    public Ageable(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

}
