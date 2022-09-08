package arrayexercise;

import java.util.Arrays;

public class Wind {

    public static void main(String[] args) {

        final int speedMax = 200;
        final int direction = 360;
        int length = 3;
        int[] windSpeed = new int[length];
        int[] windDirection = new int[length];


        //fill value
        for (int i = 0; i < length; i++) {
            windSpeed[i] += Math.random() * speedMax;
            windDirection[i] += Math.random() * direction;
        }
        System.out.println(Arrays.toString(windSpeed));
        System.out.println(Arrays.toString(windDirection));

        for (int i = 0; i < length; i++) {
            System.out.println("Windspeed " + windSpeed[i] + " km/h and wind direction " + windDirection[i] + " Grad.");

        }

        for (int i = 0; i < length; i++) {
            System.out.printf("Windspeed %d km/h and wind direction %d\n", windSpeed[i], windDirection[i]);
        }
    }
}

//Wind speed 82 km/h and wind direction 12°, Wind speed 70 km/h and wind direction 266°, Wind speed 12 km/h and wind direction 92°