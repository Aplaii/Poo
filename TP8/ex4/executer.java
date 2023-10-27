package ex4;
import java.io.IOException;

public class executer {
    public static void main(String [] args) throws IOException{

        FileHelper.replace("original.txt", "destination.txt", "Imagine", "Dream");

    }
}
