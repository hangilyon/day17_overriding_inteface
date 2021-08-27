package inteface;
class A{
	public void print() {
		System.out.println("A클래스");
		
	}
}
class B extends A{
	public void print() {
		System.out.println("B클래스");
	}
}
class C extends A{
	public void print() {
		System.out.println("C클래스");
	}
}
public class Ex01_UpCast {
	public static void main(String[] args) {
		/*B b = new B();
		b.print();
		C c = new C();
		c.print();
		*/
		A a = new B(); //자식 형태에서 부모 형태로 변환
		a.print();
		a = new C();
		a.print();
	}
}

