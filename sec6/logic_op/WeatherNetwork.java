public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 5;  

        String forecast = "Chilly";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if(temp >= -15 && temp <= -1 && forecast.equals("FREEZING")) {
            //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"
            System.out.println("The forecast is FREEZING! Stay home!");
        }

        else if(temp >= 0 && temp <= 10 && forecast.equals("Chilly")) {
            //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";
            System.out.println("The forecast is Chilly. Wear a coat!");
        }
        //else: It's warm. go outside!
        else{
            System.out.println("It's warm. go outside!");
        }
        System.out.println(forecast);
    }
}
