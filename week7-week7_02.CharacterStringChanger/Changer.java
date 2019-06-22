import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changeList;


    public  Changer() {
        this.changeList = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changeList.add(change);
    }

    public String change(String characterString) {
        String send = "";
        boolean check = false;

        for(int i = 0; i < characterString.length(); i++) {
            for (Change change : changeList) {
                check = false;
                if (characterString.charAt(i) == change.getFromCharacter()) {
                    send += change.getToCharacter();
                    check = true;
                    break;
                }
            }
            if (check == false) {
                send += characterString.charAt(i);
            }
            }
        return send;
    }
}
