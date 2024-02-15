package hw6;

public class CalException extends Exception {
	//無參數建構子，呼叫父類別的無參數建構子。
	public CalException() {
		super();
	}
	//帶參數的建構子，接受一個錯誤訊息，並呼叫父類別的帶參數建構子，設置異常訊息。
	public CalException(String message) {
		super(message);
	}
}
