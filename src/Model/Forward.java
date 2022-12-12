package Model;

public class Forward extends Player{

    private Integer goals;

    public void setGoals(Integer goals) { this.goals = goals; }
    public Integer getGoals() { return goals; }

    public Forward(String firstName, String lastName, Integer age, Integer goals){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setGoals(goals);
    }

    public void printPlayer(){
        System.out.println("Surname: " + this.getFirstName()
                + "\nLast Name: " + this.getLastName()
                + "\nAge: " + this.getAge()
                + "\nHits: " + this.getGoals());
    }
}
