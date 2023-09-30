import java.util.*;
public class SecondApplication {
    private int[] numbers;

    public SecondApplication(int[] numbers) {
        this.numbers = numbers;
    }

    public int calculateScore() {
        int score = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                score += 1; 
            } else if (number == 5) {
                score += 5; 
            } else {
                score += 3; 
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        SecondApplication calculator = new SecondApplication(numbers);
        int score = calculator.calculateScore();
        System.out.println("Total score: " + score);
    }
}
