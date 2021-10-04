import java.util.ArrayList;
import java.util.Scanner;

class Main {

 public static void main(String[] args) {
		int num;
	    int instruct;
	    int val;
	    Scanner scanner = new Scanner(System.in);
	    while(scanner.hasNextInt()){
	        num = scanner.nextInt();
	        ArrayList<Integer> prior = new ArrayList();
	        ArrayList<Integer> queue = new ArrayList();
	        ArrayList<Integer> stack = new ArrayList();
	        boolean pr = true;
	        boolean qu = true;
	        boolean st = true;
	        for(int i=0; i<num; i++){
	            instruct = scanner.nextInt();
	            val = scanner.nextInt();
	            if(instruct == 1){
	                queue.add(val);
	                stack.add(0,val);
	                if(prior.size() == 0)
	                    prior.add(val);
	                else{
	                    for(int j=0; j<prior.size(); j++){
	                        if(val > prior.get(j)){
	                            prior.add(j,val);
	                            break;
	                        }
	                    }
	                    if(val < prior.get(prior.size()-1))
	                        prior.add(val);
	                }
	            }
	            else if(instruct == 2){
	                int p = prior.get(0);
	                int q = queue.get(0);
	                int s = stack.get(0);
	                prior.remove(0);
	                queue.remove(0);
	                stack.remove(0);

	                if(val != p)
	                    pr = false;
	                if(val != q)
	                    qu = false;
	                if(val != s)
	                    st = false;  
	            }
	            
	        }
	        
	        
	        
	        
	        
	        
	        int count = 0;
	        if(pr == true)count++;
	        if(qu == true)count++;
	        if(st == true)count++;

	        if(count >= 2)System.out.print("not sure\n");
	        else if(count == 0)System.out.print("impossible\n");
	        else if(pr == true && qu == false && st == false)
	        	System.out.print("priority queue\n");
	        else if(pr == false && qu == true && st == false)
	        	System.out.print("queue\n");
	        else if(pr == false && qu == false && st == true)
	        	System.out.print("stack\n");
	    }
	}
	}