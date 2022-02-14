import java.util.HashSet;


public class MathOperationSet {
    private MathOperationSet() {
    }

    public static <N> HashSet<N> union (HashSet<N> hashSet1, HashSet<N> hashSet2){
        HashSet<N> result = new HashSet<>(hashSet1);
        result.addAll(hashSet2);
        return result;
    }

    public static <N> HashSet<N> intersection (HashSet<N> hashSet1, HashSet<N> hashSet2){
        HashSet<N> result = new HashSet<>(hashSet1);
        result.retainAll(hashSet2);
        return result;
    }

    public static <N> HashSet<N> minus (HashSet<N> hashSet1, HashSet<N> hashSet2){
        HashSet<N> result = new HashSet<>(hashSet1);
        result.removeAll(hashSet2);
        return result;
    }

    public static <N> HashSet<N> difference (HashSet<N> hashSet1, HashSet<N> hashSet2){
        HashSet<N> union = new HashSet<>(hashSet1);
        HashSet<N> intersection = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        intersection.retainAll(hashSet2);
        HashSet<N> result = new HashSet<>(union);
        result.removeAll(intersection);
        return result;
    }
}
