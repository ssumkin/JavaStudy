class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color + " ");
        showPoint();
    }
} 

class A {
    public A() {
        System.out.println("생성자 A");
    }

    public A(int x) {
        System.out.println("매개변수 생성자 A");
    }
}

class B extends A {
    public B() {
        System.out.println("생성자 B");
    }

    public B(int x) {
        super(x);
        System.out.println("매개변수 생성자 B");
    }
}

public class superClass {   
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 6, "blue");
        cp.showColorPoint();
    }  

}


