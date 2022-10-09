import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class detailedVotes {
    public static JPanel detPanel;
    public static JPanel menuPanel;
    public static JFrame detFrame;
    public static JLabel logo;
    public static JLabel mainLabel;
    public static JLabel separator;
    public static JLabel instruction;
    public static JButton summarizedStats;
    public static JButton overallStats;
    public static JButton logout;
    public static JLabel partyName;
    public static JLabel overallVotes;
    public static JLabel northLabel;
    public static JLabel northVotes;
    public static JLabel southLabel;
    public static JLabel southVotes;
    public static JLabel centralLabel;
    public static JLabel centralVotes;
    public static JLabel coastLabel;
    public static JLabel coastVotes;
    public static JButton btn1;
    public static JButton btn2;
    public static JButton btn3;

public static void detailedVoteScreen(){
    detPanel = new JPanel();
    detPanel.setBackground(new Color(204, 255, 255));

    menuPanel = new JPanel();
    menuPanel.setBounds(0, 0, 190, 400);
    menuPanel.setBackground(new Color(0, 102, 153));
    menuPanel.setLayout(null);

    detFrame = new JFrame("Detailed Statistics");
    detFrame.add(menuPanel);

    detFrame.setSize(650, 400);
    detFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    detFrame.add(detPanel);

    detPanel.setLayout(null);

    // Adds logo image
    logo = new JLabel();
    String logoPath = "C://Users//Chantelle van Wyk//Desktop//eVoting//PRGGuiTest//src//small-logo.png";
    logo.setIcon(new ImageIcon(logoPath));
    logo.setBounds(50, 20, 91, 59);
    menuPanel.add(logo);

    // Main Label
    mainLabel = new JLabel("Detailed Statistics");
    mainLabel.setFont(new Font("Verdana", Font.BOLD, 25));
    mainLabel.setBounds(220, 5, 400, 50);
    detPanel.add(mainLabel);

    separator = new JLabel("_______________________________________________________");
    separator.setBounds(220, 73, 400, 20);
    detPanel.add(separator);

    instruction = new JLabel("See detailed voting statistics below");
    instruction.setFont(new Font("Verdana", Font.PLAIN, 11));
    instruction.setBounds(220, 35, 350, 50);
    detPanel.add(instruction);

    // // Detailed stats
    overallStats = new JButton("Overall Stats");
    overallStats.setFont(new Font("Verdana", Font.PLAIN, 12));
    overallStats.setBounds(25, 170, 140, 30);
    overallStats.addActionListener(
            (ActionListener) e -> {
                // redirect to detailed stats window
                Representative.repWindow();
                detFrame.dispose();
            });
    menuPanel.add(overallStats);

    // // Logout
    logout = new JButton("Log Out");
    logout.setFont(new Font("Verdana", Font.PLAIN, 12));
    logout.setBounds(25, 220, 140, 30);
    logout.addActionListener(
            (ActionListener) e -> {
                MainClass.loginMethod();
                detFrame.dispose();
            });
    menuPanel.add(logout);

    JLabel subTitle1 = new JLabel("Overall Statistics:");
    subTitle1.setBounds(250, 90,300,30);
    detPanel.add(subTitle1);

    partyName = new JLabel(MainClass.partyList.get(0).partyName);
    partyName.setFont(new Font("Helvetica", Font.PLAIN, 12));
    partyName.setBounds(340, 130, 300, 30);
    detPanel.add(partyName);

    overallVotes = new JLabel();
    overallVotes.setText(String.valueOf(MainClass.partyList.get(0).voteCount));
    overallVotes.setBounds(280,130,150,30);
    detPanel.add(overallVotes);

    JLabel subTitle2 = new JLabel("Stats Per Region:");
    subTitle2.setBounds(250,170,300,30);
    detPanel.add(subTitle2);

    northLabel = new JLabel("Northern Votes");
    northLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
    northLabel.setBounds(340, 210, 300, 30);
    detPanel.add(northLabel);

    // Display northern votes
    northVotes = new JLabel(String.valueOf(MainClass.partyList.get(0).northVotes));
    northVotes.setBounds(280,210,300,30);
    detPanel.add(northVotes);

    southLabel = new JLabel("Southern Votes");
    southLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
    southLabel.setBounds(340, 235, 300, 30);
    detPanel.add(southLabel);

    // Display southern votes
    southVotes = new JLabel(String.valueOf(MainClass.partyList.get(0).southVotes));
    southVotes.setBounds(280,235,300,30);
    detPanel.add(southVotes);

    centralLabel = new JLabel("Central Votes");
    centralLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
    centralLabel.setBounds(340, 260, 300, 30);
    detPanel.add(centralLabel);

    // Display central votes
    centralVotes = new JLabel(String.valueOf(MainClass.partyList.get(0).centralVotes));
    centralVotes.setBounds(280,260,300,30);
    detPanel.add(centralVotes);

    coastLabel = new JLabel("Coastal Votes");
    coastLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
    coastLabel.setBounds(340, 285, 300, 30);
    detPanel.add(coastLabel);

    // Display coastal votes
    coastVotes = new JLabel(String.valueOf(MainClass.partyList.get(0).coastVotes));
    coastVotes.setBounds(280,285,300,30);
    detPanel.add(coastVotes);

    // // Change to party 1 info
    JButton pg1 = new JButton("1");
    pg1.setFont(new Font("Verdana", Font.PLAIN, 12));
    pg1.setFont(new Font("Verdana", Font.PLAIN, 12));
    pg1.setForeground(new Color(255,255,255));
    pg1.setBackground(new Color(0, 102, 153));
    pg1.setBorder(null);
    pg1.setBounds(510, 318, 30, 30);
    pg1.addActionListener(
            (ActionListener) e -> {
                partyName.setText(MainClass.partyList.get(0).partyName);
                overallVotes.setText(String.valueOf(MainClass.partyList.get(0).voteCount));
                northVotes.setText(String.valueOf(MainClass.partyList.get(0).northVotes));
                southVotes.setText(String.valueOf(MainClass.partyList.get(0).southVotes));
                centralVotes.setText(String.valueOf(MainClass.partyList.get(0).centralVotes));
                coastVotes.setText(String.valueOf(MainClass.partyList.get(0).coastVotes));
            });
    detPanel.add(pg1);

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
                partyName.setText(MainClass.partyList.get(1).partyName);
                overallVotes.setText(String.valueOf(MainClass.partyList.get(1).voteCount));
                northVotes.setText(String.valueOf(MainClass.partyList.get(1).northVotes));
                southVotes.setText(String.valueOf(MainClass.partyList.get(1).southVotes));
                centralVotes.setText(String.valueOf(MainClass.partyList.get(1).centralVotes));
                coastVotes.setText(String.valueOf(MainClass.partyList.get(1).coastVotes));
            });
    detPanel.add(pg2);

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
                partyName.setText(MainClass.partyList.get(2).partyName);
                overallVotes.setText(String.valueOf(MainClass.partyList.get(2).voteCount));
                northVotes.setText(String.valueOf(MainClass.partyList.get(2).northVotes));
                southVotes.setText(String.valueOf(MainClass.partyList.get(2).southVotes));
                centralVotes.setText(String.valueOf(MainClass.partyList.get(2).centralVotes));
                coastVotes.setText(String.valueOf(MainClass.partyList.get(2).coastVotes));
            });
    detPanel.add(pg3);

    detFrame.setVisible(true);
}
}
