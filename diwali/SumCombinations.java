import java.util.Scanner;

class SumCombinations{
	public static void main(String [] args){
		int a [] = {10, 20, 30, 40, 1, 2};
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the sum : ");
		int exp = in.nextInt();
		
		for(int i=0; i<a.length; i++){
			int sum = a[i];
			String dis = a[i]+"";
			if(sum==exp){
				System.out.println(a[i]);
			}
			for(int j=i+1; j<a.length; j++){
				sum = sum + a[j];
				if(sum>exp){
					break;
				}
				dis = dis + " " + a[j];
				
				if(sum==exp){
					System.out.println(dis);
				}
			}
		}
	}
}