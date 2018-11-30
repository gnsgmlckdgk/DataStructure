package Sort;


public class InsertionSort implements Sort{

	@Override
	public void sorting(int[] arr, boolean ASC) {
		
		if(ASC) {
			insertionSort_ASC(arr);
		}else {
			insertionSort_DESC(arr);
		}		
	}

	@Override
	public int[] getSorted(int[] arr, boolean ASC) {
		
		if(ASC) {
			insertionSort_ASC(arr);
		}else {
			insertionSort_DESC(arr);
		}
		
		return arr;
	}

	@Override
	public void swap(int[] arr, int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public InsertionSort() {
		System.out.println("삽입 정렬");
	}
	
	/**
	 * 삽입 정렬(오름차순)
	 * @param arr
	 */
	private void insertionSort_ASC(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int sortValue = arr[i];	// 정렬 대상
			int changIndex = 0;
			for(int j=i-1; j>=0; j--) {
				if(sortValue < arr[j]) {
					arr[j+1] = arr[j];
				}else {
					changIndex = j+1;
					break;
				}
			}
			arr[changIndex] = sortValue;
		}
		
	}

	/**
	 * 삽입 정렬(내림차순)
	 * @param arr
	 */
	private void insertionSort_DESC(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int sortValue = arr[i];	// 정렬 대상
			int changIndex = 0;
			for(int j=i-1; j>=0; j--) {
				if(sortValue > arr[j]) {
					arr[j+1] = arr[j];
				}else {
					changIndex = j+1;
					break;
				}
			}
			arr[changIndex] = sortValue;
		}
		
	}
	
}
