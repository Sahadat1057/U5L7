import java.text.DecimalFormat;

public class Temperature {

    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = high;
        lowTemp = low;

        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }
    }

    // 1. Add your two static methods here:
   public static double convertCtoF(double temp) {
        double f = (temp * (9 /5)) + 32;
        return f;
}

   public static double convertFtoC(double temp) {
        double c = (temp - 32) * (5 / 9);
        return c;
   }







    // 2. Add your two instance methods here:

    public void changeToC() {
        if (tempScale.equals("F")) {
            convertFtoC(highTemp);
            convertFtoC(lowTemp);
        }
    }

    public void changeToF() {
        if (tempScale.equals("C")) {
            convertCtoF(highTemp);
            convertCtoF(lowTemp);
        }
    }



    // 3. Add your private static helper rounding "utility" method here:

    private static double roundToNearestTenth(double num) {
        DecimalFormat df = new DecimalFormat("#.##");
        double roundedValue = Double.parseDouble(df.format(num));
        return roundedValue;
    }


    // 4. Complete the toString method below (using your static helper method)
    //    so it returns a String that prints like:

    //    High Temperature: 67.4 F (or C)
    //    Low Temperature: 58.3 F (or C)

    public String toString()
    {
        return "";
    }

    }
