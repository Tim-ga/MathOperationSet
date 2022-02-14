import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

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
        HashSet<Integer> expected = new HashSet<>(Set.of(1, 2, 3));
        Assert.assertEquals(expected, MathOperationSet.union(hashSet1,hashSet2));
    }

    @Test
    public void intersection() {
        HashSet<Integer> expected = new HashSet<>(Set.of(2));
        Assert.assertEquals(expected, MathOperationSet.intersection(hashSet1,hashSet2));
    }

    @Test
    public void minus() {
        HashSet<Integer> expected = new HashSet<>(Set.of(1));
        Assert.assertEquals(expected, MathOperationSet.minus(hashSet1,hashSet2));
    }

    @Test
    public void difference() {
        HashSet<Integer> expected = new HashSet<>(Set.of(1, 3));
        Assert.assertEquals(expected, MathOperationSet.difference(hashSet1,hashSet2));
    }
}