package kodlama.io.northwind.core.utilities;

import kodlama.io.northwind.core.utilities.results.Result;

public class DataResult<T> extends Result {
	
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data = data;
	}
	public DataResult(T data,boolean success) {
		super(success);
		this.data = data;
	}
	
	public T getData(){
		return this.data;
	}
}


















//super base sınıfın(Result sınıfın) constracterlarını çalıştırmaya yarıyor