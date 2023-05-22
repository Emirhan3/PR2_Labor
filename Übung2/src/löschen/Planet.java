package löschen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Planet implements Comparable<Planet> {
    private String name;
    private double durchmesser;
    private double entfernungZurSonne;

    public Planet(String name, double durchmesser, double entfernungZurSonne) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.entfernungZurSonne = entfernungZurSonne;
    }

    public String getName() {
        return name;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public double getEntfernungZurSonne() {
        return entfernungZurSonne;
    }

    @Override
    public int compareTo(Planet o) {
    	System.out.print(this.name.compareTo(o.getName()));
        return this.name.compareTo(o.getName());
    }

    public static Comparator<Planet> durchmesserComparator = new Comparator<Planet>() {
        @Override
        public int compare(Planet o1, Planet o2) {
        	System.out.print(Double.compare(o1.getDurchmesser(), o2.getDurchmesser()));
            return Double.compare(o1.getDurchmesser(), o2.getDurchmesser());
        }
    };

    public static Comparator<Planet> entfernungZurSonneComparator = new Comparator<Planet>() {
        @Override
        public int compare(Planet o1, Planet o2) {
        	System.out.print(Double.compare(o1.getEntfernungZurSonne(), o2.getEntfernungZurSonne()));
            return Double.compare(o1.getEntfernungZurSonne(), o2.getEntfernungZurSonne());
        }
    };

    public static void main(String[] args) {
        List<Planet> planeten = new ArrayList<>();
        planeten.add(new Planet("Mars", 6779, 227.9));
        planeten.add(new Planet("Venus", 12104, 108.2));
        planeten.add(new Planet("Jupiter", 139822, 778.5));
        planeten.add(new Planet("Merkur", 4879, 57.9));
        planeten.add(new Planet("Saturn", 12334, 333.5));
        planeten.add(new Planet("Pluto", 123334, 2668.5));
        planeten.add(new Planet("Erde", 4000, 20.3));

        planeten.sort(null); // sortiere nach Name mit natürlicher Sortierung
        Iterator<Planet> nameIterator = planeten.iterator();
        System.out.println("Sortiert nach Name:");
        while (nameIterator.hasNext()) {
            Planet planet = nameIterator.next();
            System.out.println(planet.getName());
        }

        planeten.sort(durchmesserComparator); // sortiere nach Durchmesser mit benutzerdefinierter Sortierung
        Iterator<Planet> durchmesserIterator = planeten.iterator();
        System.out.println("\nSortiert nach Durchmesser:");
        while (durchmesserIterator.hasNext()) {
            Planet planet = durchmesserIterator.next();
            System.out.println(planet.getName() + " - " + planet.getDurchmesser());
        }

        planeten.sort(entfernungZurSonneComparator); // sortiere nach Entfernung zur Sonne mit benutzerdefinierter Sortierung
        Iterator<Planet> entfernungIterator = planeten.iterator();
        System.out.println("\nSortiert nach Entfernung zur Sonne:");
        while (entfernungIterator.hasNext()) {
            Planet planet = entfernungIterator.next();
            System.out.println(planet.getName() + " - " + planet.getEntfernungZurSonne());
        }
    }
}


