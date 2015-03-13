package miguel.pucherin.com.pucherin;

import java.io.Serializable;

/**
 * Created by miguel on 12/03/2015.
 */
public class Player implements Serializable {

    private String player;
    private int points;

    public Player(String player, int points){
        this.player = player;
        this.points = points;
    }


    public String getPlayer() {
        return player;
    }

    public int getPoints() {
        return points;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}