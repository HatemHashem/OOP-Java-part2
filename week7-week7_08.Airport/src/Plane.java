public class Plane {
   private String planeID;
   private int planecapacity;
   private String departureCode;
   private String destinationCode;

    public int getPlanecapacity() {
        return planecapacity;
    }

    public void setPlaneID(String planeID) {
        this.planeID = planeID;
    }

    public String getPlaneID() {

        return planeID;
    }

    public void setPlanecapacity(int planecapacity) {
        this.planecapacity = planecapacity;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }


    public String toString() {

        return planeID+" ("+planecapacity+" ppl) "+"("+departureCode+"-"+destinationCode+")";
    }
}
