import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {

		Scanner scn=new Scanner(System.in);
		int cases=0;
		while(true) {
			cases++;
			int line_ans;
			int line_team;
			ArrayList<Character> ans_digits =new ArrayList<Character>();
			ArrayList<Character> test_digits =new ArrayList<Character>();
			ArrayList<String> ans=new ArrayList<String>();
			ArrayList<String> test=new ArrayList<String>();
			if(scn.hasNextLine()) {
				line_ans=Integer.parseInt(scn.nextLine());
				if(line_ans==0)  break;
				//read in the true answer
				for(int i=0;i<line_ans;i++) {

					if(scn.hasNextLine()) {
						ans.add(new String(scn.nextLine()));
						for(int j=0;j<ans.get(i).length();j++) {
							Character tmp=ans.get(i).charAt(j);
							if(Character.isDigit(tmp)) {
								ans_digits.add(tmp);
							}
						}
					}
				}
				
				
			}
			if(scn.hasNextLine()) {
				line_team=Integer.parseInt(scn.nextLine());
				//read in the answer of team
				for(int i=0;i<line_team;i++) {
					if(scn.hasNextLine()) {
						test.add(new String(scn.nextLine()));
						for(int j=0;j<test.get(i).length();j++) {
							Character tmp=test.get(i).charAt(j);
							if(Character.isDigit(tmp)) {
								test_digits.add(tmp);
							}
						}
					}
				}
				
			}
			//此回合讀完
			if(ans.size()==test.size()) {
				boolean all_same=true;
				for(int i=0;i<ans.size();i++) {
					if(!ans.get(i).equals(test.get(i))) {
						all_same=false;
					}
				}
				if(all_same) {
					System.out.println("Run #"+cases+": Accepted");
					continue;
				}
				else if(ans_digits.size()==test_digits.size()){
					boolean digits_same=true;
					for(int i=0;i<ans_digits.size();i++) {
						if(ans_digits.get(i)!=test_digits.get(i)) {
							digits_same=false;
						}
					}
					if(digits_same) {
						System.out.println("Run #"+cases+": Presentation Error");
					}
					else {
						System.out.println("Run #"+cases+": Wrong Answer");
					}
				}
				else {
					System.out.println("Run #"+cases+": Wrong Answer");
				}
			}
			else {
				if(ans_digits.size()==test_digits.size()){
					boolean digits_same=true;
					for(int i=0;i<ans_digits.size();i++) {
						if(ans_digits.get(i)!=test_digits.get(i)) {
							digits_same=false;
						}
					}
					if(digits_same) {
						System.out.println("Run #"+cases+": Presentation Error");
					}
					else {
						System.out.println("Run #"+cases+": Wrong Answer");
					}
				}
				else {
					System.out.println("Run #"+cases+": Wrong Answer");
				}
			}
			
			
		
		}
//		digits.add(new ArrayList<Character>());
		
	}
}
