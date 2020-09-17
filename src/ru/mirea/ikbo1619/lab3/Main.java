package ru.mirea.ikbo1619.lab3;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(1, 21, 33);
        Circle c2 = new Circle(12.33f);
        Circle c3 = new Circle();
        c3.setR(5.55f);
        System.out.println("Данные объекта с1: "+c1);
        System.out.println("Данные объекта с1: "+c2);
        System.out.println("Данные объекта с1: "+c3);

        Human.Lag noga1 = new Human.Lag("right",49);
        System.out.println("Данные объекта noga1: "+noga1);
    }
}
