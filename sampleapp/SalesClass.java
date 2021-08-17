package sampleapp;

public class SalesClass {

	public void display() {
		int[] arr= {23,45,56,78,6};
<<<<<<< HEAD
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("Array Size:" + arr.length);		
	}
	
=======
		int sum=0;
		for(int num:arr) {
			sum+=num;
			System.out.println(num);	
	    }
	
	    System.out.println("Summation: "+sum);
	}    
>>>>>>> branch 'master' of https://github.com/Anannya16/firstrepo.git
	public void print() {
		System.out.println("Print All Array Number:");
<<<<<<< HEAD
		System.out.println("Print All Array Number:");
=======
		for(int i=0;i<100;i++)
		System.out.println("Print i", + i);
>>>>>>> branch 'master' of https://github.com/Anannya16/firstrepo.git
		display();
	}

}
