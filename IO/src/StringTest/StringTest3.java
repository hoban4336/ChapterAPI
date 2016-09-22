package StringTest;

public class StringTest3 {
	public static void main(String[] args) {
		String s = "aBcSweSWASsdwpd";
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.indexOf("sd")); //없으면 -1
		System.out.println(s.equals("abc"));
		System.out.println(s.replaceAll("a", "R")); //char
		System.out.println(s.replaceAll("sd", "abc")); //char[], String 변경
		System.out.println(s.substring(4)); //0~4
		System.out.println(s.substring(6, 10)); //6~9 ,10 하면 9까지 잘려서 나옴
		
		//concat 과  '+'연산의 차이
		String  a ="   ab   d  ";
		String  b ="f,asd";
		
		String dd = "as|wefa|werxcv|";
		
		String c= a.concat(b);
		System.out.println(c);
		System.out.println(a+b);
		
		System.out.println(a.trim()); //양쪽 옆에 공백을 없앤다! 가운데 공백 아니야!
		System.out.println(a.replaceAll(" ", "")); // 모든 공백을 없애기.
		
		String[] starr = dd.split("\\|"); //정규표현식
		for(String k:starr){
			System.out.println(k);
		}
		//정규표현식 [0-9]+  //모든 숫자 표현
		//[a-z] 		//소문자 알파벳
		//[a-zA-Z]		//대소문자
		//split("|") 	//정규표현식
		//split("\\|") 	//글자로 읽는방법.
		
		//+연산자
		String[] array = {"Hello","World","java"};
		String sA1 = "";
		for(String i : array){
			sA1=sA1+i;
		}
		
		String stri1 = "Hello"+ "World"+"java";
		//객체 끼리 못더한다.
		//내부에 String buffer가 생긴다.
//		StringBuffer s123 = new StringBuffer("Hello");
//		s123.append("world");
//		s123.append("java");
		
		String str123 = new StringBuffer("Hello").append("World").append("java").toString();
		// String Buffer 리턴이니까, toString()하여 값을 가져온다.
		
		
		
		
		
		
		
		}
}
