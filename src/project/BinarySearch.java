package project;


public class BinarySearch {
	static int binaryS(int[] arr,int low,int high,int key)
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key) return mid+1;
			else if(arr[mid]<key)
			{
				return binaryS(arr,mid+1,high,key);
			}
			else
			{
				return binaryS(arr,low,mid-1,key);
			}
			
		}
		return -1;
	}
	public static void main(String args[]) {
	     int []arr={1,4,6,7,9,13,45};
	     
	        int n = arr.length;
	        System.out.println(binaryS(arr,0,n-1,13));
	}

}
