package ex4;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class FileHelper {
    
    public static void replace(String src, String dst, String searchString, String replacement) throws IOException{
        
        Path origin = Paths.get(src);
        Path destination = Paths.get(dst);


        if(!Files.exists(destination)){
            Files.write(destination, "".getBytes(), StandardOpenOption.CREATE);
        }

        List <String> lines = Files.readAllLines(origin);

        List <String> editLines = lines.stream()
        .map(line-> line.replaceAll(searchString, replacement))
        .collect(Collectors.toList());

        Files.write(destination, editLines);
    }
}
