package kr.co.kh.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain {

	public static void main(String[] args) {
		//Path 클래스정보를 알아보자
		Path path = Path.of("D:\\javaTest\\chapter15\\test.tst)");
		System.out.println("전체경로 : " +path.toString());
		System.out.println("파일이름 : "+path.getFileName());
		System.out.println("보물이름 : " +path.to);
		System.out.println("전체경로 : " +path.to);
	}	
}