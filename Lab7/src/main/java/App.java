import models.EducationalProfile;
import models.education.HigherEducation;
import models.education.IntermediateFullEducation;
import models.institutions.School;
import models.institutions.University;

public class App {
    public static void main(String[] args){
        School school = new School("Gymnasium number 1", 2014, 11, true);
        University university = new University("BSUIR", 2019, "FITC", "Artificial Intelligence");

        IntermediateFullEducation firstStage = new IntermediateFullEducation(school, 8.67, false);
        HigherEducation secondStage = new HigherEducation(university, 9.87, true);

        new EducationalProfile("Vasya Pupkin", firstStage, null, secondStage).ShowPersonalEducationInfo();
    }
}
