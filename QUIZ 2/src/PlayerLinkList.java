public class PlayerLinkList
{
    private PlayerNode head;
    private int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public Player removeFront()
    {
        if (head == null)
        {
            return null;
        }
        PlayerNode removed = head;
        head = head.getNextPlayer();
        removed.setNextPlayer(null);
        size--;
        return removed.getPlayer();
    }

    public int size()
    {
        return size;
    }

    public boolean contains(Player player)
    {
        return indexOf(player) != -1;
    }

    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }

    public void printLinkedList()
    {
        PlayerNode current = head;
        System.out.print("\nHead -> ");
        while (current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.print(" null ");
    }
}
