import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;


    public Suitcase(int weight) {
        this.maxWeight = weight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if(thing.getWeight() + this.totalWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public void printThings() {
        for (Thing t : this.things) {
                System.out.println(t);
        }
    }

    public int totalWeight() {
        int weight = 0;

        for (Thing t : this.things) {
            weight += t.getWeight();
        }

        return weight;
    }

    public Thing heaviestThing() {
        int heaviest = 0;
        Thing heaviestThing = new Thing("null", 0);
        if (things.isEmpty()) {
            return null;
        }
        else {
            for (Thing thing : this.things) {
                if (thing.getWeight() > heaviest) {
                    heaviest = thing.getWeight();
                    heaviestThing = thing;
                }
            }
        }
            return heaviestThing;
    }

    public String toString() {
        int numberOfThings = 0;
        int totalWeight = 0;

        for(Thing t : this.things){
            numberOfThings++;
            totalWeight += t.getWeight();
        }
        if(numberOfThings == 0){
            return "empty (0 kg)";
        }
        else if(numberOfThings == 1){
            return numberOfThings + " thing (" + totalWeight + " kg)";
        }
        else{
            return numberOfThings + " things (" + totalWeight + " kg)";
        }
    }
}
