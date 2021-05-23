package kodlama.io.northwind.core.utilities;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data,String massage) {
		super(data, true,massage);

	}
	
	public SuccessDataResult( T data) {
		super(data,true);
	}
	
	public SuccessDataResult(String massage) {
		super(null, true,massage);

	}
	
	public SuccessDataResult() {
		super(null, true);

	}

}
