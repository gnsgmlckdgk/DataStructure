package HashMap;

import List.LinkedList;
import List.List;

public class HashMap<T> implements Map<T> {
	
	final static int ARR_MAX = 100;	// 맵 크기
	private List<Slot<T>>[] tbl = null;
	
	/**
	 * 초기화
	 */
	public HashMap() {
		
		this.tbl = new LinkedList[ARR_MAX];	// 공간 확보
		
		for(int i=0; i<ARR_MAX; i++) {
			this.tbl[i] = new LinkedList<Slot<T>>();	// 초기화
		}
	}
	
	/**
	 * 기본 해쉬값 반환 함수
	 * @param k
	 * @return
	 */
	private int getHashVal(int k) {
		return k % ARR_MAX;
	}

	@Override
	public void insert(T data, int k) {
		
		int key = getHashVal(k);
		
		Slot<T> slot = new Slot<T>();
		slot.setKey(k);
		slot.setValue(data);
		
		tbl[key].insert(slot);
	}

	@Override
	public T delete(int k) {
		
		int key = getHashVal(k);
		
		Slot<T> delSlot = null;
		
		if(tbl[key].first()) {
			
			delSlot = tbl[key].getData();
			
			if(delSlot != null && delSlot.getKey() == k) {
				tbl[key].remove();
				return delSlot.getValue();
			
			}else {
				while(tbl[key].next()) {
					
					delSlot = tbl[key].getData();
					
					if(delSlot.getKey() == k) {
						tbl[key].remove();
						return delSlot.getValue();
					}
				}
			}
			
		}
		return null;
	}

	@Override
	public T search(int k) {
		
		int key = getHashVal(k);
		
		Slot<T> searchSlot = null;
		
		if(tbl[key].first()) {
			
			searchSlot = tbl[key].getData();
			
			if(searchSlot.getKey() == k) {
				return searchSlot.getValue();
			
			}else {
				while(tbl[key].next()) {
					
					searchSlot = tbl[key].getData();
					
					if(searchSlot.getKey() == k) {
						return searchSlot.getValue();
					}
				}
			}
			
		}
		
		return null;
	}

	@Override
	public void showAllData() {
		
		Slot<T> slot = null;
		
		for(int i=0; i<ARR_MAX; i++) {
			
			if(tbl[i].first()) {
				slot = tbl[i].getData();
				System.out.println(slot.getKey());
			
				while(tbl[i].next()) {
					slot = tbl[i].getData();
					System.out.println(slot.getKey());
				}
			}
		}
		
	}
}
