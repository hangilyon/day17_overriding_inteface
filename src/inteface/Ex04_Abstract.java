package inteface;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo() ;
}
class NewAbstract extends Abstract{
	public void test() {

	}
	public void combo() {
		
	}
}
public class Ex04_Abstract {
	public static void main(String[] args) {
		NewAbstract na = new NewAbstract();
		na.setNum(3);
		na.combo();
	}
}
