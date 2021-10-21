import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 라인별 계산 항목
// 최소값, 최대값, 합계, 평균, 표준편차, 중간값
public class CSVReader {
	public static void main(String[] args) {
		
		//반환용 리스트
        List<List<String>> ret = new ArrayList<List<String>>();
        BufferedReader br = null;
        
        try{
            br = Files.newBufferedReader(Paths.get("C:\\Users\\dufrl\\Downloads\\sample.csv"));
            //Charset.forName("UTF-8");
            String line = "";
            
            while((line = br.readLine()) != null){
                //CSV 1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");
                //합구하기
                int sum = 0;
                for (int i = 10; i < array.length; i++) {
                	
					sum += Integer.parseInt(array[i]);
				}
                //배열에서 리스트 반환
                tmpList = Arrays.asList(array);
                Arrays.sort(array);
                System.out.println(array[array.length-1] + " " + array[0]);
                System.out.println(tmpList);
                System.out.println(sum);
                ret.add(tmpList);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }


	}

}

