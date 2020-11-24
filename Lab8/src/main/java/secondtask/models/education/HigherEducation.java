package secondtask.models.education;

import secondtask.models.Education;
import secondtask.models.institutions.University;
import secondtask.models.service.Informationable;

public class HigherEducation extends Education {
    public String educationName = "Higher education";
    private boolean isRedDiploma;
    private University university;

    public HigherEducation(){};

    public HigherEducation(University university, double averageCertificateScore, boolean isRedDiploma){
        super(averageCertificateScore);
        this.university = university;
        this.isRedDiploma = isRedDiploma;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
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
        if(university != null){
            info = info + university.toString();
        }
        return info;
    }
}