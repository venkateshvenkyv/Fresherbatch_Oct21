
public class stringbuffer1 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("It is used to _ at the specified index position");
		s1.delete(14,15);
		s1.insert(14, "insert text");
		System.out.println(s1);
		
	}
}
