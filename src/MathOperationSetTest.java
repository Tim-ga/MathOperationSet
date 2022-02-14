import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;

public class MathOperationSetTest {

    HashSet<Integer> hashSet1 = new HashSet<>();
    HashSet<Integer> hashSet2 = new HashSet<>();

    @Before
    public void initialization() {
        hashSet1.add(1);
        hashSet1.add(2);

        hashSet2.add(2);
        hashSet2.add(3);
    }

    @Test
    public void union() {
        System.out.println(hashSet1);
        System.out.println(hashSet2);
        System.out.println(MathOperationSet.union(hashSet1, hashSet2));
        System.out.println(MathOperationSet.intersection(hashSet1, hashSet2));
        System.out.println(MathOperationSet.minus(hashSet1, hashSet2));
        System.out.println(MathOperationSet.difference(hashSet1, hashSet2));

    }

    @Test
    public void intersection() {
    }
}