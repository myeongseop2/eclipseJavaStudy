package java_study.co.kr.jooungbu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class L22FileWriter {

	public static void main(String[] args) {

		FileWriter fw = null; // 문자열을 파일로 출력하는 객체
		BufferedWriter bw = null; //보조 스트림
		
		try {
			fw = new FileWriter("newFile.txt"); //경로 + 파일이름 ( 상대경로 가능)
			bw = new BufferedWriter(fw);
			bw.write("안뇽하세요!!\nFileWriter로 파일");
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
