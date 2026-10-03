public class Main
{
    public static void main(String[] args)
    {
        PlayerLinkList playerLinkList = new PlayerLinkList();

        playerLinkList.addToFront(new Player(1,"Sabo", 160));
        playerLinkList.addToFront(new Player(2,"Luffy", 190));
        playerLinkList.addToFront(new Player(3,"Ace", 140));

        playerLinkList.printLinkedList();

        System.out.println("Size: " + playerLinkList.size());
        System.out.println("\nContains Luffy: " + playerLinkList.contains(new Player(2, "Luffy", 190)));
        System.out.println("Contains Sabo: " + playerLinkList.contains(new Player(1, "Sabo", 160)));
        System.out.println("Index of Imu: " + playerLinkList.indexOf(new Player(9, "Imu", 200)));

        System.out.println("\nRemoved: " + playerLinkList.removeFront());
        playerLinkList.printLinkedList();
        System.out.println("\nNew Size: " + playerLinkList.size());
    }
}
