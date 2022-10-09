import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Representative {
    public static JPanel repPanel;
    public static JPanel menuPanel;
    public static JFrame repFrame;
    public static JLabel logo;
    public static JLabel mainLabel;
    public static JLabel separator;
    public static JLabel instruction;
    public static JButton summarizedStats;
    public static JButton detStats;
    public static JButton logout;
    public static JLabel SWAPOstats;
    public static JLabel IPCstats;
    public static JLabel PDMstats;

    public static void repWindow() {
        repPanel = new JPanel();
        repPanel.setBackground(new Color(204, 255, 255));

        menuPanel = new JPanel();
        menuPanel.setBounds(0, 0, 190, 400);
        menuPanel.setBackground(new Color(0, 102, 153));
        menuPanel.setLayout(null);

        repFrame = new JFrame("Representative Menu");
        repFrame.add(menuPanel);

        repFrame.setSize(650, 400);
        repFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        repFrame.add(repPanel);

        repPanel.setLayout(null);

        // Adds logo image
        logo = new JLabel();
        String logoPath = "C://Users//Chantelle van Wyk//Desktop//eVoting//PRGGuiTest//src//small-logo.png";
        logo.setIcon(new ImageIcon(logoPath));
        logo.setBounds(50, 20, 91, 59);
        menuPanel.add(logo);

        // Main Label
        mainLabel = new JLabel("Representative Menu");
        mainLabel.setFont(new Font("Verdana", Font.BOLD, 25));
        mainLabel.setBounds(220, 5, 400, 50);
        repPanel.add(mainLabel);

        separator = new JLabel("_______________________________________________________");
        separator.setBounds(220, 73, 400, 20);
        repPanel.add(separator);

        instruction = new JLabel("See summarized voting statistics below");
        instruction.setFont(new Font("Verdana", Font.PLAIN, 11));
        instruction.setBounds(220, 35, 350, 50);
        repPanel.add(instruction);

        // Buttons
        // // Detailed stats
        detStats = new JButton("Detailed Stats");
        detStats.setFont(new Font("Verdana", Font.PLAIN, 12));
        detStats.setBounds(25, 170, 140, 30);
        detStats.addActionListener(
                (ActionListener) e -> {
                    // redirect to detailed stats window
                    detailedVotes.detailedVoteScreen();
                    repFrame.dispose();
                });
        menuPanel.add(detStats);

        // // Logout
        logout = new JButton("Log Out");
        logout.setFont(new Font("Verdana", Font.PLAIN, 12));
        logout.setBounds(25, 220, 140, 30);
        logout.addActionListener(
                (ActionListener) e -> {
                    MainClass.loginMethod();
                    repFrame.dispose();
                });
        menuPanel.add(logout);

        // SWAPO Votes
        JLabel SWAPO = new JLabel(MainClass.partyList.get(0).partyName);
        SWAPO.setFont(new Font("Helvetica", Font.PLAIN, 12));
        SWAPO.setBounds(320,130,300,30);
        repPanel.add(SWAPO);

        SWAPOstats = new JLabel();
        SWAPOstats.setText(String.valueOf(MainClass.partyList.get(0).voteCount));
        SWAPOstats.setBounds(280,130,150,30);
        repPanel.add(SWAPOstats);

        // IPC Votes
        JLabel IPC = new JLabel(MainClass.partyList.get(1).partyName);
        IPC.setFont(new Font("Helvetica", Font.PLAIN, 12));
        IPC.setBounds(320,180,300,30);
        repPanel.add(IPC);

        IPCstats = new JLabel();
        IPCstats.setText(String.valueOf(MainClass.partyList.get(1).voteCount));
        IPCstats.setBounds(280,180,150,30);
        repPanel.add(IPCstats);

        // PDM Votes
        JLabel PDM = new JLabel(MainClass.partyList.get(2).partyName);
        PDM.setFont(new Font("Helvetica", Font.PLAIN, 12));
        PDM.setBounds(320,230,300,30);
        repPanel.add(PDM);

        PDMstats = new JLabel();
        PDMstats.setText(String.valueOf(MainClass.partyList.get(2).voteCount));
        PDMstats.setBounds(280,230,150,30);
        repPanel.add(PDMstats);

        repFrame.setVisible(true);
    }
}
