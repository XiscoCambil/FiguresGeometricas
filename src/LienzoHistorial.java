import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by blackwidow on 13/10/16.
 */
public class LienzoHistorial extends Lienzo {

    public void paint (Graphics g) {
        Main.friendLienzo.setTitle("Lienzo historial");
            for (int i = 0; i < Main.listaFormas.size() ; i++) {
                setForma(Main.listaFormas.get(i));
                getForma().pintarForma(g);
            }
        }
    }

