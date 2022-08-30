import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {

        double scores[] = new double[5];
        double sum=0.0, avg = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your five scores");
        for (int i=0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i=0; i < scores.length; i++) {
            sum = sum + scores[i];
            avg = sum/scores.length;
        }

        System.out.println("The average of your scores is: " + avg);


    }

}
