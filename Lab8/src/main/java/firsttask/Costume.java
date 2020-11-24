package firsttask;

public class Costume extends Clothes{
    double size;
    String color;

    public Costume(double size, String color)
    {
        this.size = size;
        this.color = color;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Sew()
    {
        Cut(size, color);
        System.out.println("Шьем костюм...");
        System.out.println("Завершено!");
    }
}
