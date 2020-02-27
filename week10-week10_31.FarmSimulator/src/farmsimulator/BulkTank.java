package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;


    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }
    public double howMuchFreeSpace(){
        return this.capacity-this.volume;
    }
    public void addToTank(double amount){
        if((amount+this.volume)>=this.capacity){
            this.volume=this.capacity;
        }else {
            this.volume+=amount;
        }

    }
    public double getFromTank(double amount){
        if((this.volume-amount)<0){
            this.volume=0;
        }else {
            this.volume-=amount;
        }
        return this.volume;
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume())+"/"+Math.ceil(getCapacity());
    }
}
