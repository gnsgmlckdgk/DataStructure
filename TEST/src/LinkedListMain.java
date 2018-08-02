import List.List;
import List.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {

		// 연결리스트 생성
		List<Integer> list = new LinkedList<Integer>();
		
		// 연결리스트에 데이터 삽입
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		
		// 모든 데이터 출력
		System.out.println("모든 데이터 출력");
		list.showAllData();
		
		// 데이터 수 출력
		System.out.println("데이터 수 : " + list.count());
		
		// 데이터 3, 6 삭제
		if(list.first()) {
			if(list.getData() == 5 || list.getData() == 6)
				list.remove();
			
			while(list.next()) {
				if(list.getData() == 5 || list.getData() == 6) {
					list.remove();
				}
			}
		}
		
		// 모든 데이터 출력
		System.out.println("\n삭제후 데이터");
		list.showAllData();
		
		// 데이터 수 출력
		System.out.println("데이터 수 : " + list.count());
	}
}
