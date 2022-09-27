import java.util.Scanner;

public class CandidateInformation {

    public static void candidateInformation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n \t \t Detailed Candidate Information\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("++++++++++++++++++++++++++++++++"
                    + "\nParty Name: \t \t" + MainClass.partyList.get(i).partyName
                    + "\nCandidate Name: \t" + MainClass.partyList.get(i).candidateName
                    + "\nBiography: \n" + MainClass.partyList.get(i).bio + "\n");
        }

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
