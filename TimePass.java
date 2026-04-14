import java.util.LinkedList;

public class TimePass {

    public LinkedList<Integer> returnLinkedList(LinkedList<Integer> k, LinkedList<Integer> k1) {

        LinkedList<Integer> result = new LinkedList<>();

        int i = 0;
        int carry = 0;

        while (i < k.size() || i < k1.size() || carry != 0) {

            int sum = carry;

            if (i < k.size()) {
                sum += k.get(i);
            }

            if (i < k1.size()) {
                sum += k1.get(i);
            }

            result.add(sum % 10);  // store digit
            carry = sum / 10;     // update carry

            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        TimePass t = new TimePass();

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println(t.returnLinkedList(l1, l2)); // [7, 0, 8]
    }
}