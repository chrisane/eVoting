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

    public static void votersInformation(String name,  String surname, String votingDistricts, boolean hasVoted){
        panel = new JPanel();
        panel.setBackground(new Color(204, 255, 255));

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
        logo.setIcon(new ImageIcon("C://Users//Chantelle van Wyk//Desktop//eVoting//PRGGuiTest//src//small-logo.png"));
        logo.setBounds(50, 20, 91, 59);
        menuPanel.add(logo);

        // Main Label
        mainLabel = new JLabel("My Profile");
        mainLabel.setFont(new Font("Verdana", Font.BOLD, 18));
        mainLabel.setBounds(220, 5, 300, 50);
        panel.add(mainLabel);

        separator = new JLabel("_______________________________________________________");
        separator.setBounds(220, 73, 400, 20);
        panel.add(separator);

        // // Go back to previous window
        back = new JButton("Back");
        back.setFont(new Font("Verdana", Font.PLAIN, 12));
        back.setBounds(25, 120, 140, 30);
        back.addActionListener(
                (ActionListener) e -> {
                    VoterWindows.voterWindow();
                    frame.dispose();
                });
        menuPanel.add(back);













//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("\n \t Personal Information\n");
//        System.out.println("+++++++++++++++++++++++++++++++++");
//        System.out.println("Name: \t \t \t \t" + name
//                            + "\nSurname: \t \t \t" + surname
//                            + "\nVoting District: \t" + votingDistricts);
//
//        // Returns whether voter has voted or not
//        if(!hasVoted) System.out.println("\nVoting Status: \tYou have not voted yet");
//        else System.out.println("\nVoting Status: \tYou have voted\n");
//
//        // Allows user to go back to previous state/window
//        System.out.println("\nSelect [a] to go back to previous window");
//        String back = sc.next();
//
//        if (back.equals("a") || back.equals("A")) {
//            VoterWindows voterWindowsObject = new VoterWindows();
//            voterWindowsObject.voterWindow();
//        } else {
//            System.out.println("Invalid option");
//            VoterWindows voterWindowsObject = new VoterWindows();
//            voterWindowsObject.voterWindow();
//        }
        frame.setVisible(true);
    }
}
