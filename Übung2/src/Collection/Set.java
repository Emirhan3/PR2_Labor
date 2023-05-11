package Collection;

import java.util.*;

public class Set {
    public static void main(String[] args) {
    	TreeSet<Student> students = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.print("Geben sie die Studenten ID ein (oder geben sie 'beenden' ein um das Programm zu beenden): ");
            String id = input.nextLine().trim();
            
            if (id.equalsIgnoreCase("beenden")) {
                break;
            }
            
            System.out.print("Geben sie das Fach der Prüfung ein: ");
            String pruefung = input.nextLine().trim();
            
            Student student = new Student(id, pruefung);
            
            if (students.contains(student)) {
                System.out.println("Der Student ist bereits für diese Prüfung eingetragen.");
            } else {
                students.add(student);
            }
        }
        
        System.out.println("Eingetragene Studenten:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private String id;
    private String pruefung;
    
    public Student(String id, String pruefung) {
        this.id = id;
        this.pruefung = pruefung;
    }
    
    public String getId() {
        return id;
    }
    
    public String getPruefung() {
        return pruefung;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        
        if (!(o instanceof Student)) {
            return false;
        }
        
        Student s = (Student) o;
        return id.equals(s.id) && pruefung.equals(s.pruefung);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, pruefung);
    }
    
    @Override
    public int compareTo(Student s) {
        return id.compareTo(s.id);
    }
    
    @Override
    public String toString() {
        return "Student mit der id " + id + " ist eingetragen zur Prüfung: " + pruefung;
    }
}

