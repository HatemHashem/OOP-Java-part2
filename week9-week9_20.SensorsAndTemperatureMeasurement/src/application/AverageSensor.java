package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
   private ArrayList<Sensor>sensors;
   private List<Integer>readings=new ArrayList<Integer>();


    public AverageSensor() {
        sensors=new ArrayList<Sensor>();
    }

    @Override
    public boolean isOn() {
        for(Sensor currentSensor:sensors){
            if(currentSensor.isOn()==false){
                return false;
            }

        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor currentSensor:sensors){
            currentSensor.on();

        }

    }

    @Override
    public void off() {
        for(Sensor currentSensor:sensors){
            if(currentSensor.isOn()==false){
                return;
            }

        }
        sensors.get(0).off();

    }

    @Override
    public int measure() {
        if(isOn()==false||sensors.size()==0){
            throw new  IllegalStateException("ww");
        }
        int avg=0;

        for(Sensor currentSensor:sensors){
            avg+=currentSensor.measure();

        }
        avg/=sensors.size();
        readings.add(avg);
        return avg;
    }
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    public List<Integer> readings(){

        return readings;
    }

}
