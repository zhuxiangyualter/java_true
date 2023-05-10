package STL_bg.Enum;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class set {
    public static void main(String[] args) {
        Set<Day>weekend = EnumSet.noneOf(Day.class);
        weekend.add(Day.SATURDAY);
        weekend.add(Day.SUNDAY);
        System.out.println(weekend);
    }
}
