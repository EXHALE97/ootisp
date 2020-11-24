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

    @Override
    public String toString() {
        String info = "";
        info = info + "Education status - " + educationName + "\n";
        if(degreeYear != 0){
            info = info + "Graduate year - " + degreeYear + "\n";
        }
        if(school != null){
            info = info + school.toString();
        }
        return info;
    }
}
