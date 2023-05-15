package Collection;

import java.util.PriorityQueue;

public class Reklamation implements Comparable<Reklamation> {
    private String kunde;
    private String beschreibung;
    private String sla;
    private long zeitstempel;

    public Reklamation(String kunde, String beschreibung, String sla, long zeitstempel) {
        this.kunde = kunde;
        this.beschreibung = beschreibung;
        this.sla = sla;
        this.zeitstempel = zeitstempel;
    }

    public String getKunde() {
        return kunde;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getSla() {
        return sla;
    }

    public long getZeitstempel() {
        return zeitstempel;
    }

    @Override
    public int compareTo(Reklamation other) {
        if (this.sla.equals(other.sla)) {
            return Long.compare(this.zeitstempel, other.zeitstempel);
        } else if (this.sla.equals("Gold")) {
            return -1;
        } else if (other.sla.equals("Gold")) {
            return 1;
        } else if (this.sla.equals("Silber")) {
            return -1;
        } else if (other.sla.equals("Silber")) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Reklamation> queue = new PriorityQueue<>();

        // Beispielreklamationen
        Reklamation reklamation1 = new Reklamation("Kunde1", "Beschreibung1", "Bronze", System.currentTimeMillis());
        Reklamation reklamation2 = new Reklamation("Kunde2", "Beschreibung2", "Gold", System.currentTimeMillis());
        Reklamation reklamation3 = new Reklamation("Kunde3", "Beschreibung3", "Silber", System.currentTimeMillis());

        queue.add(reklamation1);
        queue.add(reklamation2);
        queue.add(reklamation3);

        // Reklamationen ausgeben
        while (!queue.isEmpty()) {
            Reklamation reklamation = queue.poll();
            System.out.println("Kunde: " + reklamation.getKunde());
            System.out.println("Beschreibung: " + reklamation.getBeschreibung());
            System.out.println("SLA: " + reklamation.getSla());
            System.out.println("Zeitstempel: " + reklamation.getZeitstempel());
            System.out.println();
        }
    }
}

