package Model;

public class Defender extends Player{

    private Integer hits;

    public void setHits(Integer hits) { this.hits = hits; }
    public Integer getHits() { return hits; }

    public Defender(String firstName, String lastName, Integer age, Integer hits){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setHits(hits);
    }

    public void printPlayer(){
        System.out.println("Surname: " + this.getFirstName()
                            +"\n Last Name: " + this.getLastName()
                            +"\n Age: " + this.getAge()
                            +"\n Hits: " + this.getHits());
    }
}
