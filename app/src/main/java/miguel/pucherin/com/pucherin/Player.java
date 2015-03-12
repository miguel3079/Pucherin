package miguel.pucherin.com.pucherin;

import java.io.Serializable;

/**
 * Created by miguel on 12/03/2015.
 */
public class Player implements Serializable {

    private int imagen;
    private String player;
    private int points;

    public Player(String player, int points){
        this.player = player;
        this.points = points;
    }

    public int getImagen() {
        return imagen;
    }

    public String getPlayer() {
        return player;
    }

    public int getPoints() {
        return points;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}