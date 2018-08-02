package List;

public interface List<T> {
	/* s:LinkedList ADT */
	
	/**
	 * 연결리스트에 data 삽입
	 * @param plist
	 * @param data
	 */
	public abstract void insert(T data);
	
	/**
	 * 연결리스트 첫번째 data 조회
	 * @return 데이터 없으면 0, 있으면 1
	 */
	public abstract boolean first();
	
	/**
	 * 연결리스트 첫번째 이후 data 조회
	 * @return 데이터 없으면 0, 있으면 1
	 */
	public abstract boolean next();
	
	/**
	 * 마지막 반환 data 삭제
	 * @return 삭제된 데이터
	 */
	public abstract T remove();
	
	/**
	 * 연결리스트에 저장되어있는 데이터 수 반환
	 * @return 데이터 수
	 */
	public abstract int count();
	
	/**
	 * 선택 위치의 데이터 반환
	 * @return 현재 위치 데이터
	 */
	public abstract T getData();
	
	/**
	 * 모든 데이터 출력
	 */
	public abstract void showAllData();
	
	/* e:LinkedList ADT */
}
