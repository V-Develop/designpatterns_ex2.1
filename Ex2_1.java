import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2_1 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = new ArrayList<>();

        showInputLabel();

        while (nums.size() < MAX) {
            String s = getInput();
            try {
                validateInputType(s);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            int num = Integer.parseInt(s);
            if (isRangeNumberInvalid(num)) {
                continue;
            }
            nums.add(num);
        }

        sortNumber(nums);
        showResult(nums);
    }

    public static void showInputLabel() {
        System.out.println("Enter 5 valid integers in the range [0, 10]");
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static void validateInputType(String input) throws IllegalArgumentException {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid! Try again!");
        }
    }

    public static boolean isRangeNumberInvalid(Integer input) {
        if (input < 0 || input > 10) {
            System.out.println("Invalid range! Try again!");
            return true;
        }
        return false;
    }

    public static void sortNumber(List<Integer> nums) {
        Collections.sort(nums);
    }

    public static void showResult(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }

}