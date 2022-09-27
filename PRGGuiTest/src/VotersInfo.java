import java.util.Scanner;

public class VotersInfo {
    public static void votersInformation(String name,  String surname, String votingDistricts, boolean hasVoted){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n \t Personal Information\n");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Name: \t \t \t \t" + name
                            + "\nSurname: \t \t \t" + surname
                            + "\nVoting District: \t" + votingDistricts);

        // Returns whether voter has voted or not
        if(!hasVoted) System.out.println("\nVoting Status: \tYou have not voted yet");
        else System.out.println("\nVoting Status: \tYou have voted\n");

        // Allows user to go back to previous state/window
        System.out.println("\nSelect [a] to go back to previous window");
        String back = sc.next();

        if (back.equals("a") || back.equals("A")) {
            Voter voterObject = new Voter();
            voterObject.voterWindow();
        } else {
            System.out.println("Invalid option");
            Voter voterObject = new Voter();
            voterObject.voterWindow();
        }
    }
}
