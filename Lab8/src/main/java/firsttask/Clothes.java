package firsttask;

abstract class Clothes implements Fabric
{
    double totalSize = Fabric.totalSize;
    String[] colors = new String[] { "red", "black", "white", "gray" };

    public double getTotalSize(){
        return totalSize;
    }

    public void Cut(double size, String color) {
        if (size < totalSize && HasColor(color)){
            System.out.println("Отрезаем ткань...");
            totalSize = totalSize - size;
            System.out.println("Оствшееся количество - " + totalSize);
        }
        else if (size > totalSize)
            System.out.println("Недостаточно ткани");
        else if (!HasColor(color))
            System.out.println("Данного цвета нет в наличии");
        else
            System.out.println("Неверные данные");
    }

    public void Sew() {
        System.out.println("Шьем...");
        System.out.println("Завершено!");
    }

    public boolean HasColor(String color){
        for (String item : colors) {
            if (item.equals(color)) {
                return true;
            }
        }
        return false;
    }
}
