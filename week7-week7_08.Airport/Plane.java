import java.util.HashMap;

public class Plane {

    private HashMap<String, Integer> planes;

    public Plane() {
        this.planes = new HashMap<String, Integer>();
    }

    public void addPlane(String name, int cap) {
        this.planes.put(name, cap);
    }

    public String findPlane(String name) {

        if(planes.containsKey(name)) {
            return name + " (" + this.planes.get(name) + " ppl)";
        }
        else {
            return "Can't find plane";
        }
    }

    public void printAllPlanes() {
        for (String key : this.planes.keySet()) {
            System.out.println(key + " (" + this.planes.get(key) + " ppl)");
        }
    }

}
