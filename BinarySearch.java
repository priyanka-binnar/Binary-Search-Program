
import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	 int a[]= {7,4,9,8,3,2,1,10,56};
	 
	int key=56;
	//sort this array
	Arrays.sort(a);
	
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
		
	}
	
	
	System.out.println();
	
	
	int low=0;
	int high=a.length-1;
	
	 while(low<=high) {
		 int mid=(low+high)/2;
		 
		 if(key==a[mid]) {
			System.out.println("found at "+mid);
			return;
		 }
		 
		 else if(key>a[mid]) {
		 low=mid+1;
	 }else
		 
		 if(key<a[mid]) {
			high=mid-1;
			
		 }else {
			 System.out.println("not found");
		 }
	 }
	 
}
}
