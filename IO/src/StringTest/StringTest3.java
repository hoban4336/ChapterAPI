package StringTest;

public class StringTest3 {
	public static void main(String[] args) {
		String s = "aBcSweSWASsdwpd";
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.indexOf("sd")); //������ -1
		System.out.println(s.equals("abc"));
		System.out.println(s.replaceAll("a", "R")); //char
		System.out.println(s.replaceAll("sd", "abc")); //char[], String ����
		System.out.println(s.substring(4)); //0~4
		System.out.println(s.substring(6, 10)); //6~9 ,10 �ϸ� 9���� �߷��� ����
		
		//concat ��  '+'������ ����
		String  a ="   ab   d  ";
		String  b ="f,asd";
		
		String dd = "as|wefa|werxcv|";
		
		String c= a.concat(b);
		System.out.println(c);
		System.out.println(a+b);
		
		System.out.println(a.trim()); //���� ���� ������ ���ش�! ��� ���� �ƴϾ�!
		System.out.println(a.replaceAll(" ", "")); // ��� ������ ���ֱ�.
		
		String[] starr = dd.split("\\|"); //����ǥ����
		for(String k:starr){
			System.out.println(k);
		}
		//����ǥ���� [0-9]+  //��� ���� ǥ��
		//[a-z] 		//�ҹ��� ���ĺ�
		//[a-zA-Z]		//��ҹ���
		//split("|") 	//����ǥ����
		//split("\\|") 	//���ڷ� �д¹��.
		
		//+������
		String[] array = {"Hello","World","java"};
		String sA1 = "";
		for(String i : array){
			sA1=sA1+i;
		}
		
		String stri1 = "Hello"+ "World"+"java";
		//��ü ���� �����Ѵ�.
		//���ο� String buffer�� �����.
//		StringBuffer s123 = new StringBuffer("Hello");
//		s123.append("world");
//		s123.append("java");
		
		String str123 = new StringBuffer("Hello").append("World").append("java").toString();
		// String Buffer �����̴ϱ�, toString()�Ͽ� ���� �����´�.
		
		
		
		
		
		
		
		}
}
