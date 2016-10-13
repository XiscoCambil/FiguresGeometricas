import javax.swing.*;
import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Texto extends Forma{

    private String texto;

    public Texto(String texto,Punto punto,Color color){
        this.texto = texto;
        setPunto(punto);
        setColor(color);
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void pintarForma(Graphics g) {
        g.setColor(getColor());
        g.drawString(getTexto(),getPunto().getX(),getPunto().getY());

    }
}
