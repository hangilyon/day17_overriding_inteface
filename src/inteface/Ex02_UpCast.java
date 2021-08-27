package inteface;
class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex02_UpCast {
	public static void main(String[] args) {
		Parents par = new Parents();
		par.name();
		Daughter d = new Daughter(); 
		d.name();
		Son s = new Son();
		s.name();
		System.out.println("=====================");
		par = new Daughter();
		par.name();
		par = new Son();
		par.name();
	}
}
