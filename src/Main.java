import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by blackwidow on 6/10/16.
 */
public class Main {
    public static List<Forma> listaFormas = new ArrayList<>();
    public static PanelPrincipal pp;
    public static JFrame friendLienzo;
    public static void main(String[] args) {

        final Lienzo lienzo = new Lienzo();

        Runnable guiThread = new Runnable() {
            public void run() {
                pp = new PanelPrincipal();
                //Create and set up the window.
                friendLienzo = new JFrame("Lienzo");
                friendLienzo.setSize(500,500);
                friendLienzo.setContentPane(lienzo);
                friendLienzo.getContentPane().setVisible(true);
                friendLienzo.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                        friendLienzo.setContentPane(lienzo);
                    }
                });
            }
        };

        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}