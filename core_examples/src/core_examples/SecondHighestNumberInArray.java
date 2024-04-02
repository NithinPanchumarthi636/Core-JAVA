package core_examples;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {

		int arr[]= {20,24,50,79,100,125,33};
		int largest=0;
		int secondLargest = 0;
		System.out.println("The given array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest= arr[i];
			}
		
			else if(arr[i]>secondLargest) {
				secondLargest =arr[i];
			}
		}
		System.out.println("Second largest number is:"+ secondLargest);
		System.out.println("largest number is:"+largest);
	}

}
