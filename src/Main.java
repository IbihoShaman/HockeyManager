import Model.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        final PlayerManager playerManager = new PlayerManager();
        ArrayList<Player> goalieList = new ArrayList<Player>();

        Player forward1 = playerManager.createForward("John","Smith", 25, 15);
        Player defender1 = playerManager.createDefender("Adam", "Taylor", 22, 10);

        //forward1.printPlayer();
        //defender1.printPlayer();

        goalieList.add(playerManager.createGoalie("Mister", "Goalkeeper", 20, 5));
        goalieList.add(playerManager.createGoalie("Sir", "Goalie", 30, 7));
        goalieList.add(playerManager.createGoalie("Lord", "Goaldefender", 27, 2));

        playerManager.printYoungestGoalie(goalieList);
    }
}
