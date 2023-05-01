class Shape { // 도형의 슈퍼 클래스
    public void draw() {
    System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // 메소드 오버라이딩
    System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // 메소드 오버라이딩
    System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() { // 메소드 오버라이딩
    System.out.println("Circle");
    }
}





    

class SuperObject {
    protected String name;
    public void paint() {
        draw();
    }
    public void draw() {
        System.out.println(name);
    }
}

class SubObject extends SuperObject {
    protected String name;
    public void draw() {
        name = "Sub";
        super.name = "Super";
        super.draw();
        System.out.println(name);
    }
}

public class overriding {



    static void paint(Shape p) { // 인자 값으로 Shape를 상속하는 인자가 오는 경우 아마 업캐스팅 돼서 실행 되는 것 같음
        p.draw();
    }

    
    public static void main(String[] args) {
        Line line = new Line();

        paint(line);

        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());

        SuperObject b = new SubObject();
        b.paint();
    }
}
