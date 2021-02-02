package arrayassignment;

import java.util.Scanner;

public class Ascendingorder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements of array:");
		int no=sc.nextInt();
		
		
		int array[]=new int[no];
		System.out.println("Enter the elements of array:");
       for(int i=0;i<no;i++)
		{
			 array[i]=sc.nextInt();
			
		}
		System.out.println("Input Array :");
		for(int i=0;i<no;i++)
		{
			 System.out.println(array[i]);
			
		}
		
	
		System.out.println("sorted array: ");

		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{
				if(array[i]>array[j])
				{
					a=array[i];
					array[i]=array[j];
					array[j]=a;
				}
			}
			System.out.println(array[i]);

		}


	}

}
