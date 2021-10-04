import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	public static void main(String[] argv) {
		final int in=1;
		final int out=2;

		Stack<Integer> stack=new Stack<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		ArrayList<String> ans=new ArrayList<String>();
		Scanner scn=new Scanner(System.in);
		while(true) {
			stack.clear();
			queue.clear();
			pqueue.clear();
			ans.clear();
			ans.add("stack");
			ans.add("queue");
			ans.add("priority queue");
			int command=0;
			if(scn.hasNextInt())	command=scn.nextInt();
			else break;
			for(int i=0; i<command;i++) {
				int cmd=scn.nextInt();
				if(cmd==in) {
					int temp=scn.nextInt();
					stack.add(temp);
					queue.offer(temp);
					pqueue.offer(temp);
					pqueue.comparator();
				}
				else if(cmd==out) {
					int temp=scn.nextInt();
					if(temp!=stack.pop().intValue() ) {
						for(int j=0;j<ans.size();j++) {
							if(ans.get(j).equals("stack")) {
								ans.remove(j);
								break;
							}
						}
					}
					if(temp!=queue.poll().intValue()) {
						for(int j=0;j<ans.size();j++) {
							if(ans.get(j).equals("queue")) {
								ans.remove(j);
								break;
							}
						}
					}
					if(temp!=pqueue.poll().intValue()) {
						for(int j=0;j<ans.size();j++) {
							if(ans.get(j).equals("priority queue")) {
								ans.remove(j);
								break;
							}
						}
					}
				}
			}
			if(ans.size()>1) {
				System.out.println("not sure");
			}
			else if(ans.size()==1) {
				System.out.println(ans.get(0));
			}
			else if(ans.size()==0) {
				System.out.println("impossible");
				
			}
		}
		scn.close();
	}
}
