package secondtask.models.institutions;

import secondtask.models.EducationalInstitute;
import secondtask.models.service.Informationable;

public class University extends EducationalInstitute implements Informationable {
    private String speciality;
    private String faculty;

    public University(){}

    public University(String name, int graduateYear, String faculty, String speciality){
        super(name,graduateYear);
        this.faculty = faculty;
        this.speciality = speciality;
    }

    public void showInfo() {
        System.out.println(super.toString());
        if(faculty != null)
            System.out.println("Faculty - " + faculty + "\n");
        if(speciality != null)
            System.out.println("Speciality - " + speciality + "\n");

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        String info = "";

        info = info + super.toString();
        if(faculty != null)
        info = info + "Faculty - " + faculty + "\n";
        if(speciality != null)
        info = info + "Speciality - " + speciality + "\n";

        return info;
    }
}