public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(17);
        tree.insert(11);
        tree.insert(26);
        tree.insert(4);
        tree.insert(1);
        tree.insert(8);
        tree.insert(27);
        tree.insert(-1);

        //tree.traverseInOrder();
        //System.out.println(tree.get(17));

        System.out.println("\nMin: "+ tree.getMin());
        System.out.println("Max: "+ tree.getMax());
        System.out.println("\nDescending Order: ");
        tree.traverseInOrderDescending();
    }
}
