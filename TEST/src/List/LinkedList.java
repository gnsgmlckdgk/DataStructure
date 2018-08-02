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
	public void insert(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = this.cur.next;
		
		this.head.next = newNode;
		this.numOfData++;
	}
	
	public boolean first() {
		
		// 데이터 없음
		if(this.head.next == null) {
			return false;
		}
		
		this.before = this.head;
		this.cur = this.head.next;
		
		return true;
	}
	
	public boolean next() {
		
		// 데이터 없음
		if(this.cur.next == null) {
			return false;
		}
		
		this.before = this.cur;
		this.cur = this.cur.next;
		
		return true;
	}

	public T remove() {
	
		T delData = this.cur.data;
		
		this.before.next = this.cur.next;
		this.cur = null;
		this.cur = this.before;
		
		this.numOfData--;
		
		return delData;
	}

	public int count() {
		
		return this.numOfData;
	}

	public T getData() {
		return this.cur.data;
	}

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
