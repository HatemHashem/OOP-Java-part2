package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() {
    }
    public BulkTank getBulkTank(){
        return bulkTank;
    }
     public void setBulkTank(BulkTank tank){

             this.bulkTank = tank;

    }
    public void milk(Milkable milkable){
        Milkable cow=milkable;
        if(this.bulkTank==null){
            throw new IllegalStateException();
        }
        this.bulkTank.addToTank(cow.milk());

    }

}
