package kr.co.kh.ip_adress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HostFindMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String domain = null;
		InetAddress ia = null;
		
		System.out.print("통신하고자하는 도메인명: ");
		domain = scan.nextLine();
		
		try {
		ia = InetAddress.getByName(domain);
		} catch (UnknownHostException e) {
		}
		System.out.println(domain + " "+ ia.getHostAddress());
	}

}
