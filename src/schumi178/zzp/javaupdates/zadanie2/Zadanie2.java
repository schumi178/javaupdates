package schumi178.zzp.javaupdates.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie2 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++) {
            list.add((i + 1) * 10);
            list.add((i + 2) * -10);
        }
        var immutable = List.copyOf(list).stream().collect(Collectors.toUnmodifiableList());
        List<Integer> positive = immutable.stream().filter(x -> x > 0).collect(Collectors.toUnmodifiableList());
        positive.forEach(x -> System.out.print(x + " "));
        System.out.print("\n");
        try {
            positive.add(100);
        } catch (Exception e) {
            System.out.println("Nie udało się dodać elementu do listy");
        }
    }
}
