import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void flip(ArrayList<Integer> pancakes,int totalPancakes,int index) {
		for(int i=0;i<=index/2;++i) {
			int temp=pancakes.get(i);
			pancakes.set(i, pancakes.get(index-i));
			pancakes.set(index-i, temp);
	
			
		}
		System.out.print(totalPancakes-index);
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(scn.hasNextLine()) {
			Scanner line=new Scanner(scn.nextLine());
			ArrayList<Integer> pancakes=new ArrayList<Integer>();
			int totalPancakes=0;
			if(!line.hasNextInt()) break;
			while(line.hasNextInt()) {

				pancakes.add(line.nextInt());
				System.out.print(pancakes.get(totalPancakes));
				if(line.hasNextInt()) {
					System.out.print(" ");
				}
				totalPancakes++;
				
			}
			System.out.println();
			
			boolean isPrint=false;
			for(int i=0;i<totalPancakes;++i) {
				int maxIndex=0;
				for(int j=1;j<totalPancakes-i;++j) {
					if(pancakes.get(j)>pancakes.get(maxIndex)) {
						maxIndex=j;
					}
				}
				
				if(maxIndex==totalPancakes-i-1) {
					continue;
				}
				else {
					if(isPrint) {
						System.out.print(" ");
						
					}
					if(maxIndex==0) {
						flip(pancakes,totalPancakes,totalPancakes-i-1);
					}
					else {
						flip(pancakes,totalPancakes,maxIndex);
						System.out.print(" ");
						flip(pancakes,totalPancakes,totalPancakes-i-1);
					}
					isPrint=true;
				}
				
			}
			if(isPrint) {
				System.out.print(" ");
				
			}
			System.out.println("0");
			
			
		}
	}
}
