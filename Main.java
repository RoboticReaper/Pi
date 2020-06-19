import java.util.Random;
import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Random rand=new Random();
		double inside=0;
		double total=0;

		while(true){
			double x=rand.nextDouble();
			double y=rand.nextDouble();
			double distance=(x*x)+(y*y);
			if(Math.sqrt(distance)<=1){
				inside+=1;
			}
			total+=1;
			
		double result=4*inside/total;
		System.out.println(result);
		}
	}
}