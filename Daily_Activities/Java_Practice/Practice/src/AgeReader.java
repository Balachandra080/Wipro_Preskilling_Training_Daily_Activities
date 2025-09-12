import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AgeReader 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileReader fileReader = new FileReader("age.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Retrieved from file: " + line);
            }

            bufferedReader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}