package Model;

public class Goalie extends Player{

    private Integer wins;

    public void setWins(Integer wins) { this.wins = wins; }
    public Integer getWins() { return wins; }

    public Goalie(String firstName, String lastName, Integer age, Integer wins){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setWins(wins);
    }

    public void printPlayer(){
        System.out.println("Surname: " + this.getFirstName()
                + "\nLast Name: " + this.getLastName()
                + "\nAge: " + this.getAge()
                + "\nHits: " + this.getWins());
    }
}
