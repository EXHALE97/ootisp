package models.institutions;

import models.EducationalInstitute;

public class School extends EducationalInstitute {
    private int classCount;
    private boolean isGymnasium;

    public School(){};

    public School(String name, int graduateYear, int classCount, boolean isGymnasium){
        super(name, graduateYear);
        this.classCount = classCount;
        this.isGymnasium = isGymnasium;
    }

    public String getSchoolType(){
        if(isGymnasium){
            return "Gymnasium";
        } else return "High school";
    }

    public boolean isGymnasium() {
        return isGymnasium;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public void setGymnasium(boolean gymnasium) {
        isGymnasium = gymnasium;
    }

    @Override
    public String toString() {
        String info = "";

        info = info + super.toString();
        info = info + "School type - " + getSchoolType() + "\n";
        if(classCount != 0)
        info = info + "Class count - " + classCount + "\n";

        return info;
    }
}
