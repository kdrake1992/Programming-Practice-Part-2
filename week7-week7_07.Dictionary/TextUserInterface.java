import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        String choice = "";
        String fin = "";
        String trans = "";
        System.out.println("Statement:");
        System.out.println("  quit - quit the text user interface?\n");


        while(true) {
            System.out.print("Statement: ");
            choice = this.reader.nextLine();

            if(choice.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }

            else if(choice.equals("add")) {
                System.out.print("In Finnish: ");
                fin = this.reader.nextLine();
                System.out.print("Translation: ");
                trans = this.reader.nextLine();
                dictionary.add(fin, trans);
            }

            else if(choice.equals("translate")) {
                System.out.print("Give a word: ");
                fin = this.reader.nextLine();
                System.out.print("Translation: " + dictionary.translate(fin));
            }

            else {
                System.out.println("Unknown statement\n");
            }
            choice = "";
        }

    }
}
