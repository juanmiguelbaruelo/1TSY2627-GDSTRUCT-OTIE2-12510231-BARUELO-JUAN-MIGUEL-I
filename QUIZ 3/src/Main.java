import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(10);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int id = 1;
        int games = 0;

        while (games < 10)
        {
            int x = random.nextInt(7) + 1;
            for (int i = 0; i < x; i++)
            {
                queue.enqueue(new Player(id, "Player" + id, random.nextInt(100) + 1));
                id++;
            }
            System.out.println("\n[--QUEUE STATUS--]");
            if (x == 1)
            {
                System.out.println(x + " player joined");
            }
            else
            {
                System.out.println(x + " players joined");
            }
            System.out.println("In queue: " + queue.size() + "...");

            while (queue.size() >= 5 && games < 10)
            {
                games++;
                System.out.println("\n[--GAME " + games + " STARTED--]");
                for (int i = 0; i < 5; i++)
                {
                    System.out.println("  " + queue.dequeue());
                }
            }

            if (games < 10)
            {
                System.out.println("\n[--Press Enter to continue the GAME--]");
                scanner.nextLine();
            }
        }

        System.out.println("\n[--10 GAMES HAS BEEN MADE--]");
    }
}