public class SimpleHashtable
{
    private Player[] hashtable;

    public SimpleHashtable()
    {
        hashtable = new Player[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    } //12FFCC

    public void put(String key, Player player)
    {
        int index = hashKey(key);

        for(int i = 0; i < hashtable.length; i++)
        {
            if(hashtable[index] == null)
            {
                hashtable[index] = player;
                return;
            }
            index = (index + 1) % hashtable.length;
        }
        System.out.println("Sorry the element in this position is already occupied");
    }

    public Player get(String key)
    {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public Player remove(String key)
    {
        int index = hashKey(key);

        for(int i = 0; i < hashtable.length; i++)
        {
            if(hashtable[index] == null)
            {
                return null;
            }

            if(hashtable[index].getName().equals(key))
            {
                Player removed = hashtable[index];
                hashtable[index] = null;

                index = (index + 1) % hashtable.length;
                while(hashtable[index] != null)
                {
                    Player p = hashtable[index];
                    hashtable[index] = null;
                    put(p.getName(), p);
                    index = (index + 1) % hashtable.length;
                }
                return removed;
            }

            index = (index + 1) % hashtable.length;
        }
        return null;
    }

    public void printHashTable()
    {
        for(int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element in : " + i + " : " + hashtable[i]);
        }
    }
}
