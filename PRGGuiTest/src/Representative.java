import java.util.Scanner;

public class Representative {
    public void repWindow() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ \n" +
                "\t \t \tRepresentative Window");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        Scanner sc2 = new Scanner(System.in);

        System.out.println("\nChoose option: \n [1] View Election Statistics \n [2] Logout");
        String rOption = sc2.next();

        if(rOption.equals("1")) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++ \n" +
                    "\t \t Election Statistics" + "\n++++++++++++++++++++++++++++++++++++");
            System.out.println("\nChoose option: \n [1] Summarized Statistics \n [2] Detailed Statistics \n");
            String rStatOption = sc2.next();

            if (rStatOption.equals("1")) {
                for (int i = 0; i < MainClass.partyList.size(); i++) {
                    System.out.println("\n \tParty Name: \t \t" + MainClass.partyList.get(i).partyName
                                     + "\n \tCandidate Name: \t" + MainClass.partyList.get(i).candidateName
                                     + "\n \tVotes: \t \t \t \t" + MainClass.partyList.get(i).voteCount);
                    System.out.println("______________");
                }

                // Allows user to go back to previous state/window
                System.out.println("\nSelect [a] to go back to previous window");
                String back = sc2.next();

                if (back.equals("a") || back.equals("A")) {
                    repWindow();
                } else {
                    System.out.println("Invalid choice");
                    repWindow();
                }

            } // Displays results per candidate per region
                else if (rStatOption.equals("2")) {
                for (int i = 0; i < MainClass.partyList.size(); i++) {
                    System.out.println("\n \t \t Detailed Statistics" + "\n____________________________________");
                    System.out.println("\nParty Name: \t \t" + MainClass.partyList.get(i).partyName
                            + "\nCandidate Name: \t" + MainClass.partyList.get(i).candidateName
                            + "\n \tNorthern Region: \t" + MainClass.partyList.get(i).northVotes
                            + "\n \tCentral Region: \t" + MainClass.partyList.get(i).centralVotes
                            + "\n \tSouthern Region: \t" + MainClass.partyList.get(i).southVotes
                            + "\n \tCoastal Region: \t" + MainClass.partyList.get(i).coastVotes);
                }
            }

            // Allows user to go back to previous state/window
            System.out.println("\nSelect [a] to go back to previous window");
            String back = sc2.next();

            if (back.equals("a") || back.equals("A")) {
                repWindow();
            } else {
                System.out.println("Invalid choice");
                repWindow();
            }

        } else if (rOption.equals("2")) {
            System.out.println("Logging out....");

            // Goes back to Login screen
            MainClass mainObject = new MainClass();
            mainObject.loginMethod();
        }
    }
}
