public class party {
    String partyName;
    String candidateName;
    String bio;
    public static int voteCount = 0;
    public static int northVotes = 0;
    public static int southVotes = 0;
    public static int centralVotes = 0;
    public static int coastVotes = 0;
    public party(String partyName,
                 String candidateName,
                 String bio) {

        this.partyName= partyName;
        this.candidateName= candidateName;
        this.bio = bio;
    }
    public static void increaseCount(String location){
        if(location.equalsIgnoreCase("north")) northVotes++;
         else if(location.equalsIgnoreCase("south"))southVotes++;
        else if(location.equalsIgnoreCase("central"))centralVotes++;
        else if(location.equalsIgnoreCase("coast"))coastVotes++;
        voteCount+=northVotes+southVotes+centralVotes+coastVotes;
    }
}
