package schumi178.zzp.javaupdates.zadanie1;

import java.util.List;

public interface Zadanie1Interfejs {
    private List<Integer> getList() {
        return List.of(-10, 20, 30, 40);
    }

    default void printFirstPositive() {
        List<Integer> list = getList();
        int firstPositive = list.stream().filter(x -> x > 0).findFirst().get();
        System.out.println(firstPositive);
    }
}
