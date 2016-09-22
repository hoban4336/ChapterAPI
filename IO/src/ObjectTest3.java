
public class ObjectTest3 {
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		Point p3 = p2;
		
		System.out.println(p1==p2); //== : �ΰ�ü�� ���ϼ�

		boolean t = p1.equals(p2);  // equals(): �� ��ü��  ���(���� ��): hash code ��.
		System.out.println(p2.equals("hello"));
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals(p1)); //override �߱⶧���� false�� �ƴ϶� true ���� �Ȱ�!
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		
		//override �����Ŀ��� �������� hash�ڵ带 ����� ������  s1 �� s2�� ���� ���� �ȴ�.
		//�̴� HashSet�� ���� �ڷᱸ�� Ÿ�Կ� ���� ���� ���� �ʱ����� hashCode()�� override�Ͽ� ���������� �ϱ� �����̴�.
		System.out.println(s1.hashCode() +":"+ s2.hashCode());
		
		//s1�� s2�� �ּҰ��� ��������� hash�ڵ�� ��� �ٸ�!
		System.out.println(System.identityHashCode(s1)+":"+System.identityHashCode(s2));
		
		String s11 ="ABC";
		String s22 ="ABC";
		
		System.out.println(s1.hashCode() +":"+ s2.hashCode());
		
		System.out.println(s11==s22); //true
		System.out.println(s11.equals(s22)); //true
	}
}
