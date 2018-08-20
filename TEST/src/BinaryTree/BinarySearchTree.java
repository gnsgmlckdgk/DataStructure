package BinaryTree;

import java.util.Comparator;
import java.util.Objects;

/**
 * 이진탐색 트리
 * @author gnsgm
 * @param <T>
 */
public class BinarySearchTree<T> extends BinaryTree<T>{
	
	// 이진탐색트리 생성(생성자)
	public BinarySearchTree(BTreeNode<T> rootNode) {
		rootNode = null;
	}
	
	// 노드에 저장된 데이터 반환
	public T getDataBST(BTreeNode<T> bt) {
		return getData(bt);
	}
	
	// 이진탐색트리를 대상으로 데이터 저장(노드의 생성과정 포함)
	public void insertBST(BTreeNode<T> rootNode, int key, T data) {
		
		BTreeNode<T> pNode = null;		// parent node
		BTreeNode<T> cNode = rootNode;	// current node
		BTreeNode<T> nNode = null;		// new node
		
		while(cNode != null) {
			
			if(key == getKey(cNode)) {	// 키의 중복을 허락하지 않음
				System.out.println("키 중복!!");
				return;							
			}
			
			pNode = cNode;
			
			if(cNode.key > key)
				cNode = getLeftSubTree(cNode);
			else 
				cNode = getRightSubTree(cNode);	
		}
		
		nNode = makeBTreeNode();
		setData(nNode, key, data);
		
		if(pNode != null) {	// rootNode가 null이 아니라면
			if(pNode.key > key)
				makeLeftSubTree(pNode, nNode);
			else 
				makeRightSubTree(pNode, nNode);
				
		}else {	// rootNode가 null이면
			rootNode = nNode;
		}
		
	}
	
	// 이진탐색트리를 대상으로 키 값 탐색
	public BTreeNode<T> searchBST(BTreeNode<T> bt, int target) {
		
		BTreeNode<T> cNode = bt;
		
		while(cNode != null) {
			if(cNode.key == target) {
				return cNode;
			}else if(bt.key > target) {
				cNode = getLeftSubTree(cNode);
			}else {
				cNode = getRightSubTree(cNode);
			}
		}
		
		return null;	// 탐색대상이 저장되어 있지 않음.
	}
	
	/**
	 * 문자열이 정수인지 판별
	 * @param obj
	 * @return
	 */
	public boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
}
