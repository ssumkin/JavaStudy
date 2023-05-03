abstract class Shape { // 추상 메소드를 가진 추상 클래스
    public Shape() {}
    public void deit() {}

    abstract public void draw(); // 추상 메소드

} 

abstract class JComponent { // 추상 메소드 없는 추상 클래스
    String name;
    public void load(String name) {
        this.name = name;
    }
}


abstract class A1 {
    abstract public int add(int x, int y);
}

abstract class B1 extends A1 {
    public void show() { System.out.println("B"); }
}

 
/* 추상 클래스 구현
 * 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
*/
class C1 extends A1 {
    public int add(int x, int y) {
        return x + y;
    }

    public void show() {
        System.out.println("C");
    }
}


/*
 * 추상 클래스의 목적
 * 상속을 위한 슈퍼 클래스로 활용하는 것
 * 서브 클래스에서 추상 메소드 구현
 * 다형성 실현
 * 
 * 추상 클래스는 객체 생성 불가
 * 레퍼런스 변수는 선언 가능
 */

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

 

public class abstractTest extends Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double average(int[] a) {
        double sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum/a.length;
    }

    public static void main(String[] args) {
        C1 c = new C1();
        c.show();

        abstractTest a = new abstractTest();

        System.out.println(a.add(2, 3));
        System.out.println(a.subtract(2, 3));
        System.out.println(a.average(new int[]{1,2,3,4,5}));
    }

}
