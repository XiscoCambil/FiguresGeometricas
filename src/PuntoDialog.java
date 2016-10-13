import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class PuntoDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonPintar;
    private JButton buttonCancel;
    private JTextField xValue;
    private JTextField yValue;

    private int x,y;
    Color color;

    public PuntoDialog(JFrame parent) throws SQLException {
        super(parent);
        setLocationRelativeTo(parent);
        setContentPane(contentPane);
        setTitle("Dibujar Punto");
        setModal(true);
        getRootPane().setDefaultButton(buttonPintar);
        buttonPintar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onPintar();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onPintar() {
        // add your code here
        ObtenerValores();
        Forma f = new Punto(x,y);
        f.setColor(color);
        if((x < 550 && x > 50) && (y > 50 && y < 550)){
            Main.listaFormas.add(f);
            Main.friendLienzo.getContentPane().repaint();
            Main.friendLienzo.getContentPane().setVisible(true);
            Main.friendLienzo.setVisible(true);

        }else {
            JOptionPane.showMessageDialog(null, "los valores de X o Y no pueden ser mayor que 600 o menor que 0");
        }

        dispose();
        }



    private void onCancel() {
        // add your code here if necessary
        Main.friendLienzo.dispose();
        dispose();
    }



    private void ObtenerValores() {
        x = Integer.parseInt(xValue.getText());
        y = Integer.parseInt(yValue.getText());
    }

}
