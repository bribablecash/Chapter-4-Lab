package AthleteProblem;

public class TennisTeam
{
    public static void main() {
    
        Team acalanes = new Team("Acalanes Tennis Team", 18);
        
        Athlete joe = new Athlete("Joe", 16);
        acalanes.addAthlete(joe,0);
        System.out.println(acalanes);
    }
}