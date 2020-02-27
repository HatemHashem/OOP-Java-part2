public class CivilService implements NationalService {
    private int daysLeft;
    public CivilService() {
        daysLeft=362;
    }
    public int getDaysLeft(){
     return this.daysLeft;
    }
    public void work(){
        if(this.daysLeft>0) {
            this.daysLeft--;
        }
    }
}
