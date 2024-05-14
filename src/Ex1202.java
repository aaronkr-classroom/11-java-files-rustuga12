
import java.io.File;
import java.io.IOException;
public class Ex1202 {

	public static void main(String[] args) {
	
			File fileObj = new File("src\\Ex1201.java"); //생성자
		
			
			if (fileObj.exists()) {
				System.out.println("파일의 이름: " + fileObj.getName());
				System.out.println("파일의 경로: " + fileObj.getAbsolutePath());
				System.out.println("파일 쓰기 가능? " + fileObj.canWrite());
				System.out.println("파일 읽기 가능? " + fileObj.canRead());
				System.out.println("파일의 크기: " + fileObj.length());
			} else {
				System.out.println("파일생성 실패");
			}

	} catch(IOException e) {
		System.out.println(e);
	}
}

	