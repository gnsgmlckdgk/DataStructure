package List;

public interface List<T> {
	/* s:LinkedList ADT */
	public abstract void insert(T data);
	public abstract boolean first();
	public abstract boolean next();
	public abstract T remove();
	public abstract int count();
	public abstract T getData();
	public abstract void showAllData();
	/* e:LinkedList ADT */
}
