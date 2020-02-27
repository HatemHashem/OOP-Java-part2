import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Airport {
    private ArrayList<Plane> planes;


    public Airport() {
        planes = new ArrayList<Plane>();
    }

    public void addAirplane(Plane plane) {
        planes.add(plane);
    }


    public void printFlights() {

        for (Plane plane : planes) {
            System.out.println(plane);
        }

    }

    public void printPlanes() {
        HashMap<String, Integer> plane = new HashMap<String, Integer>();
        for (Plane plane1 : planes) {
            plane.put(plane1.getPlaneID(), plane1.getPlanecapacity());
        }
        for (String planeInHahsMap : plane.keySet()) {
            System.out.println(planeInHahsMap + " (" + plane.get(planeInHahsMap) + " ppl)");
        }


    }

    public void printPlaneInfo(String planeID) {
        for (Plane plane : planes) {
            if (plane.getPlaneID().equals(planeID)) {
                System.out.println(plane.getPlaneID() + " (" + plane.getPlanecapacity() + " ppl)");
                break;
            }
        }

    }

    public void addFlight(String planeID, Scanner input) {
        for (Plane plane : planes) {
            if (plane.getPlaneID().equals(planeID)) {
                System.out.print("Give departure airport code: ");
                if (plane.getDepartureCode() != null) {
                    Plane tempPlane = new Plane();
                    tempPlane.setPlaneID(planeID);
                    tempPlane.setPlanecapacity(plane.getPlanecapacity());
                    tempPlane.setDepartureCode(input.nextLine());
                    System.out.print("Give destination airport code: ");
                    tempPlane.setDestinationCode(input.nextLine());
                    addAirplane(tempPlane);
                    break;
                } else {
                    plane.setDepartureCode(input.nextLine());
                    System.out.print("Give destination airport code: ");
                    plane.setDestinationCode(input.nextLine());
                }
            }
        }
    }

    public void airportPanel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Airport panel\n" +
                "--------------------\n");
        String userInput = "";
        while (true) {
            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit");
            System.out.print(">");
            userInput = input.nextLine();
            if (userInput.equals("1")) {
                Plane planeObj = new Plane();
                System.out.print("Give plane ID: ");
                planeObj.setPlaneID(input.nextLine());
                System.out.print("Give plane capacity: ");
                planeObj.setPlanecapacity(Integer.parseInt(input.nextLine()));
                addAirplane(planeObj);


            } else if (userInput.equals("2")) {
                System.out.print("Give plane ID: ");
                addFlight(input.nextLine(), input);

            } else if (userInput.equals("x")) {
                break;

            }


        }
        System.out.println();
        flightService(input);
    }

    public void flightService(Scanner input) {
        System.out.println("Flight service\n" +
                "------------\n" +
                "\n" +
                "Choose operation:");
        String userInput = "";
        while (true) {
            System.out.println(
                    "[1] Print planes\n" +
                            "[2] Print flights\n" +
                            "[3] Print plane info\n" +
                            "[x] Quit");
            System.out.print(">");
            userInput = input.nextLine();
            if (userInput.equals("1")) {
                printPlanes();
            } else if (userInput.equals("2")) {
                printFlights();
            } else if (userInput.equals("3")) {
                System.out.print("Give plane ID: ");
                printPlaneInfo(input.nextLine());
            } else if (userInput.equals("x")) {
                break;
            }

        }


    }

}


