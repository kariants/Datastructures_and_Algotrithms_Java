package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(47);
        tree.insert(21);
        tree.insert(27);
        tree.insert(76);
        tree.insert(18);
        tree.insert(52);
        tree.insert(82);


        System.out.println("Breadth First Search " + tree.BFS());
        System.out.println("Depth First Search Pre Order " + tree.DFSPreOrder());
        System.out.println("Depth First Search Post Order " + tree.DFSPostOrder());
        System.out.println("Depth First Search In Order " + tree.DFSInOrder());
    }
}
