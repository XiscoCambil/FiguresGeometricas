import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Circulo extends Area {

    public Circulo(Punto punto, int radio, Color color, boolean respuesta) {
        setColor(color);
        setWidth(radio);
        setHeight(radio);
        setRellenar(respuesta);
        setPunto(punto);
    }

    @Override
    public void pintarForma(Graphics g) {
        g.setColor(getColor());
        if (isRellenar()) {
            g.fillOval(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        } else {
            g.drawOval(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }
    }
}
