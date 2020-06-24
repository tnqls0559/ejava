package ch04;

public class ArrayExample22 {

	public static void main(String[] args) {
		int[] score = {78,98,54,76,87};
		int max=0,min=100;
		int sum=0;
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) max=score[i];//최대값
			if(min>score[i]) min=score[i];//최소값
			sum+=score[i];
		}
		System.out.println("최소점수:"+min);
		System.out.println("최대점수:"+max);
        System.out.println("총점:"+sum);
        System.out.println("평균:"+(sum/score.length));
	}
}
