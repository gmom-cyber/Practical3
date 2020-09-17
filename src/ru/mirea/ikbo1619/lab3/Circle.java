package ru.mirea.ikbo1619.lab3;

public class Circle {
    private float r, c, s;//r - радиус, s - площадь круга, ограниченного окружностью, c - длинна окружности
    final float PI = 3.1415926535f;
    public Circle(float r, float c,float s)//Конструктор, на случай, если нам известны все параметры окружности
    {
        this.r = r;
        this.c = c;
        this.s = s;
    }
    public Circle(float r)//Конструктор, на случай, если нам известен только радиус
    {
        this.r = r;
        this.c = find_C(r);
        this.s = find_S(r);

    }

    public Circle()//Конструктор, на случай, если мы не знаем ничего...
    {
        this.r = 0.f;
        this.c = 0.f;
        this.s = 0.f;
    }
//Getters
    public float getC() {
        return c;
    }

    public float getR() {
        return r;
    }

    public float getS() {
        return s;
    }
//Методы для получения свойств
    public float find_C(float r){
        return 2*PI*r;

    }
    public float find_S(float r){
        return PI*r*r;

    }

    public void setR(float r) {//Setter для радиуса
        this.r = r;
        this.c = find_C(r);//параметры с и s установятся автоматически
        this.s = find_S(r);
    }

    @Override
    public String toString() {
        return "радиус r=" + r +
                ", длинна окружности c=" + c +
                ", прощать круга s=" + s;

    }
}
