package models.education;

import models.Education;
import models.institutions.College;

public class SecondarySpecialEducation extends Education {
    public String educationName = "Secondary Special Education";
    private boolean isRedDiploma;
    private College college;

    public SecondarySpecialEducation(){};

    public SecondarySpecialEducation(College college, double averageCertificateScore, boolean isRedDiploma){
        super(averageCertificateScore);
        this.college = college;
        this.isRedDiploma = isRedDiploma;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getDiplomaType(){
        if(isRedDiploma){
            return "Has red diploma";
        }
        else return "Has ordinary diploma";
    }

    public void setRedDiploma(boolean redDiploma) {
        isRedDiploma = redDiploma;
    }

    public boolean isRedDiploma() {
        return isRedDiploma;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getEducationName() {
        return educationName;
    }

    @Override
    public String toString() {
        String info = "\n\n" + educationName + ":\n";
        info = info + super.toString();
        info = info + "Education status - " + educationName + "\n";
        info = info + "Diploma type - " + getDiplomaType() + "\n";
        if(college != null){
            info = info + college.toString();
        }
        return info;
    }
}
