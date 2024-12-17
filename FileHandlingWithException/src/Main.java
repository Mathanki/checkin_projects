//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WeatherReader weatherReader = new WeatherReader();
        try{
            weatherReader.processWeatherFile("F:\\Per Scholas\\workspace\\CheckinProjects\\FileHandlingWithException\\weather.txt");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }
}