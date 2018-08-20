package HashMap;

public interface Map<T> {

	/**
	 * Map에 데이터 삽입
	 * @param obj
	 * @param k(고유값)
	 */
	public void insert(T data, int k);
	
	/**
	 * Map에서 데이터 삭제
	 * @param k(고유값)
	 * @return null이면 삭제된 값이 없음
	 */
	public T delete(int k);	
	
	/**
	 * Map에서 특정 데이터 조회
	 * @param k(고유값)
	 * @return null이면 조회된 값이 없음
	 */
	public T search(int k);
	
	/**
	 * 모든 데이터 출력
	 */
	public void showAllData();
	
}
