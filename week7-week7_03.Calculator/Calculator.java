public class Calculator {

    private Reader reader;
    private int count;

    public Calculator() {
        this.reader = new Reader();
        this.count = 0;
    }


    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum(){
        int first;
        int second;

        System.out.print("value1: ");
        first = reader.readInteger();

        System.out.print("value1: ");
        second = reader.readInteger();

        System.out.println("sum of the values: " + (first+second));

        count++;

    }

    private void difference() {
        int first;
        int second;

        System.out.print("value1: ");
        first = reader.readInteger();

        System.out.print("value1: ");
        second = reader.readInteger();

        System.out.println("difference of the values: " + (first - second));
        count++;

    }

    private void product() {
        int first;
        int second;

        System.out.print("value1: ");
        first = reader.readInteger();

        System.out.print("value1: ");
        second = reader.readInteger();

        System.out.println("product of the values: " + (first * second));
        count++;

    }

    private void statistics() {
        System.out.println("Calculations done " + this.count);
    }

}
