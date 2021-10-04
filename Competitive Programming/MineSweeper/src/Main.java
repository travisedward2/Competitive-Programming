import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static public void main(String[] argv) {
		
		int count=0;
		Scanner scn=new Scanner(System.in);
		while(true) {

			int i=0,j=0;
			if(scn.hasNext()) {
				count++;
				
				ArrayList<String> input=new ArrayList<String>();
				i=scn.nextInt();
				j=scn.nextInt();
				if(i==0 && j==0) {
					scn.close();
					break;
				}
				scn.nextLine();
				int plate[][]=new int[i][j];
				for(int k=0;k<i;k++) {
					input.add(scn.nextLine());
				}
				construct(i,j,input,plate);
				System.out.println("Field #"+count+":");
				for(int a=0;a<i;a++) {
					for(int b=0;b<j;b++) {
						if(plate[a][b]==-1) {
							System.out.print('*');
						}
						else {
							System.out.print(plate[a][b]);
						}
					}
					System.out.println();
				}
				input=null;
				System.out.println();
//				scn.close();
				
			}
			
			
		}
		scn.close();
		
		

		
		
	}
	
	
	static public void construct(int i , int j ,ArrayList<String> input ,int x[][]) {
		for(int a=0;a<i;a++) {
			for(int b=0;b<j;b++) {
				if(input.get(a).charAt(b)=='*') {
					x[a][b]=-1;
				}
				else {
					if(a>0) {
						if(input.get(a-1).charAt(b)=='*') {
							x[a][b]++;
						}
						if(b>0) {
							if(input.get(a-1).charAt(b-1)=='*') {
								x[a][b]++;
							}
						}
						if(b<j-1) {
							if(input.get(a-1).charAt(b+1)=='*') {
								x[a][b]++;
							}
						}
						
					}
					if(a<i-1){
						if(input.get(a+1).charAt(b)=='*') {
							x[a][b]++;
						}
						if(b>0) {
							if(input.get(a+1).charAt(b-1)=='*') {
								x[a][b]++;
							}
							
						}
						if(b<j-1) {
							if(input.get(a+1).charAt(b+1)=='*') {
								x[a][b]++;
							}
						}	
					}
					
					if(b>0) {
						if(input.get(a).charAt(b-1)=='*') {
							x[a][b]++;
						}
						
					}
					if(b<j-1) {
						if(input.get(a).charAt(b+1)=='*') {
							x[a][b]++;
						}
						
					}
					
				}
				
			}
		}
		
	}
	

}
