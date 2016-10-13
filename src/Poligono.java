import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Poligono extends Forma implements Relleno {

    private int[] varX = new int[3];
    private int[] varY = new int[3];
    private int nPuntas;
    private boolean rellenar;

    public Poligono(Punto p1, Punto p2, Punto p3, int puntas, Color color, boolean rellenar) {
        varX[0] = p1.getX();
        varX[1] = p2.getX();
        varX[2] = p3.getX();
        varY[0] = p1.getY();
        varY[1] = p2.getY();
        varY[2] = p3.getY();
        nPuntas = puntas;
        setColor(color);
        this.rellenar = rellenar;
    }

    @Override
    public void pintarForma(Graphics g) {
       Rellenar(rellenar,g);
    }

    @Override
    public void Rellenar(boolean hayRelleno, Graphics g) {
        g.setColor(getColor());
        if (rellenar) {
            g.fillPolygon(varX, varY, nPuntas);
        } else {
            g.drawPolyline(varX, varY, nPuntas);
        }

    }
}
