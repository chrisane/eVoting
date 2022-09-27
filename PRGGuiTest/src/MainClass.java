import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static user user1 = new user("Benson","Ntemo","bbenbast", "ntemo111", "voter", "Central", false);
    public static user user2 = new user("Chantelle","Van Wyk","chants", "vanwyk111", "rep", null, false);
    public static ArrayList<user> userList = new ArrayList<user>();
    public static party SWAPO = new party("South West Africa People's Organisation",
            "Katrina Hanse-Imarwa",
            "\nBorn 22nd January 1967 in Hoachanas and is currently aged 55.\n" +
                 "She served as the Governor of the Hardap region from 2004 to 2015.\n" +
                 "She served as Minister of Education, Arts and Culture from 21 March 2015 to 9 July 2019.\n" +
                 "She is a teacher by profession and has a Basic Education Teachers Diploma which she obtained\n" +
                 "in 1995 as well as a Bachelor in Education Management, obtained in 1999.\n" +
                 "Katrina hopes to be president as she believes she is now ready to serve not only the SWAPO\n" +
                 "party, but also the nation as a whole.\n");
    public static party IPC = new party("Independent Patriots for Change",
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
    public static party PDM = new party("People's Democratic Movement",
            "McHenry Venaani",
            "\nBorn 8th September 1997 and is currently 45 years old.\n" +
                 "He holds a Diploma in International Trade Law obtained in 2002, a Diploma in\n" +
                 "Constitutional Law obtained in 1999, and a Diploma in Business Law obtained in 1997.\n" +
                 "Venaani says he hopes to tackle the tribalism issue within the nation.\n");
    public static ArrayList<party> partyList = new ArrayList<party>();

    public static int userIndex;

    public static void loginMethod() {
        userList.add(user1);
        userList.add(user2);
        partyList.add(SWAPO);
        partyList.add(IPC);
        partyList.add(PDM);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ \n" +
                "\t \t \tLogin Window");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\nEnter username:");
        String uName = sc.next();

        System.out.println("Enter password:");
        String uPass = sc.next();


        for (int i = 0; i < userList.size(); i++) {
            if (uName.equals(userList.get(i).username) && uPass.equals(userList.get(i).password)) {
                System.out.println("Valid Credentials");
                if (userList.get(i).role.equals("voter")) {
                    userIndex = i;
                    System.out.println("You are a voter");
                    System.out.println(userIndex);
                    // testing the commit thingy Benson
                    // Navigates to the voting page
                    Voter voterObject = new Voter();
                    voterObject.voterWindow();
                    break;
                } else if (userList.get(i).role.equals("Rep")) System.out.println("You are a representative");{
                    // Navigates to the representative page
                    Representative repObject = new Representative();
                    repObject.repWindow();
                }

            }
        }
        ;
    }

    public static void main(String[] args) {
        loginMethod();
    }
}
