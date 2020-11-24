package models;

import models.education.*;

public class EducationalProfile {
    private String personName;
    private IntermediateFullEducation intermediateFullEducation;
    private SecondarySpecialEducation secondarySpecialEducation;
    private HigherEducation higherEducation;

    public EducationalProfile(){};

    public EducationalProfile(String personName, IntermediateFullEducation intermediateFullEducation,
                              SecondarySpecialEducation secondarySpecialEducation, HigherEducation higherEducation){
        this.personName = personName;
        this.intermediateFullEducation = intermediateFullEducation;
        this.secondarySpecialEducation = secondarySpecialEducation;
        this.higherEducation = higherEducation;
    }

    public void ShowPersonalEducationInfo(){
        System.out.println(toString());
    }

    public IntermediateFullEducation getIntermediateFullEducation() {
        return intermediateFullEducation;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setIntermediateFullEducation(IntermediateFullEducation intermediateFullEducation) {
        this.intermediateFullEducation = intermediateFullEducation;
    }

    public HigherEducation getHigherEducation() {
        return higherEducation;
    }

    public SecondarySpecialEducation getSecondarySpecialEducation() {
        return secondarySpecialEducation;
    }

    public void setHigherEducation(HigherEducation higherEducation) {
        this.higherEducation = higherEducation;
    }

    public void setSecondarySpecialEducation(SecondarySpecialEducation secondarySpecialEducation) {
        this.secondarySpecialEducation = secondarySpecialEducation;
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

        if(secondarySpecialEducation != null){
            info = info + secondarySpecialEducation.toString();
        }

        if(higherEducation != null){
            info = info + higherEducation.toString();
        }

        return info;
    }
}
