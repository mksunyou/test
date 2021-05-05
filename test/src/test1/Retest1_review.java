package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;

public class Retest1_review {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sn.txt");
		StringBuffer sb = new StringBuffer();
		int temp = -1;
		while((temp=fis.read())!=-1) {
			sb.append((char)(temp));
		}
		String file = sb.toString().replace("-", "").replace(" ", "");		
		String[] arr2 = file.split(",");	
		
		// 1) 몇명의 주민번호 인가(전체 인원)?
		System.out.println("1) 전체 인원은"+arr2.length);
		
		String[][] arr = new String[10][13];
		for(int i=0; i<arr.length;i++) {
			arr[i]=arr2[i].split("");
		}
		
		// 2) 남자는 몇명, 여자는 몇명인가?
		int man = 0;
		int woman = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i][6].equals("1")||arr[i][6].equals("3")) {
				man+=1;
			} else {
				woman+=1;
			}
		}
		System.out.println("2) 남자 인원은: "+man+", 여자 인원은: "+woman);
		// 3) 주민번호를 이용하여 전체 인원의 나이 합계를 구하시오.
		
		int[] ageArr = new int[arr2.length];
		int todayYear = Calendar.getInstance().get(Calendar.YEAR);
		int age=0, ageSum=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i][0].equals("0")||arr[i][0].equals("1")) {
				String s = "20"+arr[i][0]+arr[i][1];
				age=todayYear-Integer.parseInt(s)+1;
			} else {
				String s = "19"+arr[i][0]+arr[i][1];
				age=todayYear-Integer.parseInt(s)+1;
			}
			ageArr[i]=age;
			ageSum+=age;
		}
		System.out.println("3) 나이의 합계: "+ageSum);
		
		// 4) 주민번호를 이용하여 전체 인원의 나이 평균을 구하시오.
		System.out.println("4) 나이의 평균: "+(double)ageSum/ageArr.length);
		
		// 5) 나이가 가장 많은 사람의 나이는?
		int maxAge=0;
		for(int i=0; i<ageArr.length; i++) {
			if(maxAge<ageArr[i]) {
				maxAge=ageArr[i];
			}
		}
		System.out.println("5) 가장 많은 나이: "+maxAge);
		
		// 6) 나이가 가장 어린 사람의 나이는?
		int minAge=100;
		for(int i=0; i<ageArr.length; i++) {
			if(minAge>ageArr[i]) {
				minAge=ageArr[i];
			}
		}
		System.out.println("6) 가장 어린 나이: "+minAge);
		
		// 7) 나이를 오름차순으로 정렬하여 출력하시오.(Collections, Arrays API 사용가능)
		System.out.print("7) 나이의 오름차순 배열: ");
		for(int i=0; i<ageArr.length; i++) {
			Arrays.sort(ageArr);
			System.out.print(ageArr[i]+", ");
		}
		System.out.println();
		
		//8) 주민번호를 이용하여 전체 인원의 나이 중앙값을 구하시오.
		double median = 0;
		if(ageArr.length % 2 == 0) {
			int m = ageArr.length/2;
			int n = ageArr.length/2-1;
			median = (double)(ageArr[m]+ageArr[n])/2;
		} else {
			int m = ageArr.length/2;
			median = ageArr[m];
		}
		System.out.println("8) 나이 중앙값: "+median);
	}
}
