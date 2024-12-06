package kr.co.kh.bank;

public class BankTest {

	public static void main(String[] args) {
		Bank ba = new Bank("kdj", 1234, 10000);
		Bank otherBankAccount = new Bank("jgi", 5252, 10000000);

		// 입금
		boolean flag = ba.deposit(1000);
		if (!flag) {
			System.out.println("입금 문제발생됨");
			return;
		}

		System.out.println(ba);
		System.out.println(ba);
		System.out.println(otherBankAccount);

		// 출금
		flag = ba.withdraw(2000);
		if (!flag) {
			System.out.println("출금 문제발생됨");
			return;
		}
		System.out.println(ba);
		System.out.println(otherBankAccount);

		// 송금, 상대방계좌번호
		int result = ba.transfer(8000, otherBankAccount);
		if (result > 0) {
			System.out.println("송금이 완료되었습니다. 송금 금액: " + result);
		} else {
			System.out.println("송금 문제 발생됨");
		}

		System.out.println(ba);
		System.out.println(otherBankAccount);
	}

}
