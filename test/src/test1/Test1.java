package test1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;
public class Test1 {
	
	public static void main(String[] args) {
		FileInputStream fis = null; // fis 변수선언 (FileInputStream 클래스 : File의 바이트 스트림으로 읽음.)
		StringBuffer sb = new StringBuffer(); // StringBuffer은 한번 인스턴스가 생성되면 변경되지 않는 String과 다르게 내부적으로 buffer이라는 공간을 갖고, 값을 변경할 수 있도록 합니다.
		try {
			//FileInputStream은 파일을 불러오는 메소드.
			fis = new FileInputStream("student.txt"); //FileInputStream() 생성자 메서드 FileNotFoundException 발생
			int temp = -1;
			while((temp=fis.read()) != -1) { // temp값이 -1이 아니면 sb.append((char)(temp))가 출력 (fis)의 바이트 단위의 값이 -1이면 더이상 나올 것이 없다는 뜻.
				sb.append((char)(temp)); //temp를 문자형으로 강제 형변환 후, 
			}
			String file = sb.toString().replace("/", ","); // toString은 객체가 갖고있는 값들을 문자열로 만들어 리턴하는 것을 말합니다. replace는 /를 ,로 변경.
			String[] arr = file.split(",");	 // ,로 나누어 arr에 문자열 배열로 만듬.
			for(int i=0; i<arr.length; i++) {
				System.out.printf(arr[i]+", ");
			}
			System.out.println("\n");
			
			//숫자로만 이루어진 korList와 engList를 만들지 못하겠습니다..
			String[] korarr = new String[9];
			String[] engarr = new String[9];
			for(int i=0; i<korarr.length; i++) {
				korarr[i] = arr[i*2+2]; // 2 4 6 8 10 12 14 16 18 20
				engarr[i] = arr[i*2+3]; // 3 5 7 9 11 13 15 17 19 21
			}
			int [] korArr = Arrays.stream(korarr).mapToInt(Integer::parseInt).toArray();
			Integer[] korArr2 = Arrays.stream(korArr).boxed().toArray(Integer[] :: new);
			int [] engArr = Arrays.stream(engarr).mapToInt(Integer::parseInt).toArray();
			Integer[] engArr2 = Arrays.stream(engArr).boxed().toArray(Integer[] :: new);
			System.out.printf("korArr ");
			for(int i=0; i<korarr.length; i++) {
				System.out.printf(korArr[i]+", ");
			}
			System.out.println("\n");
			System.out.printf("engArr ");
			for(int i=0; i<engArr.length; i++) {
				System.out.printf(engArr[i]+", ");
			}
			System.out.println("\n");
			
			//2. 학생 10명의 국어와 영어 점수를 오름차순으로 출력하시오.
			for(int i= 0; i<korArr.length; i++) {
				Arrays.sort(korArr);
				System.out.printf(korArr[i]+", "); 
			}
			System.out.println("\n");
			for(int i= 0; i<engArr.length; i++) {
				Arrays.sort(engArr);
				System.out.printf(engArr[i]+", "); 
			}
			System.out.println("\n");
			
			//3. 학생 10명의 국어와 영어 성적을 내림차순으로 출력하시오..
			for(int i= 0; i<korArr.length; i++) {
				 Arrays.sort(korArr2,Comparator.reverseOrder());
				System.out.printf(korArr[i]+", "); 
			}
			System.out.println("\n");
			for(int i= 0; i<engArr.length; i++) {
				Arrays.sort(engArr2,Comparator.reverseOrder());
				System.out.printf(engArr[i]+", "); 
			}
			System.out.println("\n");
			
			//4. 학생 10명의 국어와 영어 점수 합계와 평균을 출력하시오. ex) 변수이름 korSum, korAvg, engSum, engAvg
			int korSum = 0, korAvg=0, engSum=0, engAvg=0;
			
			for(int i=0; i<korArr.length; i++) {
				korSum +=korArr[i];
				korAvg = korSum/korArr.length;
			}
			System.out.println("korSum: "+korSum + " korAvg: "+ korAvg);
			
			for(int i=0; i<engArr.length; i++) {
				engSum +=engArr[i];
				engAvg = engSum/engArr.length;
			}
			System.out.println("engSum: "+engSum + " engAvg: "+ engAvg);
			
			//5. 학생 10명의 국어와 영어 점수 최대/최소값을 출력하시오. ex) 변수이름 korMin, korMax, engMin, engMax
			int korMin = korArr[0], korMax= korArr[0], engMin= engArr[0], engMax= engArr[0];
			for(int i=0; i<korArr.length; i++) {
				if(korMax<korArr[i]) {
					korMax = korArr[i];
				}
				if(korMin>korArr[i]) {
					korMin = korArr[i];
				}
			}
			System.out.println("korMax: "+korMax+" korMin: "+korMin);
			for(int i=0; i<engArr.length; i++) {
				if(engMax<engArr[i]) {
					engMax = engArr[i];
				}
				if(engMin>engArr[i]) {
					engMin = engArr[i];
				}
			}
			System.out.println("engMax: "+engMax+" engMin: "+engMin);
			
			//6. 학생 10명의 국어와 영어  점수 중앙값(중위수)을 출력하시오. ex) 변수이름 korMedian, engMedian
			float korMedian = 0, engMedian=0;
			if(korArr.length % 2 == 0) {
				Arrays.sort(korArr);
				int m = korArr.length/2;
				int n = korArr.length/2-1;
				korMedian = (float)(korArr[m]+korArr[n])/2;
			} else {
				int m = korArr.length/2;
				korMedian = korArr[m];
			}
			System.out.println("korMedian: "+korMedian);
			if(engArr.length % 2 == 0) {
				Arrays.sort(engArr);
				int m = engArr.length/2;
				int n = engArr.length/2-1;
				korMedian = (float)(engArr[m]+engArr[n])/2;
			} else {
				int m = engArr.length/2;
				engMedian = engArr[m];
			}
			System.out.println("engMedian: "+engMedian);
			
			//7. 학생 10명의 영어 성적의 중복값을 제거 후 출력하시오.
			Set<Integer> set = new HashSet<>();
			for(int loop : engArr) {
				set.add(loop);
			}
			Stream<Integer> setEng = set.stream();
			System.out.print("newEngArr: ");
			setEng.forEach(out -> System.out.print(out + " "));
			System.out.println();
			
			//8. 학생 10명중 국어+영어 점수의 합이 가장 높은 학생의 점수를 출력하시오. ex) 변수이름 korAndEngSum
			int[] korAndEngSum = new int[9];
			int korAndEngSumMax=0;
			for(int i=0; i<korArr.length; i++) {
				korAndEngSum[i] = korArr[i]+engArr[i];
				if(korAndEngSumMax<korAndEngSum[i]) {
					korAndEngSumMax = korAndEngSum[i];
				}
			}
			System.out.println("korAndEngSumMax: "+korAndEngSumMax);
		/*1. korList, engList
			for(int i= 2; i<arr.length; i++) {
				if(i%2==1) {
					System.out.printf(arr[i]+", ");
				} 
			}
			System.out.println("\n");
			for(int i= 1; i<arr.length; i++) {
				if(i%2==0) {
					System.out.printf(arr[i]+", ");
				} 
			}
			System.out.println("\n");
			
			//2. 오름차순
			for(int i= 0; i<arr.length; i++) {
				if(i%2==1) {
					Arrays.sort(arr);
					System.out.printf(arr[i]+", ");
				} 
			}
			System.out.println("\n");
			for(int i= 0; i<arr.length; i++) {
				if(i%2==0) {
					Arrays.sort(arr);
					System.out.printf(arr[i]+", ");
				} 
			}
			System.out.println("\n");
			
			//3. 내림차순
			for(int i= 0; i<arr.length; i++) {
				if(i%2==1) {
					 Arrays.sort(arr,Collections.reverseOrder());
					System.out.printf(arr[i]+", ");
				} 
			}
			System.out.println("\n");
			for(int i= 0; i<arr.length; i++) {
				if(i%2==0) {
					 Arrays.sort(arr,Collections.reverseOrder());
					System.out.printf(arr[i]+", ");
				} 
			}
			*/
		
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
