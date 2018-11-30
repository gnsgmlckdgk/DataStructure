package Sort;

public class SelectionSort implements Sort{

	@Override
	public void sorting(int[] arr, boolean ASC) {
		
		if(ASC) {
			selectionSort_ASC(arr);
		}else {
			selectionSort_DESC(arr);
		}
	}

	@Override
	public int[] getSorted(int[] arr, boolean ASC) {
		
		if(ASC) {
			selectionSort_ASC(arr);
		}else {
			selectionSort_DESC(arr);
		}
		
		return arr;
	}
	
	@Override
	public void swap(int arr[], int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;	
	}
	
	public SelectionSort() {
		System.out.println("선택 정렬");
	}
	
	/**
	 * 선택 정렬(오름차순)
	 * @param arr
	 */
	private void selectionSort_ASC(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			int minIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			swap(arr, i, minIdx);
		}
		
	}
	
	/**
	 * 선택 정렬(내림차순)
	 * @param arr
	 */
	private void selectionSort_DESC(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			int maxIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[maxIdx] < arr[j]) {
					maxIdx = j;
				}
			}
			swap(arr, i, maxIdx);
		}
	}
	
}
