import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PopUp {
    public static JFrame pFrame;
    public static JPanel pPanel;
    public static JLabel pLabel;
    public static JButton yesBtn;
    public static JButton noBtn;
    public static boolean yesOrNo;
    public static void popUpMethod(){
pFrame = new JFrame("Confirm");
        pPanel = new JPanel();

        pFrame.setSize(350, 200);
        pFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pFrame.add(pPanel);
        pPanel.setLayout(null);

        pLabel = new JLabel("Are you sure about your vote?");
        pLabel.setBounds(85,40,300,30);
        pPanel.add(pLabel);

        yesBtn = new JButton("Yes");
        yesBtn.setBounds(70,100,80,30);
        yesBtn.addActionListener((ActionListener) e->{
            yesOrNo = true;
            pFrame.dispose();
        });
        pPanel.add(yesBtn);

        noBtn = new JButton("No");
        noBtn.setBounds(190,100,80,30);
        noBtn.addActionListener((ActionListener) e->{

            yesOrNo= false;
            pFrame.dispose();
        });
        pPanel.add(noBtn);
        pFrame.setVisible(true);
    }
}
