import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("계좌 정보를 입력하세요");
		System.out.print("계좌명의 : ");
		String name = in.next();
		System.out.print("계좌번호 : ");
		String no = in.next();
		System.out.print("잔고 :");
		long balance = in.nextLong();
				
		Account a = new Account(name, no, balance);
		System.out.println("계좌 기본 정보 :" + a);
		//System.out.println("게좌기본정보: " + a.getName() + a.getNo() + a.getBalance());
		
		System.out.print("출금액 : ");
		long k = in.nextLong();
		a.deposit(k);
		System.out.println("잔금은 "+a.getBalance()+"입니다.");
		
		
	}

}
