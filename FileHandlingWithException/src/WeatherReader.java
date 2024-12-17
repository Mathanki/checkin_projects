import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherReader {

    public void checkFileExists(File file) throws WeatherFileNotFoundException {
        if (!file.exists()) {
            throw new WeatherFileNotFoundException("Weather file not found!");
        }
    }

    public void readFile(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }

    }

    public void processWeatherFile(String filePath) throws WeatherFileNotFoundException {
        // Step 1: Create File object to assign filePath
        File file = new File(filePath);

        // Step 2: Check file existence
        checkFileExists(file);

        // Step 3: Read the file
        readFile(file);

    }

}
