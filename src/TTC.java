import java.util.Scanner;
import java.util.Random;
public class TTC {

	public static void main(String[] agrs) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int num;
		int score=0;
		int correct=0;
		//Ask for hi, low and number
		System.out.println("Welcome to the Times Table Challenge!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		System.out.println("How many questions do you want?");
		num=in.nextInt();
		//Loop and ask questions
		int x=1;
		while (x<=10) {
			//rnd.nestInt(range)+lowest
			System.out.println(x);
			x++;
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question "+x+") "+num1+" x "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score++;
				correct++;
				System.out.println("Right!");

			} else {
				System.out.println("Wrong! the answer "+(num1*num2));
				correct=0;
			}
			


		}
		//Print results
		System.out.println("you got "+score+" right out of "+num);
	}
}