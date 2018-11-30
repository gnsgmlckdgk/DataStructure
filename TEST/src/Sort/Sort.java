package Sort;

public interface Sort {
	
	/**
	 * 정렬
	 * @param arr
	 * @param ASC	true(오름차순), false(내림차순)
	 */
	public void sorting(int[] arr, boolean ASC);
	
	/**
	 * 정렬
	 * @param arr
	 * @param ASC	true(오름차순), false(내림차순)
	 * @return 정렬된 값들 반환
	 */
	public int[] getSorted(int[] arr, boolean ASC);
	
	/**
	 * 두 정수 위치 교환
	 * @param arr
	 * @param idx1
	 * @param idx2
	 */
	public void swap(int arr[], int idx1, int idx2);
}
