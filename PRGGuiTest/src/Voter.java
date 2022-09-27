import java.util.Scanner;

public class Voter {
    public void voterWindow() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ \n" +
                "\t \t \t Voter window");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        //MainClass mainObject = new MainClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose option:" +
                            "\n[1] Cast your vote" +
                            "\n[2] View all candidates" +
                            "\n[3] View Profile" +
                            "\n[4] Logout");

        int votersChoice = sc.nextInt();
        if (votersChoice==1) {
             System.out.println("\n \t \t Cast your vote" + "\n____________________________________");
             if (!MainClass.userList.get(MainClass.userIndex).votingStatus) {
                 for (int i = 0; i < MainClass.partyList.size( ); i++) {
                     System.out.println("\nParty Name: \t \t" + MainClass.partyList.get(i).partyName
                                      + "\nCandidate Name: \t" + MainClass.partyList.get(i).candidateName);
                     System.out.println("Choose " + "[" + (i + 1) + "]" + " to vote for this candidate");
                 }

                //Enter authentication method
                int candidateOption = sc.nextInt();
                if (candidateOption == 1) {
                    MainClass.partyList.get(0).increaseCount(MainClass.userList.get(MainClass.userIndex).votingDistric);
                    System.out.println(MainClass.partyList.get(0).voteCount);
                    MainClass.userList.get(MainClass.userIndex).hasVoted();
                } else if (candidateOption==2) {
                    MainClass.partyList.get(1).increaseCount(MainClass.userList.get(MainClass.userIndex).votingDistric);
                    System.out.println(MainClass.partyList.get(1).voteCount);
                    MainClass.userList.get(MainClass.userIndex).hasVoted();
                } else if (candidateOption==3) {
                    MainClass.partyList.get(2).increaseCount(MainClass.userList.get(MainClass.userIndex).votingDistric);
                    System.out.println(MainClass.partyList.get(2).voteCount);
                    MainClass.userList.get(MainClass.userIndex).hasVoted();
                }
             }

             // Allows user to go back to previous state/window
             System.out.println("\nSelect [a] to go back to previous window");
             String back = sc.next();

             if (back.equals("a") || back.equals("A")) {
             voterWindow();
             } else {
             System.out.println("Invalid choice");
             voterWindow();
             }

        }

        else if (votersChoice==2) {
            CandidateInformation.candidateInformation();
        }

        else if(votersChoice==3) {
            VotersInfo.votersInformation(MainClass.userList.get(MainClass.userIndex).name,
                                         MainClass.userList.get(MainClass.userIndex).surname,
                                         MainClass.userList.get(MainClass.userIndex).votingDistric,
                                         MainClass.userList.get(MainClass.userIndex).votingStatus);
        }

        else if (votersChoice==4) {
            System.out.println("Logging out....");

            // Goes back to login screen
            MainClass mainObject = new MainClass();
            mainObject.loginMethod();
        }
    }
}
