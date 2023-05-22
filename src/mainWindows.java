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
            public void actionPerformed(ActionEvent e) { // ketika button ini bakal ......->
                SecondWindow ariq = new SecondWindow(); // buat instansi dari panel baru
                JFrame frame = new JFrame("Second panel"); // panggil Jframe

                frame.add(ariq.getPanel()); // buat nampilin panel baru
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // klo mencet tombol X bakal apa? exit on close itu matiin semua panel
                frame.pack(); // ukuran frame
                frame.setVisible(true); // haha true goes brrrrr
                frame.setLocationRelativeTo(null); // biar ditengah lmao si framenya

            }
        });
    }

    public static void main(String[] args){



        JFrame frame = new JFrame("GUI TEST");
        frame.setContentPane(new mainWindows().mainPanel); // main panele
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(400,450,400,250);
    }
}


