package BinaryTree;

/**
 * 이진트리
 * @author gnsgm
 * @param <T>
 */
public class BinaryTree<T> {
	
	/**
	 * 이진트리 노드 생성
	 * @return
	 */
	public BTreeNode<T> makeBTreeNode() {
		
		BTreeNode<T> newNode = new BTreeNode<T>();
		newNode.key = 0;
		newNode.data = null;
		newNode.left = null;
		newNode.right = null;
		
		return newNode;
	}
		
	/**
	 * 이진트리 노드 키 반환
	 * @param bt
	 * @return
	 */
	public int getKey(BTreeNode<T> bt) {
		return bt.key;
	}
	
	/**
	 * 이진트리 노드 데이터 반환
	 * @param bt
	 * @return
	 */
	public T getData(BTreeNode<T> bt) {
		return bt.data;
	}
	
	/**
	 * 이진트리 노드에 키, 데이터 삽입
	 * @param bt
	 * @param data
	 */
	public void setData(BTreeNode<T> bt, int key, T data) {
		bt.key = key;
		bt.data = data;
	}
	
	/**
	 * 이진트리 노드의 왼쪽 노드 반환
	 * @param bt
	 * @return
	 */
	public BTreeNode<T> getLeftSubTree(BTreeNode<T> bt) {
		return bt.left;
	}
	
	/**
	 * 이진트리 노드 오른쪽 노드 반환
	 * @param bt
	 * @return
	 */
	public BTreeNode<T> getRightSubTree(BTreeNode<T> bt) {
		return bt.right;
	}
	
	/**
	 * 이진트리 노드 왼쪽에 노드 생성
	 * @param main
	 * @param sub
	 */
	public void makeLeftSubTree(BTreeNode<T> main, BTreeNode<T> sub) {
		
		if(main.left != null)
			main.left = null;	// 기존 노드 삭제
		
		main.left = sub;
	}
	
	/**
	 * 이진트리 노드 오른쪽 노드 생성
	 * @param main
	 * @param sub
	 */
	public void makeRightSubTree(BTreeNode<T> main, BTreeNode<T> sub) {
		
		if(main.right != null)
			main.right = null;	// 기존 노드 삭제
		
		main.right = sub;
	}
	
	/**
	 * 전위순회 조회
	 * @param bt
	 */
	public void preOrderTraverse(BTreeNode<T> bt) {
		
		if(bt == null)
			return;
		
		System.out.println(bt.data);
		preOrderTraverse(getLeftSubTree(bt));
		preOrderTraverse(getRightSubTree(bt));
	}
	
	/**
	 * 중위순회 조회
	 * @param bt
	 */
	public void inOrderTraverse(BTreeNode<T> bt) {
		
		if(bt == null)
			return;
		
		inOrderTraverse(getLeftSubTree(bt));
		System.out.println(bt.data);
		inOrderTraverse(getRightSubTree(bt));
	}
	
	/**
	 * 후위순회 조회
	 * @param bt
	 */
	public void postOrderTraverse(BTreeNode<T> bt) {
		
		if(bt == null)
			return;
		
		postOrderTraverse(getLeftSubTree(bt));
		postOrderTraverse(getRightSubTree(bt));
		System.out.println(bt.data);
	}
	
}
