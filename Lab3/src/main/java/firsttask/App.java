package firsttask;

public class App {
    public static void main(String[] args){
        Education education = new Education("Sasha Pupkin", new IntermediateFullEducation(
                new School("School number 24", 11, false, 8.67),
                2019));

        education.showFullInfo();
    }
}
