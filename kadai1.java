package kadai1;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class kadai1 {
    public static void main(String[] args) {
        try(
            BufferedReader r = Files.newBufferedReader(
                Paths.get(".", "kadai1", "scores.csv"),
                StandardCharsets.UTF_8))
                {
                    String line;
                    while((line = r.readLine())!= null) {
                        System.out.println(line);
                    }
                }catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }