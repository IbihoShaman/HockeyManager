package Logic;

import Model.Defender;
import Model.Forward;
import Model.Goalie;
import Model.Player;

import java.util.ArrayList;

public class PlayerManager {
    public Forward createForward(String firstName, String lastName, Integer age, Integer goals){
        return new Forward(firstName, lastName, age, goals);
    }
    public Defender createDefender(String firstName, String lastName, Integer age, Integer hits){
        return new Defender(firstName, lastName, age, hits);
    }
    public Goalie createGoalie(String firstName, String lastName, Integer age, Integer wins){
        return new Goalie(firstName, lastName, age, wins);
    }

    public void printYoungestGoalie(ArrayList<Player> playerList){
        Player youngestGoalie = null;
        //goes through the playerList and always saves the result if the age is smaller than the current result
        for (Player player : playerList) {
            if (youngestGoalie == null || youngestGoalie.getAge() > player.getAge()) {
                youngestGoalie = player;
            }
        }
        if(youngestGoalie != null){
            System.out.println("The youngest goalie is:"
                    + "\n Surname: " + youngestGoalie.getFirstName()
                    + "\n Last Name: " + youngestGoalie.getLastName()
                    + "\n Age: " + youngestGoalie.getAge());
        } else System.out.println("There are no goalies in the list");
    }
}
