package ua.od.pindus;

import java.util.Date;

public class GameResult {

    private Player player;
    private String result;
    private Date date;
    private int day, month, year;


    public GameResult(Player player, String result) {
        this.player = player;
        this.result = result;
        this.date = new Date();
        day = date.getDay();
        month = date.getMonth();
    }

    public String getResult(){
        return this.result;
    }

    public Date getDate(){
        return this.date;
    }

    public Player getPlayer(){
        return player;
    }
    public int getDay(){
        return day;
    }

    public String toString(){
        return player + " has " + result + ".   Date: " + date ;
    }
}

