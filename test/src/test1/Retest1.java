package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;

public class Retest1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		StringBuffer sb = new StringBuffer();
		fis = new FileInputStream("sn.txt");
		int temp = -1;
		while((temp=fis.read()) != -1) {
			sb.append((char)(temp));
		}
		String file = sb.toString();
		String[] arr= file.split(",");
		// 1) 몇명의 주민번호 인가(전체 인원)?
		System.out.println("전체 인원은?"+arr.length);
		
		String file1 = sb.toString().replace("-", "").replace(" ", "");
		String[] arr1 = file1.split(",");
		
		String[] human1 = new String[12];
		String[] human2 = new String[12];
		String[] human3 = new String[12];
		String[] human4 = new String[12];
		String[] human5 = new String[12];
		String[] human6 = new String[12];
		String[] human7 = new String[12];
		String[] human8 = new String[12];
		String[] human9 = new String[12];
		String[] human10 = new String[12];
		
		human1 = arr1[0].split("");
		human2 = arr1[1].split("");
		human3 = arr1[2].split("");
		human4 = arr1[3].split("");
		human5 = arr1[4].split("");
		human6 = arr1[5].split("");
		human7 = arr1[6].split("");
		human8 = arr1[7].split("");
		human9 = arr1[8].split("");
		human10 = arr1[9].split("");
		
		int man = 0;
		int woman = 0;
	
		if(human1[6].equals("1") || human1[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human2[6].equals("1") || human2[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human3[6].equals("1") || human3[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human4[6].equals("1") || human4[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human5[6].equals("1") || human5[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human6[6].equals("1") || human6[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human7[6].equals("1") || human7[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human8[6].equals("1") || human8[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human9[6].equals("1") || human9[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		if(human10[6].equals("1") || human10[6].equals("3")) {
			man+=1;
		} else {
			woman+=1;
		}
		
		System.out.println("남자 인원: "+ man+", 여자 인원: "+ woman);
		int a1=0, a2=0, a3=0, a4=0, a5=0, a6=0, a7=0, a8=0, a9=0, a10=0;
		int todayYear = Calendar.getInstance().get(Calendar.YEAR); 
		if(human1[0].equals("0")||human1[0].equals("1")) {
			String s1="20"+human1[0]+human1[1];
			a1 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human1[0]+human1[1];
			a1 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human2[0].equals("0")||human2[0].equals("1")) {
			String s1="20"+human2[0]+human2[1];
			a2 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human2[0]+human2[1];
			a2 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human3[0].equals("0")||human3[0].equals("1")) {
			String s1="20"+human3[0]+human3[1];
			a3 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human3[0]+human3[1];
			a3 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human4[0].equals("0")||human4[0].equals("1")) {
			String s1="20"+human4[0]+human4[1];
			a4 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human4[0]+human4[1];
			a4 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human5[0].equals("0")||human5[0].equals("1")) {
			String s1="20"+human5[0]+human5[1];
			a5 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human5[0]+human5[1];
			a5 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human6[0].equals("0")||human6[0].equals("1")) {
			String s1="20"+human6[0]+human6[1];
			a6 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human6[0]+human6[1];
			a6 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human7[0].equals("0")||human7[0].equals("1")) {
			String s1="20"+human7[0]+human7[1];
			a7 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human7[0]+human7[1];
			a7 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human8[0].equals("0")||human8[0].equals("1")) {
			String s1="20"+human8[0]+human8[1];
			a8 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human8[0]+human8[1];
			a8 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human9[0].equals("0")||human9[0].equals("1")) {
			String s1="20"+human9[0]+human9[1];
			a9 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human9[0]+human9[1];
			a9 = todayYear - Integer.parseInt(s1)+1;
		}
		if(human10[0].equals("0")||human10[0].equals("1")) {
			String s1="20"+human10[0]+human10[1];
			a10 = todayYear - Integer.parseInt(s1)+1;
		} else {
			String s1="19"+human10[0]+human10[1];
			a10 = todayYear - Integer.parseInt(s1)+1;
		}
		double x = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
		System.out.println("나이의 합은: "+x);
		System.out.println("나이의 평균은:"+x/arr.length);
		
		int[] ageArr = new int[10];
		ageArr[0]=a1;
		ageArr[1]=a2;
		ageArr[2]=a3;
		ageArr[3]=a4;
		ageArr[4]=a5;
		ageArr[5]=a6;
		ageArr[6]=a7;
		ageArr[7]=a8;
		ageArr[8]=a9;
		ageArr[9]=a10;
		int maxAge = 0;
		int minAge = 100;
		for(int i=0; i<ageArr.length; i++) {
			if(ageArr[i]>maxAge) {
				maxAge=ageArr[i];
			}
		}
		for(int i=0; i<ageArr.length; i++) {
			if(ageArr[i]<minAge) {
				minAge=ageArr[i];
			}
		}
		System.out.println("가장 많은 나이는? "+maxAge);
		System.out.println("가장 적은 나이는? "+minAge);	
		System.out.print("나이를 오름차순 정렬: ");
		for(int i=0; i<ageArr.length; i++) {
			Arrays.sort(ageArr);
			System.out.print(ageArr[i]+", ");
		}
		System.out.println();
		double median = 0;
		if(ageArr.length % 2 == 0) {
			int m = ageArr.length/2;
			int n = ageArr.length/2-1;
			median = (double)(ageArr[m]+ageArr[n])/2;
		} else {
			int m = ageArr.length/2;
			median = ageArr[m];
		}
		System.out.println("나이 중앙값: "+median);
	}
}
