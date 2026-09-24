import java.util.Scanner;

public class Main
{
    //int main()
    public static void main(String[] args)
    {
        //c++ int numbers[5]
        int[] numbers = new int[10];

        numbers[0] = 400;
        numbers[1] = 90;
        numbers[2] = 80;
        numbers[3] = 70;
        numbers[4] = 50;
        numbers[5] = 9;
        numbers[6] = 80;
        numbers[7] = 45;
        numbers[8] = 55;
        numbers[9] = -73;

        System.out.println("Before Selection Sort");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+ " ");
        }

        //SelectionSort O(n^2)
        for(int curIdx = 0; curIdx < numbers.length; curIdx++)
        {
            int largestIndex = curIdx;

            //search per index
            for (int searchIdx = curIdx + 1;
                 searchIdx<numbers.length;
                 searchIdx++)
            {
                //replacing the value in the largest index
                if(numbers[searchIdx] > numbers[largestIndex])
                {
                    largestIndex = searchIdx;
                }
            }

            //swapping
            int largestNumber = numbers[largestIndex];
            numbers[largestIndex] = numbers[curIdx];
            numbers[curIdx] = largestNumber;
        }


        System.out.println("\nAfter Selection Sort");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+ " ");
        }


    }


}