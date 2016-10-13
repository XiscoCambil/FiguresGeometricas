import java.awt.*;
import java.util.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public abstract class Forma implements PintarFormaGrafica {

    private Color color = Color.black;
    private Punto punto;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public void pintarForma(Graphics g){

    }
}



