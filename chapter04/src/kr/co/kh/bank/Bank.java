package kr.co.kh.bank;

public class Bank {
	
	// 멤버변수
	private String name;		//이름
	private int accountNumber;	//계좌번호
	private int balance;		//잔액
	
	// 생성자(디폴트생성자, 매개변수 생성자)
	public Bank() {}
	public Bank(String name, int accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", accountNumber=" + accountNumber + ", balance=" + balance;
	}
	
	public boolean deposit(int money) {
		if(money<0) {
			System.out.println("금액은 음수x");
			return false;
		}
		balance += money;
		return true;
	}
	public boolean withdraw(int money) {
		if(money<0 || money > balance ) {
			System.out.println("금액과 잔액문제 발생");
			return false;
		}
		balance -= money;
		System.out.println(""+money+" 돈이 인출에 성공되었습니다. 잔액은 "+balance+"입니다.");
		return true;
	}
	
	public int transfer(int money, Bank otherAccount) {
        if (withdraw(money)) {
            otherAccount.deposit(money);
            System.out.println("성공적으로 송금되었습니다.");
            return money;
        } else {
            System.out.println("송금에 실패했습니다.");
            return 0;
        }
    }
}
