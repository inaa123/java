package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
	
		console.out();
		browser.out();
		
		//입력받고싶다. 
		UI.in(); //in메소드가 UI에 있다는 것을알려주기 위하여. 콘솔인지 브라우전지 고민필요X
		
		System.out.println();
		Chrome chrome = new Chrome();
		//chrome.in(); static메소드 쓸수X
		chrome.out();
		chrome.play(); //play static메소드. chrome.in과 차이점이 뭐지?
		Chrome.play(); //play가 Browser에 있는 거지만 Chrome클래스로도 호출은 가능하지만 나ㅃ느코드!
		Browser.play(); // 이게 좋은 코드임.
	}
}
