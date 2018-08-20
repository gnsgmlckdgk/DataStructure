/* 이진 탐색트리 테스트

import BinaryTree.BTreeNode;
import BinaryTree.BinarySearchTree;

public class BinaryTreeMain {
	
	public static void main(String[] args) {
		
		BTreeNode<Integer> bstRoot = new BTreeNode<Integer>();	// bstRoot는 BST의 루트 노드를 가리킨다.
		BTreeNode sNode = null;
		
		// 이진탐색트리 생성
		BinarySearchTree<Integer> bstTree = new BinarySearchTree<Integer>(bstRoot);
		
		// 데이터 삽입
		bstTree.insertBST(bstRoot, 1, 1);
		bstTree.insertBST(bstRoot, 2, 2);
		bstTree.insertBST(bstRoot, 3, 3);
		bstTree.insertBST(bstRoot, 4, 3);
		bstTree.insertBST(bstRoot, 5, 3);
		bstTree.insertBST(bstRoot, 6, 3);
		bstTree.insertBST(bstRoot, 7, 3);
		
		// 탐색! 1이 저장된 노드를 찾아서!
		sNode = bstTree.searchBST(bstRoot, 2);
		
		if(sNode == null)
			System.out.println("탐색 실패 \n");
		else
			System.out.println("탐색에 성공한 키의 값: " + bstTree.getKey(sNode));
		
	}
	
}

*/
