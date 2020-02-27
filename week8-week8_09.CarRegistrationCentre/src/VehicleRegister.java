import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        for (RegistrationPlate registrationPlateOwner : owners.keySet()) {
            if (registrationPlateOwner.equals(plate) && owners.get(registrationPlateOwner).equals(owner)) {
                return false;
            }
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (owners == null) {
            return "";
        }
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);

            return true;
        }
        return false;
    }
    public void printRegistrationPlates(){
        for(RegistrationPlate ownerPlate:owners.keySet()){
            System.out.println(ownerPlate);
        }
    }
    public void printOwners(){
        ArrayList<String>ownersNoDup=new ArrayList<String>();
        for(String owner:this.owners.values()){
            if(!ownersNoDup.contains(owner)){
                ownersNoDup.add(owner);
            }
        }
        for(String owner:ownersNoDup){
            System.out.println(owner);
        }

    }
}
