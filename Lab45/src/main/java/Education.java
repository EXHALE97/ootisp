public class Education {
    private String personName;
    private IntermediateFullEducation intermediateFullEducation;

    public Education(){};

    public Education(String personName, IntermediateFullEducation intermediateFullEducation){
        this.personName = personName;
        this.intermediateFullEducation = intermediateFullEducation;
    }

    public IntermediateFullEducation getIntermediateFullEducation() {
        return intermediateFullEducation;
    }

    public void setIntermediateFullEducation(IntermediateFullEducation intermediateFullEducation) {
        this.intermediateFullEducation = intermediateFullEducation;
    }


    @Override
    public String toString() {
        String info = "";

        if(personName != null){
            info = info + "Personal name - " + personName + "\n";
        }
        if(intermediateFullEducation != null){
            info = info + intermediateFullEducation.toString();
        }

        return info;
    }
}
