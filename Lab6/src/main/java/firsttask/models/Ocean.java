package firsttask.models;

public class Ocean {

    private String name;

    public Ocean() { }

    public Ocean(String name) {
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
        return "Ocean - " + name;
    }
}