package Common;

/**
 * 공통 함수
 * @author Hwang
 */
public class CommonUtil {
	
	/**
	 * 배열 출력
	 * @param arr
	 */
	public static void showAllIntArr(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(arr.length-1 != i)
				System.out.print(", ");
			else
				System.out.println();
		}	
	}	

}
