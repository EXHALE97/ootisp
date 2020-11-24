package firsttask;

public class Education {
    private String personName;
    private IntermediateFullEducation intermediateFullEducation;

    public Education(){};

    public Education(String personName, IntermediateFullEducation intermediateFullEducation){
        this.personName = personName;
        this.intermediateFullEducation = intermediateFullEducation;
    }

    public void showFullInfo(){
        if(personName != null){
            System.out.println("Personal name - " + personName);
        }
        if(intermediateFullEducation != null){
            System.out.println("Education status - " + intermediateFullEducation.educationName);
            if(intermediateFullEducation.getDegreeYear() != 0){
                System.out.println("Graduate year - " + intermediateFullEducation.getDegreeYear());
            }
            School school = intermediateFullEducation.getSchool();
            if(school.getName() != null){
                System.out.println("School name - " + school.getName());
            }
            System.out.println("School type - " + school.getSchoolType());
            System.out.println("School progress - " + school.getProgressInfo());
        }
    }

    public IntermediateFullEducation getIntermediateFullEducation() {
        return intermediateFullEducation;
    }

    public void setIntermediateFullEducation(IntermediateFullEducation intermediateFullEducation) {
        this.intermediateFullEducation = intermediateFullEducation;
    }
}
