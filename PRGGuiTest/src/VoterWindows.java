import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class VoterWindows {
    public static JLabel logo;
    public static JPanel voterPanel;
    public static JFrame voterFrame;
    public static JLabel mainLabel;
    public static JLabel separator;
    public static JLabel instruction;
    public static JLabel candidate1;
    public static JLabel candParty1;
    public static JRadioButton opt1;
    public static ButtonGroup group;
    public static JLabel candidate2;
    public static JLabel candParty2;
    public static JRadioButton opt2;
    public static JLabel candidate3;
    public static JLabel candParty3;
    public static JRadioButton opt3;
    public static JButton submit;
    public static JButton profile;
    public static JButton candInfo;
    public static JButton logout;
    public static JPanel menuPanel;

    public static void voterWindow() {

        voterPanel = new JPanel();
        voterPanel.setBackground(new Color(204, 255, 255));

        menuPanel = new JPanel();
        menuPanel.setBounds(0, 0, 190, 400);
        menuPanel.setBackground(new Color(0, 102, 153));
        menuPanel.setLayout(null);

        voterFrame = new JFrame("Voting Menu");
        voterFrame.add(menuPanel);

        voterFrame.setSize(650, 400);
        voterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        voterFrame.add(voterPanel);

        voterPanel.setLayout(null);

        // Adds logo image
        logo = new JLabel();
        logo.setIcon(new ImageIcon("C://Users//Chantelle van Wyk//Desktop//eVoting//PRGGuiTest//src//small-logo.png"));
        logo.setBounds(50, 20, 91, 59);
        menuPanel.add(logo);

        // Main Label

        mainLabel = new JLabel("Voting Menu");
        mainLabel.setFont(new Font("Verdana", Font.BOLD, 18));
        mainLabel.setBounds(220, 5, 300, 50);
        voterPanel.add(mainLabel);


        separator = new JLabel("_______________________________________________________");
        separator.setBounds(220, 73, 400, 20);
        voterPanel.add(separator);


        instruction = new JLabel("Your vote matters! Cast your vote below ");
        instruction.setFont(new Font("Verdana", Font.PLAIN, 11));
        instruction.setBounds(220, 35, 350, 50);
        voterPanel.add(instruction);

        // Candidate Option 1

        candidate1 = new JLabel("Katrina Hanse-Imarwa");
        candidate1.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candidate1.setBounds(280, 125, 300, 30);
        voterPanel.add(candidate1);


        candParty1 = new JLabel("SWAPO");
        candParty1.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candParty1.setBounds(440, 125, 300, 30);
        voterPanel.add(candParty1);


        opt1 = new JRadioButton();
        opt1.setBounds(240, 130, 20, 20);
        opt1.setBackground(new Color(204, 255, 255));
        voterPanel.add(opt1);

        // Candidate Option 2

        candidate2 = new JLabel("Itula Panduleni");
        candidate2.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candidate2.setBounds(280, 165, 300, 30);
        voterPanel.add(candidate2);


        candParty2 = new JLabel("IPC");
        candParty2.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candParty2.setBounds(440, 165, 300, 30);
        voterPanel.add(candParty2);


        opt2 = new JRadioButton();
        opt2.setBounds(240, 170, 20, 20);
        opt2.setBackground(new Color(204, 255, 255));
        voterPanel.add(opt2);

         //Candidate Option 3

        candidate3 = new JLabel("McHenry Venaani");
        candidate3.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candidate3.setBounds(280, 205, 300, 30);
        voterPanel.add(candidate3);


        candParty3 = new JLabel("PDM");
        candParty3.setFont(new Font("Helvetica", Font.PLAIN, 12));
        candParty3.setBounds(440, 205, 300, 30);
        voterPanel.add(candParty3);


        opt3 = new JRadioButton("McHenry Venaani");
        opt3.setFont(new Font("Helvetica", Font.PLAIN, 12));
        opt3.setBounds(240, 210, 20, 20);
        opt3.setBackground(new Color(204, 255, 255));
        voterPanel.add(opt3);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);

        // Buttons
        // //  Submit Vote
        submit = new JButton("Submit");
        submit.setFont(new Font("Verdana", Font.PLAIN, 12));
        submit.setBounds(340, 290, 100, 30);
        submit.addActionListener(
                (ActionListener) e -> {
                    // resets window to exclude voting buttons
                    JLabel confirmation = new JLabel("Are you sure you want to vote for " + opt3.getText());
                    confirmation.setFont(new Font("Helvetica", Font.PLAIN, 12));
//                    confirmation.setBounds();

                });
        voterPanel.add(submit);

        // // User profile
        profile = new JButton("My Profile");
        profile.setFont(new Font("Verdana", Font.PLAIN, 12));
        profile.setBounds(25, 120, 140, 30);
        profile.addActionListener(
                (ActionListener) e -> {
                    VoterInformation.votersInformation(MainClass.userList.get(MainClass.userIndex).name,MainClass.userList.get(MainClass.userIndex).surname,MainClass.userList.get(MainClass.userIndex).votingDistric,MainClass.userList.get(MainClass.userIndex).votingStatus);
                    voterFrame.dispose();
                });
        menuPanel.add(profile);

        // // Candidate info
        candInfo = new JButton("Candidate Info");
        candInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
        candInfo.setBounds(25, 170, 140, 30);
        candInfo.addActionListener(
                (ActionListener) e -> {
                    // redirect to candidate window
                });
        menuPanel.add(candInfo);

        // // Logout
        logout = new JButton("Log Out");
        logout.setFont(new Font("Verdana", Font.PLAIN, 12));
        logout.setBounds(25, 220, 140, 30);
        logout.addActionListener(
                (ActionListener) e -> {
                    MainClass.loginMethod();
                    voterFrame.dispose();
                });
        menuPanel.add(logout);

//        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ \n" +
//                "\t \t \t VoterWindows window");
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        //MainClass mainObject = new MainClass();
//       Scanner sc = new Scanner(System.in);
//        System.out.println("\nChoose option:" +
//                            "\n[1] Cast your vote" +
//                            "\n[2] View all candidates" +
//                            "\n[3] View Profile" +
//                            "\n[4] Logout");

//        int votersChoice = sc.nextInt();
//        if (votersChoice==1) {
//             System.out.println("\n \t \t Cast your vote" + "\n____________________________________");
//             if (!MainClass.userList.get(MainClass.userIndex).votingStatus) {
//                 for (int i = 0; i < MainClass.partyList.size( ); i++) {
//                     System.out.println("\nParty Name: \t \t" + MainClass.partyList.get(i).partyName
//                                      + "\nCandidate Name: \t" + MainClass.partyList.get(i).candidateName);
//                     System.out.println("Choose " + "[" + (i + 1) + "]" + " to vote for this candidate");
//                 }
//
//                //Enter authentication method
//                int candidateOption = sc.nextInt();
//                if (candidateOption == 1) {
//                    MainClass.partyList.get(0).increaseCount(MainClass.userList.get(MainClass.userIndex).votingDistric);
//                    System.out.println(MainClass.partyList.get(0).voteCount);
//                    MainClass.userList.get(MainClass.userIndex).hasVoted();
//                } else if (candidateOption==2) {
//                    MainClass.partyList.get(1).increaseCount(MainClass.userList.get(MainClass.userIndex).votingDistric);
//                    System.out.println(MainClass.partyList.get(1).voteCount);
//                    MainClass.userList.get(MainClass.userIndex).hasVoted();
//                } else if (candidateOption==3) {
//                    MainClass.partyList.get(2).increaseCount(MainClass.userList.get(MainClass.userIndex).votingDistric);
//                    System.out.println(MainClass.partyList.get(2).voteCount);
//                    MainClass.userList.get(MainClass.userIndex).hasVoted();
//                }
//             }
//
//             // Allows user to go back to previous state/window
//             System.out.println("\nSelect [a] to go back to previous window");
//             String back = sc.next();
//
//             if (back.equals("a") || back.equals("A")) {
//             voterWindow();
//             } else {
//             System.out.println("Invalid choice");
//             voterWindow();
//             }
//
//        }
//
//        else if (votersChoice==2) {
//            CandidateInformation.candidateInformation();
//        }
//
//        else if(votersChoice==3) {
//            VoterInformation.votersInformation(MainClass.userList.get(MainClass.userIndex).name,
//                                         MainClass.userList.get(MainClass.userIndex).surname,
//                                         MainClass.userList.get(MainClass.userIndex).votingDistric,
//                                         MainClass.userList.get(MainClass.userIndex).votingStatus);
//        }
//
//        else if (votersChoice==4) {
//            System.out.println("Logging out....");
//
//            // Goes back to login screen
//            MainClass mainObject = new MainClass();
//            mainObject.loginMethod();
//        }
        voterFrame.setVisible(true);
    }
}
