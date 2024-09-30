package test;

public class ErstesProgramm
{
	
	public static void main(String[] args)
	{
		int temp;
		int arr[]= {23,11,37,90};
		for (int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1;j++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}		
			}
			
				System.out.println(arr[i]);
				
		}
			
	}	
}


