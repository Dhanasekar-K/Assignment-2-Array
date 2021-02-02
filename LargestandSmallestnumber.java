package arrayassignment;

public class LargestandSmallestnumber {

	public static void main(String[] args) {
		int a;
		int array[]={12,15,8,9,45,66,33,45,98};
		int count=array.length;
		System.out.println("Array after sorting: ");

		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
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
		System.out.println("Largest number: "+array[count-1]);
		

		System.out.println("Smallest number : "+array[0]);

		
	}

}
