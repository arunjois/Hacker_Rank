import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Long> a = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            a.add(new Long(in.nextLong()));

        long min = a.stream().mapToLong(f -> f).min().getAsLong();
        long max = a.stream().mapToLong(f -> f).max().getAsLong();
        long sum = a.stream().mapToLong(f -> f).sum();

        System.out.println((sum - max) + " " + (sum - min));

        in.close();
    }
}
