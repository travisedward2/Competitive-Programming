import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		while(true) {
			int size = 0;
			if(scn.hasNextInt()) {
				size=scn.nextInt();
			}
			if(size==0) {
				break;
			}
			int[][] matrix=new int[size][size];
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					if(scn.hasNextInt()) {
						matrix[i][j]=scn.nextInt();	
					}
				}
			}
			ArrayList<Integer> row=new ArrayList<Integer>();
			ArrayList<Integer> column=new ArrayList<Integer>();
			for(int i=0;i<size;i++) {
				int tmp=0;
				for(int j=0;j<size;j++) {
					tmp+=matrix[i][j];
				}
				if(tmp%2==1) {
					row.add(i);
				}
			}
			
			for(int j=0;j<size;j++) {
				int tmp=0;
				for(int i=0;i<size;i++) {
					tmp+=matrix[i][j];
				}
				if(tmp%2==1) {
					column.add(j);
				}
			}
			if(column.size()==0 && row.size()==0) {
				System.out.println("OK");
			}
			else if(column.size()==1 && row.size()==1) {
				System.out.println("Change bit ("+(row.get(0)+1)+","+(column.get(0)+1)+")");
			}
			else {
				System.out.println("Corrupt");
			}
			
			
		}
		scn.close();
		
	}
}
