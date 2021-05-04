package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Test1List {
	  public static void main(String[] args) throws IOException {
	      FileInputStream fis = new FileInputStream("student.txt");
	      int t = 0;
	      String student = "";
	      while((t=fis.read()) != -1) {
	         student = student + (char)t;
	      }
	      // System.out.println(student);
	      String[] arr = student.split("/");
	      
	      ArrayList<Integer> korList = new ArrayList<>();
	      ArrayList<Integer> engList = new ArrayList<>();
	      ArrayList<Integer> oriKorList = new ArrayList<>();
	      ArrayList<Integer> oriEngList = new ArrayList<>();
	      
	      for(int i=1; i<arr.length; i++) {
	         String[] arr2 = arr[i].split(","); //arr[1] = 88,60
	         korList.add(Integer.parseInt(arr2[0]));
	         engList.add(Integer.parseInt(arr2[1]));
	         oriKorList.add(Integer.parseInt(arr2[0]));
	         oriEngList.add(Integer.parseInt(arr2[1]));
	      }
	      // 1. 국어 리스트 출력
	      System.out.printf("1. 국어 리스트 출력");
	      for(int num : korList) {
	         System.out.print(num + " ");
	      } 
	      System.out.println();
	      // 2. 영어 리스트 출력
	      System.out.printf("2. 영어 리스트 출력");
	      for(int num : engList) {
	         System.out.print(num + " ");
	      }
	      System.out.println();
	      
	      // 3. 국어 정렬
	      System.out.printf("3. 국어 내림차순 리스트 출력");
	      Collections.sort(korList, Comparator.reverseOrder()); //내림차순
	      for(int num : korList) {
	         System.out.print(num + " ");
	      }
	      System.out.println();
	      System.out.printf("4. 국어 오름차순 리스트 출력");
	      Collections.sort(korList); //오름차순
	      for(int num : korList) {
	         System.out.print(num + " ");
	      }
	      System.out.println();      
	      
	      // 4. 영어 정렬
	      System.out.printf("5. 영어 내림차순 리스트 출력");
	      Collections.sort(engList, Comparator.reverseOrder()); //내림차순
	      for(int num : engList) {
	         System.out.print(num + " ");
	      }
	      System.out.println();
	      System.out.printf("6. 영어 오름차순 리스트 출력");
	      Collections.sort(engList); //오름차순
	      for(int num : engList) {
	         System.out.print(num + " ");
	      }
	      System.out.println();
	      
	      // 5. 국어 중앙값
	      System.out.printf("7. 국어 중앙값 리스트 출력");
	      int korCenter = 0;
	      if(korList.size() % 2 == 0 ) {
	         int centerIdx = korList.size()/2-1;
	         korCenter = (korList.get(centerIdx)+korList.get(centerIdx+1))/2;
	      } else {
	         int centerIdx = korList.size() / 2;
	         korCenter = korList.get(centerIdx);
	      }
	      System.out.println("korCenter: "+korCenter);
	      System.out.printf("8. 영어 중앙값 리스트 출력");
	      int engCenter = 0;
	      if(engList.size() % 2 == 0 ) {
	         int centerIdx = engList.size()/2-1;
	         engCenter = (engList.get(centerIdx)+engList.get(centerIdx+1))/2;
	      } else {
	         int centerIdx = engList.size() / 2;
	         engCenter = engList.get(centerIdx);
	      }
	      System.out.println("engCenter: "+engCenter);
	      
	      System.out.println("9. 국어 합계 평균");
	      int korSum = 0;
	      for(int k : korList) {
	         korSum = korSum+k;
	      }
	      System.out.println("korSum"+korSum);
	      System.out.println("korAvg"+(double)korSum/korList.size());
	      System.out.println("10. 영어 합계 평균");
	      int engSum = 0;
	      for(int k : engList) {
	         engSum = engSum+k;
	      }
	      System.out.println("engSum"+engSum);
	      System.out.println("engAvg"+(double)engSum/engList.size());
	      
	      System.out.println("11.국어 최대/최소값");
	      int korMin = korList.get(0);
	      int korMax = korList.get(0);
	      for(int k : korList) {
	         if(k < korMin) {
	            korMin = k;
	         }
	         if(k > korMax) {
	            korMax = k;
	         }
	      }
	      System.out.println("korMin: "+korMin);
	      System.out.println("korMax: "+korMax);
	      
	      System.out.println("12.영어 최대/최소값");
	      int engMin = engList.get(0);
	      int engMax = engList.get(0);
	      for(int k : engList) {
	         if(k < engMin) {
	            engMin = k;
	         }
	         if(k > engMax) {
	            engMax = k;
	         }
	      }
	      System.out.println("engMin: "+engMin);
	      System.out.println("engMax: "+engMax);

	      System.out.println("13.국어 + 영어 최대값");
	      int maxKorAndEng = oriKorList.get(0) + oriEngList.get(0);
	      for(int i=0; i<oriKorList.size(); i++) {
	         int korAndEng = oriKorList.get(i) + oriEngList.get(i);
	         if(korAndEng > maxKorAndEng) {
	            maxKorAndEng = korAndEng;
	         }
	      }
	      System.out.println("maxKorAndEng: "+maxKorAndEng);
	      
	      System.out.printf("14. 영어 점수 중복 제거: ");
	      HashSet<Integer> set = new HashSet<Integer>(engList);
	      for(int e : set) {
	         System.out.print(e+" ");
	      }
	   }
	}
