package iTprogrammingPractice;

interface ITProgramming{
	public abstract void subjectMethod();
}

class FrontEnd implements ITProgramming{
	String developTool;
	String name;
	
	public FrontEnd(String developTool, String name) {
		this.developTool = developTool;
		this.name = name;
	}

	@Override
	public void subjectMethod() {
		System.out.println("프론트엔드는 웹 사이트에서 UI 디자인을 뜻하는 개발입니다.");
	}
	
	public void frontEndMethod() {
		System.out.println("프론트엔드에는 다양한 개발툴이 존재하지만 " + this.developTool + "를 많이 사용하고 있고, 그 툴을 쓰는 언어는 " + this.name + "등 입니다.");
	}
}

class BackEnd implements ITProgramming{
	String developTool;
	String name;
	
	public BackEnd(String developTool, String name) {
		this.developTool = developTool;
		this.name = name;
	}

	@Override
	public void subjectMethod() {
		System.out.println("백엔드는 UI 화면에서 직접적으로 보여주는 것이 아닌 화면 뒤 서버에서 개발을 하고 작업을 하는 것을 뜻합니다.");
	}
	
	public void backEndMethod() {
		System.out.println("백엔드에서는 " + this.developTool + "등 이러한 개발툴들을 이용하여 작업을 진행하고, 이러한 개발툴을 진행하는 언어는 " + this.name + "입니다.");
	}
	
}

class FullStack implements ITProgramming{
	String developTool;
	String name;
	
	public FullStack() {
		
	}
	
	public FullStack(String developTool, String name) {
		this.developTool = developTool;
		this.name = name;
	}

	@Override
	public void subjectMethod() {
		System.out.println("풀스택은 앞에 설명한 프론트엔드, 백엔드를 모두 통칭하여 부르는 말입니다.");
	}
	
	public void fullStackMethod() {
		System.out.println("풀스택을 사용하여 프론트엔드, 백엔드를 전부 익혀놓으면 나중에 개발자로 취직을 할 때 도움이 더 됩니다.");
	}
}

public class ITprogrammingPractice {

	public static void main(String[] args) {
		ITProgramming itp = new FrontEnd("VS code", "HTML/CSS, React.js, javasript");
		itp.subjectMethod();
		
		FrontEnd fe = (FrontEnd) itp;
		fe.frontEndMethod();
		
		System.out.println();
		
		itp = new BackEnd("Eclipse, Intelij", "Java, Spring Framework, Spring Boot");
		itp.subjectMethod();
		
		BackEnd be = (BackEnd) itp;
		be.backEndMethod();
		
		System.out.println();
		
		itp = new FullStack();
		itp.subjectMethod();
		
		FullStack fs = (FullStack) itp;
		fs.fullStackMethod();

	}

}
