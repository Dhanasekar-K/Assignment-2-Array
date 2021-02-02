package arrayassignment;

public class ArrayMerging {

	public static void main(String[] args) {
		int a[]={1,3,9,4,7,18};
		int b[]={15,5,9,13};
		int l1=a.length;
		int l2=b.length;
		int c1=l1+l2;
		int c[]=new int[c1];
		for(int i=0;i<l1;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<l2;i++)
		{
			c[l1+i]=b[i];
		}
		System.out.println("Array after Merging:");
		for(int i=0;i<c1;i++)
		{
			System.out.println(c[i]);
		}

	}

}
