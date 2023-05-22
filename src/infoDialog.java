import javax.swing.*;
import java.awt.event.*;

public class infoDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel iconSuccess;

    public infoDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        ImageIcon imageIcon = new ImageIcon("src/success2.png");
        iconSuccess.setIcon(imageIcon);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public JPanel getPanelInfoDialog(){
        return contentPane;
    }

    public static void main(String[] args) {
        infoDialog dialog = new infoDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
