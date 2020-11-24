package models.institutions;

import models.EducationalInstitute;

public class University extends EducationalInstitute {
    private String speciality;
    private String faculty;

    public University(){}

    public University(String name, int graduateYear, String faculty, String speciality){
        super(name,graduateYear);
        this.faculty = faculty;
        this.speciality = speciality;
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
