import java.awt.*;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Rectangulo extends Area  implements Relleno{

   public Rectangulo(Punto punto,int width, int height, Color color, boolean respuesta){
       setColor(color);
       setWidth(width);
       setHeight(height);
       setRellenar(respuesta);
       setPunto(punto);
   }

    @Override
    public void pintarForma(Graphics g) {
       Rellenar(isRellenar(),g);
    }

    @Override
    public void Rellenar(boolean hayRelleno, Graphics g) {
        g.setColor(getColor());
        if(isRellenar()){
            g.fillRect(getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }else{
            g.drawRect (getPunto().getX(), getPunto().getY(), getWidth(), getHeight());
        }
    }
}
