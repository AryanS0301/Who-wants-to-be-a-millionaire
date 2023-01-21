import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameScreen extends JPanel implements ActionListener, MouseListener {
    JFrame frame;
    JPanel panel;

    public GameScreen(){
        frame = new JFrame("Who wants to be a millionaire");
        panel = new JPanel();

        frame.setSize(700,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);

        panel.setLayout (null);

        panel.setBackground (new Color(0,6,84));
        panel.setFont (new Font("Sans", Font.PLAIN, 50));

        JButton playBtn = new JButton("PLAY!");
        playBtn.setFont(new Font("Sans", Font.BOLD, 18));
        playBtn.setForeground(Color.WHITE);				// button text color
        playBtn.setBackground(new Color (0,6,84));
        playBtn.setPreferredSize(new Dimension(190, 30));			//button size
        playBtn.setBounds(5,475,140,60);
        playBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Clicked");
                frame2.setVisible(true);
                frame2.setSize(200,100);

                JLabel label = new JLabel("you clicked me");
                label.setFont(new Font("Calibri", Font.BOLD, 18));
                label.setForeground(Color.WHITE);
                JPanel panel = new JPanel();
                frame2.add(panel);
                panel.add(label);

            }
        });
        playBtn.setOpaque(true);
        playBtn.setBorderPainted(false);

        panel.add(playBtn);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
