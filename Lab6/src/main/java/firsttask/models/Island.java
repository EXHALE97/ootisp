package firsttask.models;

public class Island {

    private String name;

    public Island() { }

    public Island(String name) {
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
        return "Island - " + name;
    }
}
