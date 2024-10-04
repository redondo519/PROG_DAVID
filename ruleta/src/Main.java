import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class RouletteGame {
    private int balance;
    private Map<Integer, String> wheel;
    private Map<Integer, String> colors;
    private Map<Integer, String> evenOdd;
    private Map<Integer, String> highLow;
    private Random random;
    private Scanner scanner;

    public RouletteGame() {
        this.balance = 0;
        this.wheel = new HashMap<>();
        for (int i = 0; i <= 36; i++) {
            wheel.put(i, String.valueOf(i));
        }
        this.colors = new HashMap<>();
        for (int i = 0; i <= 36; i++) {
            if (i == 0) {
                colors.put(i, "green");
            } else if (i % 2 == 0) {
                colors.put(i, "red");
            } else {
                colors.put(i, "black");
            }
        }
        this.evenOdd = new HashMap<>();
        for (int i = 0; i <= 36; i++) {
            if (i % 2 == 0) {
                evenOdd.put(i, "even");
            } else {
                evenOdd.put(i, "odd");
            }
        }
        this.highLow = new HashMap<>();
        for (int i = 0; i <= 36; i++) {
            if (i >= 19) {
                highLow.put(i, "high");
            } else {
                highLow.put(i, "low");
            }
        }
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public String placeBet(String betType, int amount) {
        if (amount != 20 && amount != 40 && amount != 100 && amount != 200 && amount != 500) {
            return "Invalid bet amount. Please choose 20, 40, 100, 200, or 500.";
        }
        if (!betType.equals("single_number") && !betType.equals("red") && !betType.equals("black") && !betType.equals("even") && !betType.equals("odd") && !betType.equals("high") && !betType.equals("low")) {
            return "Invalid bet type. Please choose single_number, red, black, even, odd, high, or low.";
        }

        int winningNumber = random.nextInt(37);
        if (betType.equals("single_number")) {
            System.out.print("Enter a number (0-36): ");
            int userNumber = scanner.nextInt();
            if (userNumber == winningNumber) {
                balance += amount * 35;
                return "You win! Your winnings are " + amount * 35 + ". New balance: " + balance;
            } else {
                balance -= amount;
                return "You lose. New balance: " + balance;
            }
        } else if (betType.equals("red")) {
            if (colors.get(winningNumber).equals("red")) {
                balance += amount;
                return "You win! Your winnings are " + amount + ". New balance: " + balance;
            } else {
                balance -= amount;
                return "You lose. New balance: " + balance;
            }
        } else if (betType.equals("black")) {
            if (colors.get(winningNumber).equals("black")) {
                balance += amount;
                return "You win! Your winnings are " + amount + ". New balance: " + balance;
            } else {
                balance -= amount;
                return "You lose. New balance: " + balance;
            }
        } else if (betType.equals("even")) {
            if (evenOdd.get(winningNumber).equals("even")) {
                balance += amount;
                return "You win! Your winnings are " + amount + ". New balance: " + balance;
            } else {
                balance -= amount;
                return "You lose. New balance: " + balance;
            }
        } else if (betType.equals("odd")) {
            if (evenOdd.get(winningNumber).equals("odd")) {
                balance += amount;
                return "You win! Your winnings are " + amount + ". New balance: " + balance;
            } else {
                balance -= amount;
                return "You lose. New balance: " + balance;
            }
        } else if (betType.equals("high")) {
            if (highLow.get(winningNumber).equals("high")) {
                balance += amount;
                return "You win! Your winnings are " + amount + ". New balance: " + balance;
            } else {
                balance -= amount;
                return "You lose. New balance: " + balance;
            }