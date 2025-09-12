import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator 
{
    public static void main(String[] args) 
    {
        LocalDate birthDate = LocalDate.of(2002, 9, 20); // Replace with your actual DOB
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        String ageText = "Age is " + period.getYears() + " years, " + 
                         period.getMonths() + " months, " + 
                         period.getDays() + " days.";

        try 
        {
            FileWriter writer = new FileWriter("age.txt");
            writer.write(ageText);
            writer.close();
            System.out.println("Age stored in age.txt successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}