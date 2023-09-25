package wondrous;
import java.util.ArrayList;
import java.util.List;

/* 
 * The Wondrous Sequence is generated by the simple rule:
 * -> If the current term is even, the next term is half the current term.
 * -> If the current term is odd, the next term is three times the current term, plus 1.
 * 
 * For example, the sequence generated by starting with 3 is:
 * 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * 
 * If the starting term is 1, then an empty list is returned.
*/
public class Wondrous {

    private final int MY_MAGIC_NUMBER = 42;

    public List<Integer> wondrous(int start) {
        if (start < 1) {
            throw new IllegalArgumentException("Cannot be less than 1!!");
        }
        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        if (current == 1) return sequence;

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }
        sequence.add(current);

        return sequence;
    }

}
