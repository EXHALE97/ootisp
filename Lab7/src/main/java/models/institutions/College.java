package models.institutions;

import models.EducationalInstitute;

public class College extends EducationalInstitute {
    private String speciality;

    public College(){}

    public College(String name, int graduateYear, String speciality){
        super(name,graduateYear);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        String info = "";

        info = info + super.toString();
        if(speciality != null)
        info = info + "Speciality - " + speciality + "\n";

        return info;
    }
}
