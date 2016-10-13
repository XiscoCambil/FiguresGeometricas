import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.Lock;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Lienzo extends JPanel{
    private JPanel lienzo;
    private Forma forma;

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public void paint (Graphics g)
    {
        super.paint(g);
        forma = Main.listaFormas.get(Main.listaFormas.size()-1);
        forma.pintarForma(g);
    }
}
