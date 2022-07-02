package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList newDLL = new DoubleLinkedList(0);

        newDLL.append(1);
        newDLL.append(2);
        newDLL.printList();

        newDLL.remove(1);

        newDLL.printList();


    }
}

