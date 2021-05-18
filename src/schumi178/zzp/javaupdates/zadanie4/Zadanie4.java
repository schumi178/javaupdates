package schumi178.zzp.javaupdates.zadanie4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.mismatch(Path.of("plik1.txt"), Path.of("plik2.txt")));
        System.out.println(Files.mismatch(Path.of("plik1.txt"), Path.of("plik3.txt")));
        List.of("plik1.txt", "plik2.txt", "plik3.txt").forEach(x -> {
            try {
                System.out.println(Files.readString(Path.of(x)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
