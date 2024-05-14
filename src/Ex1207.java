import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader; 

public class Ex1207 {

	public static void main(String[] args) {
		File file = new File ("member.txt");
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fr = new FileReader(file);
			// int i = 0;
			BufferedREADER br = new BufferedREADER(fr);
			String str;
			
			while ((str=br.readLine()) != null) { // EOF까지
				System.out.println(str);
			}
					
			
			while (( i = fr.read()) != -1) {
				System.out.print((char) i);
				
			}
			fr.close();
			System.out.println("파일 읽기 성공 !");
		}

	}

}
