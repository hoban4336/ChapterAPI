package WrapperClass;

public class WrapperclassTest2 {
	public static void main(String[] args) {
		
		int i = Integer.parseInt("12345");
		
		//auto boxing �� �߻���.
		//Integer i2 = new Integer(i); �� �������ݾ� ~
		Integer i2 = Integer.parseInt("12345");
//		��ü�� int ������ ��ȯ���ڳ�
		String s2 = String.valueOf(i2);
		double d = Double.parseDouble("3.14");
		
		int num = Character.getNumericValue('A');
		System.out.println("a: "+num);
		
		int i3 = Integer.parseInt("f",16);
		System.out.println(i3);
		
		String s = Integer.toBinaryString(i3);
		System.out.println(s);
		
		int num1 = Integer.bitCount(15);
		System.out.println(num1);
		
		String hexStr = Integer.toHexString(255);
		System.out.println(hexStr);
		
		
		
	}
}
