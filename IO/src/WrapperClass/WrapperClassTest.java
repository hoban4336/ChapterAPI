package WrapperClass;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean( true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		Integer i2 = new Integer("10");
		System.out.println(i2);
		
		int i3 = 10; //Integer�� �����ϴϱ� �ڵ����� boxing�� �Ͼ.
		
		//Auto Boxing
		Integer i4 = 10;
		
		//Auto unBoxing
		//int i5 = i4.intValue(); //ĸ��ȭ������ �޼��带 ���� �����´�.
		int i5 = i4 +10;
		
		System.out.println(i4 + ":"+ i5);
		System.out.println("asd"+":"+ i4);
		
	}
	static String test(String s){
		String d = null ;
		return (s+d);
		
	}
}
