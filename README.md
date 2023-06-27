package JavaTPC;

public class TPC07 {

	public static float sum(int a, float b) {
		float v = a+b;
		return v;
	}
	
	public static int arrSum(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// 메서드의 매개변수 전달기법
		/* 전달기법은 5가지 정도 있음
		 * 
		 * Call By Value
		 * 값을 전달 하는 것
		 * 매개변수로 받은 값을 저장하는 공간이 별도로 또 생성 됨
		 * 
		 * 
		 * Call By Reference
		 * 저장된 주소를 전달하는 것
		 * 같은 주소를 공유하는 것이기 때문에 별도의 공간이 생성되지 않고 같은 공간을 사용
		 * 
		 * 
		 * */

		
		
		int a = 20;
		float b = 56.7f;
		float v = sum(a, b); // Call By Value(값)
		System.out.println(v);
		
		
		int[] arr = {1, 2, 3, 4, 5};
		int vv = arrSum(arr); // Call By Reference(번지)
		System.out.println(vv);
	}

}

