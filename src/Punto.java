import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Punto extends Forma{
    private int x,y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    @Override
    public void pintarForma(Graphics g) {
        g.setColor(getColor());
        g.fillOval(x,y,5,5);
    }
}
