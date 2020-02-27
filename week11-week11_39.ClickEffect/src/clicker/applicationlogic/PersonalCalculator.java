package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {
    private int value;

    @Override
    public int giveValue() {
        return value;
    }

    @Override
    public void increase() {
        this.value++;

    }
    public void play(){
        System.out.println("now playing");
    }

    public PersonalCalculator() {
    }
}
