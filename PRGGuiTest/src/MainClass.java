import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Scanner;

public class MainClass implements ActionListener {
    public static user user1 = new user
            ("Benson",
                    "Ntemo",
                    "b",
                    "n",
                    "voter",
                    "Central",
                    false);
    public static user user2 = new user
            ("Chantelle",
                    "Van Wyk",
                    "chants",
                    "vanwyk111",
                    "rep",
                    null,
                    false);
    public static ArrayList<user> userList = new ArrayList<user>();
    public static party SWAPO = new party
            ("South West Africa People's Organisation",
            "Katrina Hanse-Imarwa",
            "\nBorn 22nd January 1967 in Hoachanas and is currently aged 55.\n" +
                 "She served as the Governor of the Hardap region from 2004 to 2015.\n" +
                 "She served as Minister of Education, Arts and Culture from 21 March 2015 to 9 July 2019.\n" +
                 "She is a teacher by profession and has a Basic Education Teachers Diploma which she obtained\n" +
                 "in 1995 as well as a Bachelor in Education Management, obtained in 1999.\n" +
                 "Katrina hopes to be president as she believes she is now ready to serve not only the SWAPO\n" +
                 "party, but also the nation as a whole.\n");


    public static party IPC = new party
            ("Independent Patriots for Change",
                    "Itula Panduleni",
                    "\nBorn 2nd August 1957 and is currently aged 65.\n" +
                            "He served as a SWAPO Part Youth League leader.\n" +
                            "He has worked as a Lawyer and a Dentist.\n" +
                            "He holds a Bachelor in Dentistry which he obtained in 1994.\n" +
                            "He holds a Masters in Medical science in oral surgery which he obtained in 1998.\n" +
                            "He holds a Post-graduate degree in dentistry which he obtained in 2005.\n" +
                            "He has also studied for a Masters in Law.\n" +
                            "Panduleni believes that he is the only candidate that is a “natural” fit to run in the\n" +
                            "election and the best candidate to lead the nation.\n");
    public static party PDM = new party
            ("People's Democratic Movement",
                    "McHenry Venaani",
                    "\nBorn 8th September 1997 and is currently 45 years old.\n" +
                            "He holds a Diploma in International Trade Law obtained in 2002, a Diploma in\n" +
                            "Constitutional Law obtained in 1999, and a Diploma in Business Law obtained in 1997.\n" +
                            "Venaani says he hopes to tackle the tribalism issue within the nation.\n");
    public static ArrayList<party> partyList = new ArrayList<party>();

    public static int userIndex;
    public static JButton submit;
    public static JTextField uName;
    public static JPasswordField uPass;
    public static JLabel invalid;
    public static JPanel loginPanel;
    public static JLabel title;
    public static JLabel uNameLabel;
    public static JLabel pwLabel;
    public static JLabel image;
public static JFrame loginFrame;
    public static void loginMethod() {
        userList.add(user1);
        userList.add(user2);
        partyList.add(SWAPO);
        partyList.add(IPC);
        partyList.add(PDM);

        loginPanel = new JPanel();
        loginPanel.setBackground(new Color(204,255,255));
        loginFrame = new JFrame("Login");

        loginFrame.setSize(650, 370);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginPanel.setLayout(null);
        loginFrame.add(loginPanel);

        image = new JLabel();
        image.setIcon(new ImageIcon("C://Users//Chantelle van Wyk//Desktop//eVoting//PRGGuiTest//src//img.png"));
        image.setBounds(0,0,313,338);
        loginPanel.add(image);

        title = new JLabel("Login");
        title.setFont(new Font("Verdana", Font.BOLD, 18));
        title.setBounds(340, 15, 120, 30);
        loginPanel.add(title);

        uNameLabel = new JLabel("Username:");
        uNameLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
        uNameLabel.setBounds(340, 100, 120, 30);
        loginPanel.add(uNameLabel);


        pwLabel = new JLabel("Password:");
        pwLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
        pwLabel.setBounds(340, 140, 120, 30);
        loginPanel.add(pwLabel);

        uName = new JTextField();
        uName.setBounds(420, 105, 170, 25);
        loginPanel.add(uName);

        uPass = new JPasswordField();
        uPass.setBounds(420, 145, 170, 25);
        loginPanel.add(uPass);

        invalid = new JLabel();
        invalid.setBounds(50,50,200,25);
        invalid.setForeground(Color.red);
        loginPanel.add(invalid);

        submit = new JButton("Submit");
        submit.setFont(new Font("Verdana", Font.PLAIN, 12));
        submit.setBounds(430, 200, 100, 30);
        submit.addActionListener(new MainClass());
        loginPanel.add(submit);

        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        String user = uName.getText();
        String pw = String.valueOf(uPass.getPassword());

        for (int i = 0; i < userList.size(); i++)
        {
            if (user.equals(userList.get(i).username) && pw.equals(userList.get(i).password))
            {
                //System.out.println("Valid Credentials");
                userIndex = i;
                if (userList.get(i).role.equals("voter"))
                {
                    System.out.println("You are a voter");
                    System.out.println(userIndex);

                    // Navigates to the voting page
                    VoterWindows voterWindowsObject = new VoterWindows();
                    voterWindowsObject.voterWindow();
                    loginFrame.dispose();
                    break;
                } else if (userList.get(i).role.equals("Rep"))
                {
                    // Navigates to the representative page
                    Representative repObject = new Representative();
                    repObject.repWindow();
                    loginFrame.dispose();
                }
                else
                {
                    invalid.setText("Invalid Entry");
                }
            }
        }

    }

    public static void main(String[] args)
    {
        loginMethod();
    }
}