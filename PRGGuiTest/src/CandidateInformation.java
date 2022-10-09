import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CandidateInformation {
    public static JPanel panel;
    public static JFrame frame;
    public static JPanel menuPanel;
    public static JLabel logo;
    public static JLabel separator;
    public static JLabel mainLabel;
    public static JButton back;
    public static JButton candInfo;
    public static JButton logout;

    public static void candidateInformation() {
        panel = new JPanel();
        panel.setBackground(new Color(204, 255, 255));
        panel.setLayout(null);

        menuPanel = new JPanel();
        menuPanel.setBounds(0, 0, 190, 400);
        menuPanel.setBackground(new Color(0, 102, 153));
        menuPanel.setLayout(null);

        frame = new JFrame("Candidate Information");
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
        mainLabel = new JLabel("Candidate Information");
        mainLabel.setFont(new Font("Verdana", Font.BOLD, 25));
        mainLabel.setBounds(220, 5, 450, 50);
        panel.add(mainLabel);

        separator = new JLabel("_______________________________________________________");
        separator.setBounds(220, 50, 400, 20);
        panel.add(separator);

        // Buttons
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

        // // My Profile
        candInfo = new JButton("My Profile");
        candInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
        candInfo.setBounds(25, 170, 140, 30);
        candInfo.addActionListener(
                (ActionListener) e -> {
                    VoterInformation.votersInformation(MainClass.userList.get(MainClass.userIndex).name,MainClass.userList.get(MainClass.userIndex).surname,MainClass.userList.get(MainClass.userIndex).votingDistric,MainClass.userList.get(MainClass.userIndex).votingStatus);
                    VoterWindows.voterFrame.dispose();
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

        // Candidate 1
        // // Candidate Name
        JLabel candidateLabel = new JLabel("Candidate Name:");
        candidateLabel.setBounds(220,90,300,30);
        panel.add(candidateLabel);

        JLabel candidate = new JLabel(MainClass.partyList.get(0).candidateName);
        candidate.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candidate.setBounds(340, 90, 300, 30);
        panel.add(candidate);

        // // Party Info
        JLabel partyLabel = new JLabel("Party:");
        partyLabel.setBounds(220,120,300,30);
        panel.add(partyLabel);

        JLabel party = new JLabel(MainClass.partyList.get(0).partyName);
        party.setFont(new Font("Helvetica", Font.PLAIN, 12));
        party.setBounds(280, 120, 300, 30);
        panel.add(party);

        // // Bio
        JLabel bioLabel = new JLabel("Bio:");
        bioLabel.setBounds(220,150, 300,30);
        panel.add(bioLabel);

        JLabel bio = new JLabel();
        bio.setText("<html>" + MainClass.partyList.get(0).bio + "</html>");
        bio.setFont(new Font("Helvetica", Font.PLAIN, 12));
        bio.setBounds(260, 158, 300,150);
        panel.add(bio);

        // // Change to candidate 1 info
        JButton pg1 = new JButton("1");
        pg1.setFont(new Font("Verdana", Font.PLAIN, 12));
        pg1.setFont(new Font("Verdana", Font.PLAIN, 12));
        pg1.setForeground(new Color(255,255,255));
        pg1.setBackground(new Color(0, 102, 153));
        pg1.setBorder(null);
        pg1.setBounds(510, 318, 30, 30);
        pg1.addActionListener(
                (ActionListener) e -> {
                    candidate.setText(MainClass.partyList.get(0).candidateName);
                    party.setText(MainClass.partyList.get(0).partyName);
                    bio.setText("<html>" + MainClass.partyList.get(0).bio + "</html>");
                    bio.setBounds(260, 158, 300,150);
                });
        panel.add(pg1);

        // // Change to candidate 2 info
        JButton pg2 = new JButton("2");
        pg2.setFont(new Font("Verdana", Font.PLAIN, 12));
        pg2.setFont(new Font("Verdana", Font.PLAIN, 12));
        pg2.setForeground(new Color(255,255,255));
        pg2.setBackground(new Color(0, 102, 153));
        pg2.setBorder(null);
        pg2.setBounds(550, 318, 30, 30);
        pg2.addActionListener(
                (ActionListener) e -> {
                    candidate.setText(MainClass.partyList.get(1).candidateName);
                    party.setText(MainClass.partyList.get(1).partyName);
                    bio.setText("<html>" + MainClass.partyList.get(1).bio + "</html>");
                    bio.setBounds(260, 158, 300,150);
                });
        panel.add(pg2);

        // // Change to candidate 3 info
        JButton pg3 = new JButton("3");
        pg3.setFont(new Font("Verdana", Font.PLAIN, 12));
        pg3.setFont(new Font("Verdana", Font.PLAIN, 12));
        pg3.setForeground(new Color(255,255,255));
        pg3.setBackground(new Color(0, 102, 153));
        pg3.setBorder(null);
        pg3.setBounds(590, 318, 30, 30);
        pg3.addActionListener(
                (ActionListener) e -> {
                    candidate.setText(MainClass.partyList.get(2).candidateName);
                    party.setText(MainClass.partyList.get(2).partyName);
                    bio.setText("<html>" + MainClass.partyList.get(2).bio + "</html>");
                    bio.setBounds(260, 153, 300,100);
                });
        panel.add(pg3);

        frame.setVisible(true);
    }
}
