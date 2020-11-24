package firsttask.models;

public class Mainland {

    private String name;

    public Mainland() { }

    public Mainland(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mainland - " + name;
    }
}