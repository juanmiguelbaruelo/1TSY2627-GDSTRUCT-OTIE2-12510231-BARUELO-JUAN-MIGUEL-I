public class Main
{
    public static void main(String[] args)
    {
        int row1[] = { 67, 420, 423 };
        int row2[] = { 5, 25, 14 };
        int row3[] = { 11, 17, 26 };

        easySearch(row1, row2, row3, 11);
    }

    public static boolean checkRow(int[] row, int number)
    {
        for (int i = 0; i < row.length; i++)
        {
            if (number == row[i])
            {
                return true;
            }
        }
        return false;
    }

    public static int easySearch(int[] row1, int[] row2, int[] row3, int number)
    {
        if (checkRow(row1, number))
        {
            System.out.println("Checker 1 Found the number " + number);
            return 1;
        }
        if (checkRow(row2, number))
        {
            System.out.println("Checker 2 Found the number " + number);
            return 1;
        }
        if (checkRow(row3, number))
        {
            System.out.println("Checker 3 Found the number " + number);
            return 1;
        }

        System.out.println("Not Found the number " + number);
        return -1;
    }
}