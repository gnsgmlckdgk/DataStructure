package Sort;

public class MergeSort implements Sort {

	@Override
	public void sorting(int[] arr, boolean ASC) {
		mergeSort(arr);				// 오름차순
		if(!ASC) reverseArray(arr);	// 내림차순
	}

	@Override
	public int[] getSorted(int[] arr, boolean ASC) {
		mergeSort(arr);				// 오름차순
		if(!ASC) reverseArray(arr);	// 내림차순
		return arr;
	}
	
	@Override
	public void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public MergeSort() {
		System.out.println("병합 정렬");
	}
	
	/**
	 * 배열값을 뒤집음
	 * ASC -> DESC로 하기 위해 만듬
	 * @param arr
	 */
	private void reverseArray(int arr[]) {
		
		int mid = arr.length / 2;
		int ridx = arr.length - 1;
		for(int i=0; i<=mid; i++) {
			swap(arr, i, ridx--);
		}
	}
	
	/**
	 * 병합 정렬
	 * @param arr
	 */
	private void mergeSort(int arr[]) {
		// 병합정렬 시작
		arrayPartition(arr, 0, arr.length-1);
	}
	
	/**
	 * 배열 반으로 나누기
	 * @param arr
	 * @param left
	 * @param right
	 */
	private void arrayPartition(int arr[], int left, int right) {

		int mid = (left + right) / 2;
		
		if(left >= right) {
			return;
		}
		
		// 배열을 나눔
		arrayPartition(arr, left, mid);			// 왼쪽
		arrayPartition(arr, mid+1, right);		// 오른쪽
		
		// 나누어진 배열을 병함
		twoArrayMerge(arr, left, mid, right);
		
	}

	/**
	 * 두 배열을 병합
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 */
	private void twoArrayMerge(int arr[], int left, int mid, int right) {
		
		int result[] = new int[arr.length];
		
		int lidx = left;
		int ridx = mid+1;
		
		int sidx = lidx;
		
		// 병합하면서 정렬
		while(lidx <= mid && ridx <= right) {
			
			if(arr[lidx] <= arr[ridx]) {
				result[sidx] = arr[lidx++];
			}else {
				result[sidx] = arr[ridx++];
			}
			
			sidx++;
		}
		
		// 왼쪽 배열에 남아있으면
		for(int i=lidx; i<=mid; i++) {
			result[sidx++] = arr[lidx++];
		}
		
		// 오른쪽 배열에 남아있으면
		for(int i=ridx; i<=right; i++) {
			result[sidx++] = arr[ridx++];
		}
		
		// 기존 배열에 정렬된 값 추가
		for(int i=left; i<=right; i++) {
			arr[i] = result[i];
		}
		
	}	// twoArrayMerge
}	// class







