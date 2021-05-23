package kodlama.io.northwind.core.utilities.results;

public class SuccessResult extends Result {

	public SuccessResult() {
		super(true);

	}

	public SuccessResult(String massage) {
		super(true, massage);

	}

}
