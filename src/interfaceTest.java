/*
 * 자바의 인터페이스
 * 클래스가 구현해야 할 메소드들이 선언되는 추상형
 * interface 키워드로 선언
 * 필드(멤버 변수) 선언 불가
 */


interface PhoneInterface {
    final int TIMEOUT = 10000;    // 상수 필드. public static final 생략 가능
    void sendCall();            // 추상 메소드. public abstract 생략 가능
    void receiveCall();         // 추상 메소드. public abstract 생략 가능
    default void printLogo() {                  // 디폴트 메소드는 public 생략 가능
        System.out.println("** Phone **");
    }; // 디폴트 메소드
}
/* 인터페이스 구성 요소
 * 
 * 상수
 *  public 만 혀용, public static final 생략
 * 
 * 추상 메소드
 *  public abstact 생략 가능
 * 
 * default 메소드
 *  인터페이스에 코드가 작성 된 메소드
 *  인터페이스를 구현하는 클래스에 자동 상속
 *  public 접근 지정만 허용. 생략 가능
 * 
 * private 메소드
 *  인터페이스 내에 메소드 코드가 작성 되어야 함
 *  인터페이스 내에 있는 다른 메소드에 의해서만 호출 가능
 *  
 * static 메소드
 *  public, private 모두 지정 가능, 생략하면 public
 */


/*
 * 인터페이스 특징
 *  객체 생성 불가
 *  레퍼런스 변수는 선언 가능
 * 
 * 
 * 인터페이스 상속
 *  인터페이스를 상속하여 확장된 인터페이스 작성 가능
 *  extends 키워드로 상속 선언
 *  인터페이스 다중 상속 허용
 */
 
 
class SamsungPhone implements PhoneInterface { // 인터페이스
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}



class Calc {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends Calc implements PhoneInterface {
    public void sendCall() {
        System.out.println("따르릉따르릉~~");
    }

    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }

    public void schedule() {
        System.out.println("일정 관리합니다.");
    }
}

public class interfaceTest {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
        System.out.println();

        SmartPhone sp = new SmartPhone();
        sp.printLogo();
        sp.sendCall();
        sp.receiveCall();
        System.out.println("3과 5를 더하면 " + sp.calculate(3, 5));
        sp.schedule();
    }
}
