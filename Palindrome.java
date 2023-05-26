package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int b,temp,d;
		int c=451;
		temp=c;
		for(b=0;c>0;c/=10)
		{
			d=c%10;
			b=(b*10)+d;
					}
if(b==temp) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not palindrome");
}
	}

}
