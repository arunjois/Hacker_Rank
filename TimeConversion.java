import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         Integer hrs = Integer.parseInt(s.substring(0,2));
         String result = "";
         String sub = s.substring(2,8);
        if(hrs==12 && s.endsWith("PM")) {
            result=s.substring(0,8);
        }
         else if(s.endsWith("PM")) {
            hrs+=12;
            result = hrs.toString() + sub;
         }
        else if (s.startsWith("12") && s.endsWith("AM")) {
            result="00"+sub;
        }
        else 
            result=hrs.toString()+sub;
        
        if(result.length()<8)
            result = "0"+result;
        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
