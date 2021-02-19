package dk.easj.anbo.recyclerviewbeerexample;

import java.io.Serializable;

public class Beer implements Serializable {
    private int id;
    private String name;
    private double abv; // alcohol by volume

    public static final Beer[] beers = new Beer[]{
            new Beer(1, "Carlsberg", 4.6),
            new Beer(2, "Tuborg", 4.6),
            new Beer(3, "Singha", 5.0),
            new Beer(4, "Heineken", 5.0)
    };

    public Beer() {
    }

    public Beer(int id, String name, double abv) {
        this.id = id;
        this.name = name;
        this.abv = abv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + abv;
    }
}
