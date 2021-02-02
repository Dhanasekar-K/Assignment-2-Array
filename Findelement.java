package arrayassignment;

import java.util.Scanner;

public class Findelement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a[]={1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int count=0;
		int location=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				location=i;
				count=1;
				break;
			}
			else
			{
				count=0;
			}
		}
		if(count==1)
		{
			System.out.println("Loaction of the no.is:"+location);
		}
		else
		{
			System.out.println(-1);

	}

	}
}
