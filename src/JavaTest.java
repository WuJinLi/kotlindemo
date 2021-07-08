import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class JavaTest {

    public static void main(String[] args) {
//       System.out.println( StringUtils.isEmpty(""));
//       System.out.println(StringUtils.flag);
//       System.out.println(StringUtils.Companion.getFlag1());
//       System.out.println(StringUtils.Companion.length(""));

        int count = 2;
        List<Integer> list = new ArrayList<>();
        do {
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
            count--;
        } while (count > 0);

        System.out.println(list);
        System.out.println(new HashSet<>(list));
        System.out.println(new ArrayList<>(new HashSet<>(list)));
    }
}
