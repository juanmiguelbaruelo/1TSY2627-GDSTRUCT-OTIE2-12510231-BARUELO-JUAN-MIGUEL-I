public class Main
{
    public static void main(String[] args)
    {
        Player YuJimin = new Player(  134,  "Karina",  411);
        Player AsaEnami = new Player(  536,  "Asa",  417);
        Player SeolYoonA = new Player(  32,  "Sullyoon",  136);
        Player KimMinjeong = new Player(  4931,  "Winter",  101);
        Player KimChaewon = new Player(  6919,  "Chaewon",  801);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(YuJimin .getName(), YuJimin);
        hashtable.put(AsaEnami .getName(), AsaEnami);
        hashtable.put(SeolYoonA.getName(), SeolYoonA);
        hashtable.put(KimMinjeong.getName(), KimMinjeong);
        hashtable.put(KimChaewon.getName(), KimChaewon);

        //hashtable.printHashTable();
        System.out.println("\nCURRENT TABLE:\n");
        hashtable.printHashTable();
        //hashtable.remove("Plooful");
    }
}