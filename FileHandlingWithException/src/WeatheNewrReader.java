import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WeatheNewrReader {

    public void checkFileExists(File file) throws WeatherFileNotFoundException {
        if (!file.exists()) {
            throw new WeatherFileNotFoundException("Weather file not found!");
        }
    }

    public void readFileAsBytes(String filePath) {
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //Make sure to include the IOException and printStackTrace() in the catch block.
    public void writeFileAsBytes(String filePath, String content) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            for (byte b : content.getBytes()) {
                outputStream.write(b);
            }
            System.out.println("Content written to file successfully as bytes.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to accept user input for file names
    public String getFileNameFromUser(String type) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the file name (with path) " + type + " : ");
        return scanner.nextLine();

    }

    public void processWeatherNewFile() throws WeatherFileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String filePathForRead = getFileNameFromUser("read");
        readFileAsBytes(filePathForRead);
        String filePathForWrite = getFileNameFromUser("write");

        System.out.println("Enter content to write: ");
        String content = scanner.nextLine();
        writeFileAsBytes(filePathForWrite,content);

        System.out.println("Reading a file as bytes:");
        readFileAsBytes(filePathForWrite);

    }


}
