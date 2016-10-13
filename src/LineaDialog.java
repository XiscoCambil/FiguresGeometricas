import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class LineaDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonPintar;
    private JButton buttonCancel;
    private JTextField xValue;
    private JTextField x2Value;
    private JTextField yValue;
    private JTextField y2Value;

    private int x,y,x2,y2;
    private Color color;
    private JComboBox colores;
    private Punto punto1,punto2;

    public LineaDialog(JFrame parent) throws SQLException {
        super(parent);
        setLocationRelativeTo(parent);
        setContentPane(contentPane);
        setTitle("Dibujar Linea");
        setModal(true);
        getRootPane().setDefaultButton(buttonPintar);
        CreateComboColor(colores);

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
        if((x < 550 && x > 50) && (y > 50 && y < 550)){
            punto1 = new Punto(x,y);
            punto2 = new Punto(x2,y2);
            Forma f = new Linea(punto1,punto2,color);
            Main.listaFormas.add(f);
            Main.friendLienzo.getContentPane().repaint();
            Main.friendLienzo.getContentPane().setVisible(true);
            Main.friendLienzo.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "los valores de X o Y no pueden ser mayor que 600 o menor que 0");
        }
    }

    private void onCancel() {
        // add your code here if necessary
        Main.friendLienzo.dispose();
        dispose();
    }

    private void CreateComboColor(JComboBox comboBox) throws SQLException {
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        dcb.addElement(Color.black);
        dcb.addElement(Color.WHITE);
        dcb.addElement(Color.GREEN);
        dcb.addElement(Color.BLUE);
        dcb.addElement(Color.CYAN);
        dcb.addElement(Color.YELLOW);
        comboBox.setModel(dcb);
        comboBox.setVisible(true);
    }

    private void ObtenerValores() {
        x = Integer.parseInt(xValue.getText());
        x2 = Integer.parseInt(x2Value.getText());
        y = Integer.parseInt(yValue.getText());
        y2 = Integer.parseInt(y2Value.getText());
        color = (Color) colores.getSelectedItem();
    }
}
