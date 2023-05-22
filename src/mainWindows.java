import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainWindows {
    private JPanel mainPanel;
    private JButton nextButton;
    private JLabel gambar;
    private JFormattedTextField FormattedTextField;
    private JPasswordField passwordField;


    public mainWindows() {
//        mainLabel.setForeground(Color.BLUE);
        ImageIcon imageIcon = new ImageIcon("src/art.jpg");
        gambar.setIcon(imageIcon);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondWindow ariq = new SecondWindow();
                JFrame frame = new JFrame("Second panel");

                frame.add(ariq.getPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);

            }
        });
    }

    public static void main(String[] args){



        JFrame frame = new JFrame("GUI TEST");
        frame.setContentPane(new mainWindows().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(400,450,400,250);
    }
}


