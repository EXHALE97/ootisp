package secondtask.models.institutions;

import secondtask.models.EducationalInstitute;
import secondtask.models.service.Informationable;

public class College extends EducationalInstitute implements Informationable {
    private String speciality;

    public College(){}

    public College(String name, int graduateYear, String speciality){
        super(name,graduateYear);
        this.speciality = speciality;
    }

    public void showInfo() {
        System.out.println(super.toString());
        if(speciality != null)
            System.out.println("Speciality - " + speciality + "\n");
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