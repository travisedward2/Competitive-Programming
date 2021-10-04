import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String argv[]) {
		Scanner scn=new Scanner(System.in);
		Stack<Integer> wait=new Stack<Integer>();
		ArrayList<Integer> out=new ArrayList<Integer>(); 
		ArrayList<Integer> sim=new ArrayList<Integer>();
		boolean checking=false;
		while(true) {
			int size=0;
			if(scn.hasNextInt()) {
				size=scn.nextInt();


				if(size==0) {
					 break;
				}
				else if(checking) {
					checking=false;
					System.out.println();
				}
				if(scn.hasNextLine()) {
					scn.nextLine();
				}
			}
			while(scn.hasNextLine()) {
				Scanner line=new Scanner(scn.nextLine());
				out.clear();
				sim.clear();
				wait.clear();
				while(line.hasNextInt()) {
					out.add(line.nextInt());
				}
//				line.close();
//				System.out.println("size "+out.size());
				if(out.get(0)==0) {
					checking=true;
					break;
				}
				for(int i=0;i<out.size();i++) {
//					System.out.println("current: "+out.get(i));
					if(!wait.contains(out.get(i))) {
						sim.add(out.get(i));
					}else if(wait.size()!=0) {
						if(out.get(i)!=wait.get(wait.size()-1)) {
							System.out.println("No");
							break;
						}
						else {
							sim.add(out.get(i));
							wait.pop();
						}
					}

					for(int j=1;j<=size;j++) {
						if(j==out.get(i)) {
							break;
						}
						if(!wait.contains(j) && !sim.contains(j) && out.contains(j)) {
//							System.out.println(j);
							wait.add(j);
						}
					}
					if(i==out.size()-1) {
						System.out.println("Yes");
					}
					
				}
//				for(int i=0;i<wait.size();i++) {
//					System.out.println(wait.get(i));
//				}

//				int temp=wait.size();
//				for(int i=0;i<temp;i++) {
//					sim.add(wait.pop());
//				}
//				for(int i=0;i<sim.size();i++) {
//					System.out.println("sim "+sim.get(i));
//				}
//				System.out.println(sim.size());
//				System.out.println(out.size());
//				for(int i=0;i<sim.size();i++) {
//					if(sim.get(i)!=out.get(i)) {
//						System.out.println("No");
//						break;
//					}
//					if(i==sim.size()-1) {
//						System.out.println("Yes");
//					}
//				}

				
			}
		}


	}
}
