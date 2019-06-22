
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String bottomUp = ":)";

        while (true) {
            if (characterString.length() % 2 == 0) {
                for (int i = 0; i <= (characterString.length() / 2); i++) {
                    bottomUp += ":)";
                }
            } else {
                characterString += " ";
                for (int i = 0; i <= (characterString.length() / 2); i++) {
                    bottomUp += ":)";
                }
            }
            bottomUp += ":)";

            break;
        }

        System.out.println(bottomUp);
        System.out.println(":) " + characterString + " :)");
        System.out.println(bottomUp);

    }
}
