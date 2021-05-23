package kodlama.io.northwind.core.utilities;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data,String massage) {
		super(data, false,massage);

	}
	
	public ErrorDataResult( T data) {
		super(data,false);
	}
	
	public ErrorDataResult(String massage) {
		super(null, false,massage);

	}
	
	public ErrorDataResult() {
		super(null, false);

	}

}