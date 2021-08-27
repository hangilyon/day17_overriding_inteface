package inteface;

import java.util.Scanner;

interface A공방{
	public void attack(); //공격을 만드세요
	public void defense(); // 방어를 만드세요
	
}
class AA지상군 implements A공방{
	public void attack() {
		System.out.println("지상군 공격");
	}
	public void defense() {
		System.out.println("지상군 방어");
	}
}
class BB공군 implements A공방{
	public void attack() {
		공격준비();
		System.out.println("공군 공격");
	}
	public void defense() {
		System.out.println("공군 방어");
	}
	public void 공격준비() {System.out.println("공격준비끝");}
	public void 공격준비10초전() {}
	public void 방어준비() {}
}
public class Ex07 {
	public static void main(String[] args) {
		/*
		AA지상군 a = new AA지상군();
		BB공군 b = new BB공군();
		a.attack(); a.defense();
		b.attack(); b.defense();
		
		A공방 aa = new BB공군();
		aa.attack();
		*/
		AA지상군 지상군 = new AA지상군();
		BB공군 공군 = new BB공군();
		A공방 공방 = null;
		Scanner sc = new Scanner(System.in);
		int num=0, choice=0;
		System.out.println("적이 쳐들어 왔습니다.");
		System.out.println("1. 지상군 2. 공군");
		num = sc.nextInt();
		if(num ==1) {
			공방 = new AA지상군();
			System.out.println("지상군 선택 완료");
		}else {
			공방 = new BB공군();
			System.out.println("공군 선택 완료");
		}
		System.out.println("1.공격 2.방어");
		choice = sc.nextInt();
		if(choice == 1) {
			공방.attack();
		}else {
			공방.defense();
		}
		/*
		if(choice ==1 && num ==1) {
			//System.out.println("지상군이 공격을 합니다.");
			지상군.attack();
		}else if ( choice ==2 && num ==1) {
			//System.out.println("지상군이 방어를 합니다.");
			지상군.defense();
		}
		if(choice ==1 && num ==2) {
			//System.out.println("공군이 공격을 합니다.");
			공군.attack();
		}else if ( choice ==2 && num ==2) {
			//System.out.println("공군이 방어를 합니다.");
			공군.defense();
		}
		*/
	}
}
