import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		int cases=0;
		Scanner scn=new Scanner(System.in);
		if(scn.hasNextLine()) {
			cases=Integer.parseInt(scn.nextLine());
		}
		for(int i=0;i<cases;i++) {
			int[] pos=new int[500];
			int relative_num=0;
			if(scn.hasNextInt()) {
				relative_num=scn.nextInt();
			}
			for(int j=0;j<relative_num;j++) {
				if(scn.hasNextInt()) {
					pos[j]=scn.nextInt();
				}
			}
			int ans=-1;
			int dis=Integer.MAX_VALUE;
			for(int k=1;k<30000;k++) {
				int total_dis=0;
				for(int j=0;j<relative_num;j++) {
					total_dis+=Math.abs(k-pos[j]);
				}
				if(total_dis<dis) {
					dis=total_dis;
				}
			}
			System.out.println(dis);
			
		}
	}

}
