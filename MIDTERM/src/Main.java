import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        CardStack Deck = new CardStack(30);
        CardStack Hand = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        for (int i = 1; i <= 30; i++)
        {
            Deck.push(new Card("Card " + i));
        }

        System.out.println("\nThis Deck has 30 cards");
        System.out.println("It will end once there are no more cards");

        while (!Deck.isEmpty())
        {
            int action = random.nextInt(2);
            int rng = random.nextInt(5) + 1;
            System.out.println("\n[----- ACTION -----]");

            if (action == 0)
            {
                if (rng == 1)
                {
                    System.out.println("You draw " + rng + " card");
                }
                else
                {
                    System.out.println("You draw " + rng + " cards");
                }
                for (int i = 0; i < rng; i++)
                {
                    if (!Deck.isEmpty())
                    {
                        Hand.push(Deck.pop());
                    }
                }
            }

            else if (action == 1)
            {
                if (rng == 1)
                {
                    System.out.println("You discarded " + rng + " card");
                }
                else
                {
                    System.out.println("You discarded " + rng + " cards");
                }

                for (int i = 0; i < rng; i++)
                {
                    if (!Hand.isEmpty())
                    {
                        discardPile.push(Hand.pop());
                    }
                }
            }
            System.out.println("[------------------]");

            System.out.println("\n[--------- HAND ---------]");
            if (Hand.isEmpty())
            {
                System.out.println("Empty");
            }
            else
            {
                Hand.printStack();
            }
            System.out.println("[----- CARDS STATUS -----]");
            System.out.println("REMAINING CARDS: " + Deck.size());
            System.out.println("DISCARDED CARDS: " + discardPile.size());
            System.out.println("[------------------------]");

            if (!Deck.isEmpty())
            {
                System.out.println("\n[----- Press ENTER to continue -----]");
                scanner.nextLine();
            }
        }
        System.out.println("\n[----- GAME OVER || DECK IS EMPTY -----]");
        scanner.close();
    }
}