package test;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		spacer s=new spacer();
		int n=scan.nextInt(),temp=n,temp2=n-1,temp3=1,pass=0,space=0;
		String style="*";
		System.out.println("\n");
		if(n==1){
			System.out.println(style);
			System.out.println(" "+style);
			System.out.println(style);
		}else{
		while(true){
			for(int i=temp;i>0;i--){

				for(int j=1;j<=pass;j++){
					System.out.print(" ");
				}
				if(i!=1){
					System.out.println(style);	
				}
				if(pass==(n-2)){
					System.out.println(style);
					break;
				}
				if(i==1){
					System.out.println(style.concat(style));
					break;
				}
			}if(pass==0)temp--;//one time only
			temp--;
			pass++;
			if(pass==n-1)break;
		}
		for(int i=0;i<n-1;i++){
			System.out.print(" ");
			space++;
		}
		System.out.println(style);
		//reverse printing!
		s.space(space,1);
		System.out.println(style);
		while(true){
			for(int j=n-(n-temp3);j>0;j--){
				if(j==1){
					if(temp2!=1){
					s.space(space,2);
					System.out.println(style.concat(style));
					break;
					}else{
						s.space(space,1);
						System.out.println(style);
					}
				}if(j!=1){
					s.space(space,1);
					System.out.println(style);
				}
			}//end of for
			temp2--;
			temp3++;
			space--;
			if(temp2==0)break;//loop ends here
		}//end of while
		scan.close();
	}
	}
}
class spacer{
	public void space(int sp,int z){
		for(int i=0;i<sp-z;i++){
			System.out.print(" ");
	}
}
}