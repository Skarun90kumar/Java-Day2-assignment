package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		int a=21;
		boolean flag=false;
		for (int i=2;i<=a/2;++i) {
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime");
		}
	}

}
