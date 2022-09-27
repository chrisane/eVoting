public class user {
    String name;
    String surname;
    String username;
    String password;
    String role;
    String votingDistric;
    boolean votingStatus;
    public user(String name,
                String surname,
                String username,
                String password,
                String role,
                String votingDistricts,
                boolean votingStatus) {

        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.role = role;
        this.votingDistric = votingDistricts;
        this.votingStatus = votingStatus;
    }
    public void hasVoted() {
        votingStatus = true;
    }

}
