package Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) throws IOException {
        abSort(read("http://google.com"));
    }

    public static String read(String urlName) throws IOException {
        URL url = new URL("http://google.com");
        URLConnection connection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        while(bufferedReader.ready()) {
            sb.append(bufferedReader.readLine());
        }
        return sb.toString();
    }

    public static void abSort(String text) {
        Set<String> abSet = new TreeSet<>();
        Map<String, Integer> map = new HashMap<>();
        text = text.replaceAll("\n", "");
        String[] lines = text.split("[<>]");
        for (String line : lines) {
            if (!line.contains("/w"))
            {
                abSet.add(line);
                if (map.containsKey(line)) {
                    map.replace(line, map.get(line), map.get(line) + 1);
                } else {
                    map.put(line, 1);
                }
            }
        }
        System.out.println(abSet);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
