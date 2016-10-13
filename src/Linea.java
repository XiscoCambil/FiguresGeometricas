import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Linea extends Forma implements PintarFormaGrafica{

    private Punto punto2;

    public Linea(Punto punto1,Punto punto2,Color color){
        setColor(color);
        setPunto(punto1);
        this.punto2 = punto2;
    }

    @Override
    public void pintarForma(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getPunto().getX(),getPunto().getY(),punto2.getX(),punto2.getY());

    }
}
