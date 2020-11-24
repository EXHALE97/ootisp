package firsttask;

public class IntermediateFullEducation {
    public String educationName = "Intermediate full education";
    private School school;
    private int degreeYear;

    public IntermediateFullEducation(){};

    public IntermediateFullEducation(School school, int degreeYear){
        this.degreeYear = degreeYear;
        this.school = school;
    }

    public int getDegreeYear() {
        return degreeYear;
    }

    public School getSchool() {
        return school;
    }

    public void setDegreeYear(int degreeYear) {
        this.degreeYear = degreeYear;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
