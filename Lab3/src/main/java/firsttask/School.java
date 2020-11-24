package firsttask;

public class School {
    private String name;
    private int classCount;
    private boolean isGymnasium;
    private double averageCertificateScore;

    public School(){};

    public School(String name, int classCount, boolean isGymnasium, double averageCertificateScore){
        this.name = name;
        this.classCount = classCount;
        this.isGymnasium = isGymnasium;
        this.averageCertificateScore = averageCertificateScore;
    }

    public String getProgressInfo(){
        if(averageCertificateScore >= 9){
            return "Student was an excellent";
        } else if(averageCertificateScore >= 6 && averageCertificateScore < 9){
            return "Intermediate student";
        } else if(averageCertificateScore < 6) {
            return "Bad student";
        }

        return "No information";
    }

    public String getSchoolType(){
        if(isGymnasium){
            return "Gymnasium";
        } else return "High school";
    }

    public boolean isGymnasium() {
        return isGymnasium;
    }

    public int getClassCount() {
        return classCount;
    }

    public String getName() {
        return name;
    }

    public double getAverageCertificateScore() {
        return averageCertificateScore;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public void setGymnasium(boolean gymnasium) {
        isGymnasium = gymnasium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageCertificateScore(double averageCertificateScore) {
        this.averageCertificateScore = averageCertificateScore;
    }
}
