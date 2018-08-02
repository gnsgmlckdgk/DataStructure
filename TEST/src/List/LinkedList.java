package List;

/**
 * 연결 리스트
 * @author gnsgm
 */
public class LinkedList<T> implements List<T>{

	private Node<T> head;		// 첫번째 Node
	private Node<T> before;		// 이전 Node
	private Node<T> cur;		// 현재 Node
	private int numOfData;	// 저장된 데이터 수
	
	/**
	 * 생성자
	 */
	public LinkedList() {
		// 더미노드 생성
		// Node->data형 지정
		Node<T> dummyNode = new Node<T>();
		dummyNode.data = null;
		dummyNode.next = null;
		
		this.head = dummyNode;
		this.cur = dummyNode;
		this.numOfData = 0;
	}
	
	
	/* s:ADT */
	
	/**
	 * 연결리스트에 data 삽입
	 * @param plist
	 * @param data
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = this.cur.next;
		
		this.head.next = newNode;
		this.numOfData++;
	}
	
	/**
	 * 연결리스트 첫번째 data 조회
	 * @return 데이터 없으면 0, 있으면 1
	 */
	public boolean first() {
		
		// 데이터 없음
		if(this.head.next == null) {
			return false;
		}
		
		this.before = this.head;
		this.cur = this.head.next;
		
		return true;
	}
	
	/**
	 * 연결리스트 첫번째 이후 data 조회
	 * @return 데이터 없으면 0, 있으면 1
	 */
	public boolean next() {
		
		// 데이터 없음
		if(this.cur.next == null) {
			return false;
		}
		
		this.before = this.cur;
		this.cur = this.cur.next;
		
		return true;
	}
	
	/**
	 * 마지막 반환 data 삭제
	 * @return 삭제된 데이터
	 */
	public T remove() {
	
		T delData = this.cur.data;
		
		this.before.next = this.cur.next;
		this.cur = null;
		this.cur = this.before;
		
		this.numOfData--;
		
		return delData;
	}
	
	/**
	 * 연결리스트에 저장되어있는 데이터 수 반환
	 * @return 데이터 수
	 */
	public int count() {
		
		return this.numOfData;
	}
	
	/**
	 * 선택 위치의 데이터 반환
	 * @return 현재 위치 데이터
	 */
	public T getData() {
		return this.cur.data;
	}
	
	/**
	 * 모든 데이터 출력
	 */
	public void showAllData() {
		
		if(first()) {
			System.out.println(getData());
		
			while(next()) {
				System.out.println(getData());
			}
		}else {
			System.out.println("데이터 없음");
		}
		
	}
	
	/* e:ADT */
}
