package Basics;

public class Perfect_no {
	public static void main(String[] args) {
		int sum=0;
    		for(int i=1;i<=num/2;i++){
        	if(num%i==0){
            	sum+=i;
        	}
    	      }
    	return (sum==num);
	}

}
