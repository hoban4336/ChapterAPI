
public class ObjectTest {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.getClass().getName()); //java reflection 기법
		System.out.println(p.hashCode()); //hashcode: hashing 알고리즘에 의해 규칙적인 값을 만드는것 for hash table // 캐시메모리와 같은 원리. 
		//객체의 주소값을 hashing 하는데,  
		System.out.println(p.toString()); // hashcode의 16진수 값! 주소값 아니야!
		System.out.println(p);
		
		System.out.println(System.identityHashCode(p));
		
	}
}


