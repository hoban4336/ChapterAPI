
public class Point {
	
	public Point() {
	}
	public Point(int i, int j) {
		this.x =i;
		this.y =j;
	}
	
/*	public Point(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}*/

	private int x;
	private int y;
	//private String color;
	private double z;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/*	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", color=" + color + "]";
	}*/
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		long temp;
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}
	
	/* source\generate hashcode(),equals() */
	//hash 코드를 같이 오버라이딩 하는 이유 : Object 중에서 hashCode를 사용하는 클래스들에게 영향이 간다.
	//ex) Collection: HashMap HashhSet HashTable
	//object 의 hashCode()는 주소기반으로 비교, String 또는 override hashCode()는 내용기반으로 비교
	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}*/
	
/*	@Override
	public boolean equals(Object obj) {
		if(this == obj){
		 return true;	
		}
		if(this.getClass() != obj.getClass()){
			return false;
		}
		//일관된 데이터 타입을 위한 캐스팅.
		Point other = (Point)obj;
		if(this.x != other.getX()){
			return false;
		}
		if(this.y != other.getY()){
			return false;
		}
		return true;
	}*/
	
	
	
	

}