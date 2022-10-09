import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class VoterInformation {
    public static JPanel panel;
    public static JFrame frame;
    public static JPanel menuPanel;
    public static JLabel logo;
    public static JLabel separator;
    public static JLabel mainLabel;
    public static JButton back;
    public static JButton candInfo;
    public static JButton logout;
    public  static int userIndex;

    public static void votersInformation(String name,  String surname, String votingDistricts, boolean hasVoted){
        panel = new JPanel();
        panel.setBackground(new Color(204, 255, 255));
        panel.setLayout(null);

        menuPanel = new JPanel();
        menuPanel.setBounds(0, 0, 190, 400);
        menuPanel.setBackground(new Color(0, 102, 153));
        menuPanel.setLayout(null);

        frame = new JFrame("My Profile");
        frame.add(menuPanel);

        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // Adds logo image
        logo = new JLabel();
        String logoPath = "C://Users//Chantelle van Wyk//Desktop//eVoting//PRGGuiTest//src//small-logo.png";
        logo.setIcon(new ImageIcon(logoPath));
        logo.setBounds(50, 20, 91, 59);
        menuPanel.add(logo);

        // Main Label
        mainLabel = new JLabel("My Profile");
        mainLabel.setFont(new Font("Verdana", Font.BOLD, 25));
        mainLabel.setBounds(220, 5, 300, 50);
        panel.add(mainLabel);

        separator = new JLabel("_______________________________________________________");
        separator.setBounds(220, 50, 400, 20);
        panel.add(separator);

        // // Go back to previous window
        back = new JButton("Home");
        back.setFont(new Font("Verdana", Font.PLAIN, 12));
        back.setBounds(25, 120, 140, 30);
        back.addActionListener(
                (ActionListener) e -> {
                    VoterWindows.voterWindow();
                    frame.dispose();
                });
        menuPanel.add(back);

        // // Candidate info
        candInfo = new JButton("Candidate Info");
        candInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
        candInfo.setBounds(25, 170, 140, 30);
        candInfo.addActionListener(
                (ActionListener) e -> {
                    CandidateInformation.candidateInformation();
                    frame.dispose();
                });
        menuPanel.add(candInfo);

        // // Logout
        logout = new JButton("Log Out");
        logout.setFont(new Font("Verdana", Font.PLAIN, 12));
        logout.setBounds(25, 220, 140, 30);
        logout.addActionListener(
                (ActionListener) e -> {
                    MainClass.loginMethod();
                    frame.dispose();
                });
        menuPanel.add(logout);

        // Profile Content
        // // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(220,90,300,30);
        panel.add(nameLabel);

        JLabel uName = new JLabel(name);
        uName.setFont(new Font("Helvetica", Font.PLAIN, 12));
        uName.setBounds(280, 90, 300, 30);
        panel.add(uName);

        // // Surname
        JLabel snameLabel = new JLabel("Surname:");
        snameLabel.setBounds(220,120,300,30);
        panel.add(snameLabel);

        JLabel uSName = new JLabel(surname);
        uSName.setFont(new Font("Helvetica", Font.PLAIN, 12));
        uSName.setBounds(300, 120, 300, 30);
        panel.add(uSName);

        // // District
        JLabel bioLabel = new JLabel("Voting District:");
        bioLabel.setBounds(220,150, 300,30);
        panel.add(bioLabel);

        JLabel bio1 = new JLabel(votingDistricts);
        bio1.setFont(new Font("Helvetica", Font.PLAIN, 12));
        bio1.setBounds(325, 150, 300,30);
        panel.add(bio1);

        frame.setVisible(true);
    }
}
