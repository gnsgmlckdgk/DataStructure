package Common;

/**
 * 퀵 정렬(정수)
 * @author Hwang
 */
public class QuickSort {
	
	/**
	 * 두 정수 위치 교환
	 * @param arr
	 * @param idx1
	 * @param idx2
	 */
	private void swap(int arr[], int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;	
	}
	
	/**
	 * 분할 및 정렬
	 * @param arr
	 * @param left
	 * @param right
	 * @return
	 */
	private int partition(int arr[], int left, int right) {
		
		int pivot = arr[left];
		int low = left + 1;
		int high = right;
		
		while(low <= high) {
			while(low <= right && pivot >= arr[low]) {
				low++;
			}
			
			while(high >= (left+1) && pivot <= arr[high]) {
				high--;
			}
			
			if(low <= high) {	// 교차되지 않은 상태
				swap(arr, low, high);
			}
			
		}
		
		swap(arr, left, high);
		return high;	// right pivot
	}
	
	/**
	 * 퀵 정렬(정수)
	 * @param arr
	 * @param left
	 * @param right
	 */
	public void quickSort(int arr[], int left, int right) {

		if(left <= right) {
			int pivot = partition(arr, left, right);			
			quickSort(arr, left, pivot-1);		// 분할된 왼쪽 배열
			quickSort(arr, pivot+1, right);		// 분할된 오른쪽 배열
		}
	}
	
}
