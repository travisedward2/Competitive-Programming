import java.util.ArrayList;
import java.util.Scanner;

class voter {
	ArrayList<Integer> list=new ArrayList<Integer>();
	voter(){
		
	}
}

class candidate{
	int number=-1;
	StringBuilder name;
	candidate(int x,StringBuilder name){
		this.number=x;
		this.name=name;
	}
}

public class Main {

	public static void main(String[] argv) {
		
		
		Scanner scn=new Scanner(System.in);
		int num=-1;
		if(scn.hasNext()) {
			num=scn.nextInt();
			scn.nextLine();
		}
		int[] tickets=new int[num+1];
		tickets[0]=-1;
		ArrayList<candidate> candidates=new ArrayList<candidate>();
		ArrayList<voter> voters=new ArrayList<voter>(); 
		for(int k=1;k<=num;k++) {
			if(scn.hasNextLine()) {
				String temp=scn.nextLine();
				StringBuilder tmp=new StringBuilder();
				for(int w=0;w<temp.length();w++) {
					tmp.append(temp.charAt(w));
				}
				candidates.add(new candidate(k,tmp));
				
			}
		}
		
		
		while(scn.hasNextLine()) {
			Scanner parser=new Scanner(scn.nextLine());
			if(!parser.hasNextInt()) {
				break;
			}
			voters.add(new voter());
			for(int k=0;k<num;k++) {
				voters.get(voters.size()-1).list.add(parser.nextInt());	
			}
			System.out.println(voters.size());
		}
		scn.close();
		
		
		
//		for(voter x:voters) {
//			System.out.println();
//			for(Integer k:x.list) {
//				System.out.print(k+" ");
//			}
//		}
		
		
		
//		System.out.println(voters.size());


		
		
	}

	
}
