package models;

public class Education {
    private double averageCertificateScore;

    public Education(){};

    public Education(double averageCertificateScore){
        this.averageCertificateScore = averageCertificateScore;
    }

    public String getProgressInfo(){
        if(averageCertificateScore !=0){
            if(averageCertificateScore >= 9){
                return "Student was an excellent";
            } else if(averageCertificateScore >= 6 && averageCertificateScore < 9){
                return "Intermediate student";
            } else if(averageCertificateScore < 6) {
                return "Bad student";
            }
        }

        return "No information";
    }

    public double getAverageCertificateScore() {
        return averageCertificateScore;
    }

    public void setAverageCertificateScore(double averageCertificateScore) {
        this.averageCertificateScore = averageCertificateScore;
    }

    @Override
    public String toString() {
        String info = "";

        if(averageCertificateScore != 0){
            info = info + "Average certificate score - " + averageCertificateScore + "\n";
        }

        info = info + getProgressInfo() + "\n";

        return info;
    }
}
