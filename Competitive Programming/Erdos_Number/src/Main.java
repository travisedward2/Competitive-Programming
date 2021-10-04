import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Queue;


public class Main {
	public static void main(String[] argv) {
		Scanner scn=new Scanner(System.in);
		int scenario=0;
		if(scn.hasNextLine()) {
			scenario=scn.nextInt();
		}
		scn.nextLine();
		int count=0;
		while(true) {
			count++;
			if(count==scenario+1) {
				break;
			}
			ArrayList<ArrayList<String>> database=new ArrayList<ArrayList<String>>();
			Map<String,Integer> answer=new HashMap<String,Integer>();
			Queue<String> update=new LinkedList<String>();
			ArrayList<String> ranked=new ArrayList<String>();


			int paper_num=0;
			int name_num=0;
			if(scn.hasNextLine()) {
				paper_num=scn.nextInt();
				name_num=scn.nextInt();
			}
			scn.nextLine();
			for(int c=0;c<paper_num;c++) {
				Scanner line;
				if(scn.hasNextLine()) {
					String[] temp=scn.nextLine().split("\\.,|\\.:");
					database.add(new ArrayList<String>());
					for(int i=0;i<temp.length-1;i++) {
						database.get(database.size()-1).add(new String(temp[i].trim().concat(".")));
						if(!answer.containsKey(temp[i].trim().concat("."))) {
							answer.put(temp[i].trim().concat("."),-1);
						}
					}
				}
			}
			
			update.add("Erdos, P.");
			answer.put("Erdos, P.", 0);
			ranked.add("Erdos, P.");
			while(true) {
				if(update.size()==0) {
					break;
				}
				for(int i=0;i<database.size();i++) {
					if(database.get(i).contains(update.element())) {
						for(String x:database.get(i)) {
							if(!x.equals(update.element()) && !ranked.contains(x)) {
//								find(answer,x).num=find(answer,update.element()).num+1;
								answer.put(x, answer.get(update.element())+1);
								update.add(x);
								ranked.add(x);
							}
						}
					}
				}
				update.poll();
			}
			System.out.println("Scenario "+count);
			
			for(int c=0;c<name_num;c++) {
				String target=scn.nextLine();
				if(answer.containsKey(target)) {
					if(answer.get(target)==-1) {
						System.out.println(target+" infinity");
					}
					else {
						System.out.println(target+" "+answer.get(target));
					}
					
					
//					System.out.println();
				}
				else {
					System.out.println(target+" infinity");
				}

				
			}


		}
	}


}


