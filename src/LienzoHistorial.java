import javax.swing.*;
import java.awt.*;

/**
 * Created by blackwidow on 13/10/16.
 */
public class LienzoHistorial extends JPanel {
    private JPanel lienzo;
    private Forma forma;

    public void paint (Graphics g)
    {
        super.paint(g);
        Main.friendLienzo.setTitle("Lienzo historial");
        for (int i = 0; i < Main.listaFormas.size() ; i++) {
            forma = Main.listaFormas.get(i);
            forma.pintarForma(g);
        }
        final Lienzo lienzo = new Lienzo();
    }

}
