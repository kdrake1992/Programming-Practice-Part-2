public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;

    }

    public char getFromCharacter() {
        return this.fromCharacter;
    }

    public char getToCharacter() {
        return this.toCharacter;
    }

    public String change(String characterString) {
        String send = "";

        for(int i = 0; i < characterString.length(); i++) {
            if(characterString.charAt(i) != fromCharacter) {
                send += characterString.charAt(i);
            }
            else {
                send += this.toCharacter;
            }
        }
        return send;
    }
}
