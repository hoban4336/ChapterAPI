
public class ObjectTest3 {
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		Point p3 = p2;
		
		System.out.println(p1==p2); //== : 두객체의 동일성

		boolean t = p1.equals(p2);  // equals(): 두 객체의  동등성(내용 비교): hash code 비교.
		System.out.println(p2.equals("hello"));
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals(p1)); //override 했기때문에 false가 아니라 true 값이 된것!
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		
		//override 된이후에는 내용으로 hash코드를 만들기 때문에  s1 과 s2가 같은 값이 된다.
		//이는 HashSet과 같은 자료구조 타입에 같은 값을 넣지 않기위해 hashCode()를 override하여 내용기반으로 하기 위함이다.
		System.out.println(s1.hashCode() +":"+ s2.hashCode());
		
		//s1과 s2의 주소값을 기반으로한 hash코드는 사실 다름!
		System.out.println(System.identityHashCode(s1)+":"+System.identityHashCode(s2));
		
		String s11 ="ABC";
		String s22 ="ABC";
		
		System.out.println(s1.hashCode() +":"+ s2.hashCode());
		
		System.out.println(s11==s22); //true
		System.out.println(s11.equals(s22)); //true
	}
}
