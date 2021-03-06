package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
         bu methodlarin cogu slaytlarda var
         */

        //Listten gelen ozelikleri biliyoruz
        //Deque den gelen ozelliklere bkalim

        Deque<Integer> ll1= new LinkedList<>();
        ll1.addFirst(10);// basa element ekler. add() den daha hizlidir
        ll1.addLast(20);//sona element ekler
        ll1.element();//bastaki elementi alip gelir ama silmez
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.element());//10. ilk elementi dondurur. ilk element yoksa exception firlatir

        System.out.println(ll1);//[10, 20]

        System.out.println(ll1.getLast());//20 silmeden son element
        System.out.println(ll1.getFirst());//10 silmeden ilk element

        ll1.offer(30);//sona ekler ama bir sey dondurmez
        System.out.println(ll1);//[10, 20, 30]
        ll1.offerLast(40);//sona ekler true dondurur
        System.out.println(ll1);//[10, 20, 30, 40]
        ll1.offerFirst(50);
        System.out.println(ll1);//[50, 10, 20, 30, 40]

        System.out.println(ll1.peek());//ilk elementi silmeden dondurur
        // bulamazsa null dondurur











    }
}
