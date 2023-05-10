package STL_bg.Enum;

import java.util.BitSet;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class BIT {
        public static void main(String[] args) {
            BitSet set1 = new BitSet(10);
            BitSet set2 = new BitSet(10);

            // set some bits
            set1.set(0);
            set1.set(1);
            set1.set(2);
            set1.set(3);
            set1.set(4);

            set2.set(2);
            set2.set(3);
            set2.set(4);
            set2.set(5);
            set2.set(6);

            // print the sets
            System.out.println("Set 1: " + set1);
            System.out.println("Set 2: " + set2);

            // compute the union of the sets
            BitSet union = new BitSet(10);
            union.or(set1);
            union.or(set2);
            System.out.println("Union: " + union);

            // compute the intersection of the sets
            BitSet intersection = new BitSet(10);
            intersection.and(set1);
            intersection.and(set2);
            System.out.println("Intersection: " + intersection);

            // compute the difference of the sets
            BitSet difference = new BitSet(10);
            difference.or(set1);
            difference.andNot(set2);
            System.out.println("Difference: " + difference);
        }
}
