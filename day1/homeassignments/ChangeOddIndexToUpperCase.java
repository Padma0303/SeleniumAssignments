package week2.day1.homeassignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "changeme";
		
		char[] c = s.toCharArray();
		
		System.out.println(c);
		
		for (int i=0;i<c.length;i++)
		{
			if(i%2!=0) {
				c[i]= Character.toUpperCase(c[i]);
			}
		}
		String s1= String.copyValueOf(c);
		System.out.println(s1);
		

	}

}

