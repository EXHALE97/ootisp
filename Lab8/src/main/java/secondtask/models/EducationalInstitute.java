package secondtask.models;

public class EducationalInstitute {
    private String name;
    private int graduateYear;

    public EducationalInstitute(){}

    public EducationalInstitute(String name, int graduateYear){
        this.name = name;
        this.graduateYear = graduateYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

    @Override
    public String toString() {
        String info = "";

        info = info + "Institute name - " + name + "\n";
        info = info + "Graduation year - " + graduateYear + "\n";

        return info;
    }
}