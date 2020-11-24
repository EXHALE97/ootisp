package models.education;

import models.Education;
import models.institutions.School;

public class IntermediateFullEducation extends Education {
    public String educationName = "Intermediate full education";
    private boolean isGoldMedal;
    private School school;

    public IntermediateFullEducation(){};

    public IntermediateFullEducation(School school, double averageCertificateScore, boolean isGoldMedal){
        super(averageCertificateScore);
        this.school = school;
        this.isGoldMedal = isGoldMedal;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public boolean isGoldMedal() {
        return isGoldMedal;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public void setGoldMedal(boolean goldMedal) {
        isGoldMedal = goldMedal;
    }

    public String getEducationName() {
        return educationName;
    }

    @Override
    public String toString() {
        String info = "\n\n" + educationName + ":\n";
        info = info + super.toString();
        info = info + "Education status - " + educationName + "\n";
        if(school != null){
            info = info + school.toString();
        }
        return info;
    }
}
