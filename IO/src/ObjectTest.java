
public class ObjectTest {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.getClass().getName()); //java reflection ���
		System.out.println(p.hashCode()); //hashcode: hashing �˰��� ���� ��Ģ���� ���� ����°� for hash table // ĳ�ø޸𸮿� ���� ����. 
		//��ü�� �ּҰ��� hashing �ϴµ�,  
		System.out.println(p.toString()); // hashcode�� 16���� ��! �ּҰ� �ƴϾ�!
		System.out.println(p);
		
		System.out.println(System.identityHashCode(p));
		
	}
}


