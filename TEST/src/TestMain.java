import Common.CommonUtil;
import Common.QuickSort;

public class TestMain {
	
	public static void main(String[] args) {

		int arr[] = {3, 2, 4, 1, 7, 6, 5};
		//int arr[] = {2, 2, 2, 2, 2, 2};
		
		System.out.println("정렬하기 전  배열 출력");
		CommonUtil.showAllIntArr(arr);
		
		// 퀵 정렬
		QuickSort qsort = new QuickSort();
		qsort.quickSort(arr, 0, arr.length-1);
		
		System.out.println("정렬 후 배열 출력");
		CommonUtil.showAllIntArr(arr);
	}
	
}
