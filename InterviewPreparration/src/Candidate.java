public class Candidate {
    private String candidateId;
    private String name;
    private String yearOfExperience;
    private String strongTopic;

    Candidate(String candidateId,String name,String yearOfExperience,String strongTopic){
        this.candidateId = candidateId;
        this.name = name;
        this.yearOfExperience = yearOfExperience;
        this.strongTopic = strongTopic;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getStrongTopic() {
        return strongTopic;
    }

    public void setStrongTopic(String strongTopic) {
        this.strongTopic = strongTopic;
    }

    @Override
    public String toString() {
        return "Candidate ID : "+candidateId+"\n" +
                "Name : "+name+"\n" +
                "Year of Experience : "+yearOfExperience+"\n" +
                "Strong in : "+strongTopic;
    }
}
