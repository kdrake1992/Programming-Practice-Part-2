import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> notes;

    public PromissoryNote(){
        this.notes = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.notes.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        double debt = 0;
        if (this.notes.containsKey(whose)) {
                debt = this.notes.get(whose);
                return debt;
        }
        return 0;
    }
}
