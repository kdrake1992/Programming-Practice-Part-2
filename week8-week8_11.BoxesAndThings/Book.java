public class Book implements ToBeStored{

    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getWriter() {
        return this.writer;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.getWriter() + ": " + this.getName();
    }
}
