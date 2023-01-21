import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    JFrame canvas;
    JPanel panel;
    JLabel title;
    JButton [] options;

    public MainScreen(){

        panel = new JPanel();
        canvas = new JFrame();
        canvas.setSize(700,700);
        canvas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        canvas.setResizable(false);
        canvas.setLocationRelativeTo(null);
        canvas.add(panel);
        canvas.setVisible(true);

        panel.setLayout(null);
        panel.setBackground(Color.orange);

        title = new JLabel("Welcome To IPO Programming Crash Course");
        title.setBounds(75, 0, 550, 100);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(title);

        options = new JButton[3];
        int y = 220;

        for(int i=0; i<3; i++){
            options[i] = new JButton();

            if(i == 0){
                options[i].setText("Lessons");
                options[i].setBounds(275, y, 150, 50);
                panel.add(options[i]);
                y+= 80;
            }
            if(i == 1){
                options[i].setText("Actvity");
                options[i].setBounds(275, y, 150, 50);
                panel.add(options[i]);
                y+= 80;
            }
            if(i == 2){
                options[i].setText("Quiz");
                options[i].setBounds(275, y, 150, 50);
                panel.add(options[i]);
            }
        }
        options[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameScreen();
            }
        });
    }
}
