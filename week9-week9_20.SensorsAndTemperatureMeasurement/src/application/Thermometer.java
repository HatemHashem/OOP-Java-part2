package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean state;
    private int measure;


    public int getMeasure() {
        return measure;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        this.state=true;

    }

    @Override
    public void off() {
        this.state=false;
    }

    @Override
    public int measure() {
        if(isOn()) {
            Random random=new Random();
             this.measure=random.nextInt((30+30)+1)-30;
            return measure;

        }else {
            throw new IllegalStateException("the thermometer is off");
        }

    }

}
