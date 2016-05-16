package ua.od.pindus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Statistics {

    private List<GameResult> results = new ArrayList<GameResult>();
    Date date;

    public void addResult(GameResult result) {
        results.add(result);
    }

    public void showWins(Player playerX, Player playerO) {
        int XVictories = 0, OVictories = 0;
        for (int i = 0; i < results.size(); i++) {
            GameResult tocheck = results.get(i);
            if (tocheck.getResult().equals("won")) {
                if (tocheck.getPlayer() == playerX)
                    XVictories++;
                else
                    OVictories++;
            }
        }
        System.out.println(playerX.toString() + " has won " + XVictories + " times.");
        System.out.println(playerO.toString() + " has won " + OVictories + " times.");
    }

    public void showLosses(Player playerX, Player playerO) {
        int XLosses = 0, OLosses = 0;
        for (int i = 0; i < results.size(); i++) {
            GameResult tocheck = results.get(i);
            if (tocheck.getResult().equals("won")) {
                if (tocheck.getPlayer() == playerX)
                    XLosses++;
                else
                    OLosses++;
            }
        }
        System.out.println(playerX.toString() + " has lost " + XLosses + " times.");
        System.out.println(playerO.toString() + " has lost " + OLosses + " times.");
    }

    public void resultsForDay() {
        for (int i = 0; i < results.size(); i++){
            GameResult tocheck = results.get(i);
            if (tocheck.getDay()==date.getDate())
                System.out.println(tocheck);
        }
    }
}
