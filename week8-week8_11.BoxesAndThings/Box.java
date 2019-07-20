import java.util.ArrayList;

public class Box implements ToBeStored {

    private ArrayList<ToBeStored> boxes;
    private double maxWeight;

    public Box(double maxWeight) {
        this.boxes = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored object) {
        if((this.weight() + object.weight()) <= this.maxWeight){
            this.boxes.add(object);
        }
        else {
            System.out.println("Object can not be added.");
        }
    }

    @Override
    public double weight() {
        double weight = 0.0;

        if (this.boxes == null) {
            return 0;
        }

        for(ToBeStored t : this.boxes) {
            weight += t.weight();
        }

        return weight;
    }

    @Override
    public String toString() {

        int objects = this.boxes.size();
        double weight = this.weight();

        return "Box: " + objects + " things," + " total weight " + weight + " kg";

    }
}

