package Model;

public abstract class Player {

    private String firstName;
    private String lastName;
    private Integer age;

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(Integer age) { this.age = age; }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public Integer getAge() { return this.age; }

    // implemented differently in every child class
    public abstract void printPlayer();
}
