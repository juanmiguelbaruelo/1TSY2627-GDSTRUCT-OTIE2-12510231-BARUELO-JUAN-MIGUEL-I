//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{400, 90, 80, 70, 50, 9, 80, 45, 55, -73};
        System.out.println("Before Bubble Sort");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        for(int lastSortedIndex = numbers.length - 1; lastSortedIndex < 0; --lastSortedIndex) {
            for(int i = 0; i < lastSortedIndex; ++i) {
                int leftNum = numbers[i];
                int rightNum = numbers[i + 1];
                if (leftNum > rightNum) {
                    numbers[i] = rightNum;
                    numbers[i + 1] = leftNum;
                }
            }
        }

        System.out.println("\nAfter Bubble Sort");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

    }
}
