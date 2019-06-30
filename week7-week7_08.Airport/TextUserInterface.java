import java.util.Scanner;

public class TextUserInterface {

    private Plane planes;
    private Flight flights;
    private Scanner reader;

    public TextUserInterface() {
        this.reader = new Scanner(System.in);
        this.planes = new Plane();
        this.flights = new Flight();

    }

//start program
    public void airportPanel() {

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String input1 = this.reader.nextLine();

//add plane
            if (input1.equals("1")) {
                System.out.print("Give plane ID: ");
                input1 = this.reader.nextLine();
                System.out.print("Give plane capacity: ");
                int cap = Integer.parseInt(reader.nextLine());
                planes.addPlane(input1, cap);
            }

//add flight
            else if (input1.equals("2")) {
                System.out.print("Give plane ID: ");
                input1 = this.reader.nextLine();
                System.out.print("Give departure airport code: ");
                String input2 = this.reader.nextLine();
                System.out.print("Give destination airport code: ");
                String input3 = this.reader.nextLine();
                flights.addFlight(input1, input2, input3);

            }

// exit
            else if (input1.equals("x")) {
                break;
            }

//invalid command
            else {
                System.out.println("Invalid command. Try again.");
            }
        }
    }

    public void flightService() {

        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String input1 = this.reader.nextLine();

 //print planes
            if (input1.equals("1")) {
                planes.printAllPlanes();
            }

//print planes
            else if (input1.equals("2")) {
                flights.printAllFlights(planes);
            }

//find a plane
            else if (input1.equals("3")) {
                System.out.print("Give plane ID: ");
                input1 = this.reader.nextLine();
                System.out.println(planes.findPlane(input1));
            }

 //exit
            else if (input1.equals("x")) {
                break;
            }

//invalid command
            else {
                System.out.println("Invalid command. Try again.");
            }
        }
    }
}
