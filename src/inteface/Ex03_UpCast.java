package inteface;

import java.util.ArrayList;
class Aclass{
	public String print() {
		return "A클래스";
	}
}
public class Ex03_UpCast {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Aclass aa = new Aclass();
		arr.add(111);
		arr.add("111");
		arr.add(1.11);
		Object a = 100;
		Object s = "test";
		Object d = 1.111;
		int dd = (int)a + 200;
		
		System.out.println(a+""+s+""+d);
		
		Object aClass = new Aclass();
		Aclass ac = (Aclass)aClass;
		
	}
}
