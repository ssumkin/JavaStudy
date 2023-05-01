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



class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}



public class superClass {   
    public static void main(String[] args) {
        // ColorPoint cp = new ColorPoint(5, 6, "blue");
        // cp.showColorPoint();

        Person p = new Student("이재문");
        System.out.println(p.name);

        Student s = (Student)p;

        System.out.println(s.name);
        s.grade = "A";
         
        if(p instanceof Person) {
            System.out.println("p true");
        }
        if(s instanceof Person) {
            System.out.println("s true");
        }
        if(p instanceof Student) {
            System.out.println("ps true");
        }
    }  

    
}


