package firsttask.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Planet {

    private String name;
    private List<Mainland> mainlands = new ArrayList<>();
    private List<Island> islands = new ArrayList<>();
    private List<Ocean> oceans = new ArrayList<>();

    public Planet() { }

    public Planet(String name) {
        this.name = name;
    }

    public void printMainland(List<Mainland> mainlands) {
        for (Mainland mainland : mainlands) {
            System.out.println(mainland.getName());
        }
    }

    public void printName() {
        System.out.println(name);
    }

    public int mainlandCount(List<Mainland> mainlands) {
        System.out.println("Count of mainlands: " + mainlands.size());
        return mainlands.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mainland> getMainland() {
        return mainlands;
    }

    public void setMainland(Mainland... args) {
        this.mainlands.addAll(Arrays.asList(args));
    }

    public List<Island> getIsland() {
        return islands;
    }

    public void setIsland(Island island) {
        this.islands.add(island);
    }

    public List<Ocean> getOceans() {
        return oceans;
    }

    public void setOceans(Ocean ocean) {
        this.oceans.add(ocean);
    }
}