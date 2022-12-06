import java.util.*;

/*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
*/

public class FirstTask {
    public static void main(String[] args)
    {
        LinkedList<String> linkedli = new LinkedList<String>();
        linkedli.add("Ford Mustang");
        linkedli.add("Dodge Charge");
        linkedli.add("Chevrolet Camaro");
        System.out.print("Исходный список: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nРазвернутый список: " + linkedli);
    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}