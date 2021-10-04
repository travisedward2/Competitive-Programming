import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		PriorityQueue<Integer> sequence = new PriorityQueue<Integer>();
		while(true) {

			if(scn.hasNextLine()) {
				Scanner line=new Scanner(scn.nextLine());
				ArrayList<Integer> list=new ArrayList<Integer>();
				sequence.clear();
				int size=0;
				if(line.hasNextInt()) {
					 size=line.nextInt();
				}
				else {
					break;
				}

				for(int i=0;i<size;i++) {
					list.add(line.nextInt());
				}
				for(int i=0;i<list.size()-1;i++) {
					if(!sequence.contains(Math.abs(list.get(i)-list.get(i+1)))) {
						sequence.add(Math.abs(list.get(i)-list.get(i+1)));
					}
					
				}
				if(size==1) {
					System.out.println("Jolly");
					continue;
				}
				if(sequence.size()!=(size-1)) {
					System.out.println("Not jolly");
					continue;
				}
				for(int i=1;i<=list.size()-1;i++) {
					if(sequence.poll()!=i) {
						System.out.println("Not jolly");
						break;
					}
					if(i==list.size()-1) {
						System.out.println("Jolly");
					}
				}
			}
			else {
				break;
			}
		}

	}
}
