import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class SecondWindow {
    private JButton backButton;
    private JPanel secondPanel;
    private JComboBox comboBox1;
    private JButton runGameButton;
    private JButton disableCheatsButton;
    private JProgressBar progressBarValue;
    private JButton selectGameFileButton;
    private JTextField fileLocations;
    private CardLayout cardLayout;


    public SecondWindow() {
//        fileLocations.setText("Test Cuy");

        selectGameFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    // Mendapatkan file yang dipilih oleh pengguna
                    java.io.File selectedFile = fileChooser.getSelectedFile();
                    fileLocations.setText(selectedFile.getAbsolutePath());
                }
            }
        });
        runGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    infoDialog success = new infoDialog();
                    JFrame frame = new JFrame("GUI TEST");


                        progressBarValue.setValue(100);

                        frame.dispose();
                        frame.add(success.getPanelInfoDialog());
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.pack();
                        frame.setVisible(true);
                        frame.setLocationRelativeTo(null);







            }
        });
    }

    public JPanel getPanel(){
        return secondPanel;
    }



//    public static void main(String[] args){
//
//    }
}
