//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{400, 90, 80, 70, 50, 9, 80, 45, 55, -73};
        System.out.println("Before Selection Sort");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        for(int curIdx = 0; curIdx < numbers.length; ++curIdx) {
            int largestIndex = curIdx;

            for(int searchIdx = curIdx + 1; searchIdx < numbers.length; ++searchIdx) {
                if (numbers[searchIdx] > numbers[largestIndex]) {
                    largestIndex = searchIdx;
                }
            }

            int largestNumber = numbers[largestIndex];
            numbers[largestIndex] = numbers[curIdx];
            numbers[curIdx] = largestNumber;
        }

        System.out.println("\nAfter Selection Sort");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

    }
}
