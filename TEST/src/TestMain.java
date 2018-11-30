import Common.CommonUtil;
import Sort.InsertionSort;
import Sort.MergeSort;
import Sort.QuickSort;
import Sort.SelectionSort;
import Sort.Sort;

public class TestMain {
	
	public static void main(String[] args) {

		System.out.println("정렬전 배열");
		int[] arr = {7, 2, 9, 3, 8, 1, 4, 5, 6};
		CommonUtil.showAllIntArr(arr);
		System.out.println();
		
		Sort sort = new QuickSort();
		sort.sorting(arr, true);
		CommonUtil.showAllIntArr(arr);
		
		sort.sorting(arr, false);
		CommonUtil.showAllIntArr(arr);
	}
	
}
