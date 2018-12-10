package Sort;

public class BubbleSort implements Sort {

	@Override
	public void sorting(int[] arr, boolean ASC) {
		if(ASC) {
			BubbleSort_ASC(arr);
		}else {
			BubbleSort_DESC(arr);
		}
	}

	@Override
	public int[] getSorted(int[] arr, boolean ASC) {
		
		if(ASC) {
			BubbleSort_ASC(arr);
		}else {
			BubbleSort_DESC(arr);
		}
		
		return arr;
	}
	
	@Override
	public void swap(int arr[], int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;	
	}
	
	public BubbleSort() {
		System.out.println("버블 정렬");
	}
	
	/**
	 * 버블 정렬(오름차순)
	 * @param arr
	 */
	private void BubbleSort_ASC(int[] arr) {
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}	
	}
	
	/**
	 * 버블 정렬(내림차순)
	 * @param arr
	 */
	private void BubbleSort_DESC(int[] arr) {
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				
				if(arr[j] < arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	
}
