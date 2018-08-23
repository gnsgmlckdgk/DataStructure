/* HashMap 테스트

import HashMap.HashMap;
import HashMap.Map;
import HashMap.Student;

public class HashMapMain {
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setGrade(1);
		std1.setId(104);
		std1.setName("홍길동");
		
		Student std2 = new Student();
		std2.setGrade(2);
		std2.setId(101);
		std2.setName("이순신");
		
		Student std3 = new Student();
		std3.setGrade(1);
		std3.setId(109);
		std3.setName("강감찬");
		
		Student std4 = new Student();
		std4.setGrade(3);
		std4.setId(102);
		std4.setName("을지문덕");
		
		Student std5 = new Student();
		std5.setGrade(2);
		std5.setId(107);
		std5.setName("광개토대왕");
		
		Map<Student> map = new HashMap<Student>();
		map.insert(std1, std1.getId());
		map.insert(std2, std2.getId());
		map.insert(std3, std3.getId());
		map.insert(std4, std4.getId());
		map.insert(std5, std5.getId());
		
		System.out.println("모든 학번 데이터 출력!!");
		map.showAllData();
		System.out.println("");	// /n
		
		// 데이터 삭제 후 출력
		Student delStd = map.delete(101);
		if(delStd==null) {
			System.out.println("삭제된 데이터가 없습니다.");
		}else {
			System.out.println("삭제된 데이터 정보");
			System.out.println("학번: " + delStd.getId());
			System.out.println("학년: " + delStd.getGrade());
			System.out.println("이름: " + delStd.getName());
		}
		
		System.out.println("삭제 후 모든 학번 데이터 출력!!");
		map.showAllData();
		System.out.println("");	// /n
		
		// 데이터 검색
		int searchKey = 102;
		Student searchStd = map.search(searchKey);
		if(searchStd==null) {
			System.out.println(searchKey + "번 학생의 정보가 없습니다.");
		}else {
			System.out.println("검색된 학생 정보");
			System.out.println("학번: " + searchStd.getId());
			System.out.println("학년: " + searchStd.getGrade());
			System.out.println("이름: " + searchStd.getName());
		}
	}
}
*/