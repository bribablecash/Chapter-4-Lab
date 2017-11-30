package AthleteProblem;


/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String nm, int a)
    {
        // initialise instance variables
        this.name = nm;
        this.age = a;
    }

    public String toString() {
    
        return "This athlete is named: " + this.name;
    }
}
