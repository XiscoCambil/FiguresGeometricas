import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Cuadrado extends Area {

    public Cuadrado(Punto punto, int radio, Color color, boolean respuesta){
        setColor(color);
        setWidth(radio);
        setHeight(radio);
        setRellenar(respuesta);
        setPunto(punto);
    }

    @Override
    public void pintarForma(Graphics g) {
        g.setColor(getColor());
        if(isRellenar()){
            g.fillRect(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }else {
            g.drawRect(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }
    }
}
