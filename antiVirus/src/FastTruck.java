import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FastTruck {
    public static void main(String[] arcs) throws ParseException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Date> myMap = new HashMap<>();
        List<Long> list = new ArrayList<>();
        String str = reader.readLine();
        String[] x = str.split(",");
        double lat1 = Double.parseDouble(x[0]);
        double long1 = Double.parseDouble(x[1]);
        double r = Double.parseDouble(reader.readLine());
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");

        reader.readLine();

        String line = null;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            String[] y = line.split(",");
            Date date = format.parse(y[0]);
            double lat2 = Double.parseDouble(y[1]);
            double long2 = Double.parseDouble(y[2]);
            String phone = y[3];

            if (myMap.get(phone) != null) {
                if (date.after(myMap.get(phone))) {
                    myMap.remove(phone);
                }
            }

            double a = Math.pow((Math.sin(Math.toRadians((lat1 - lat2) / 2))), 2);
            double b = Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.pow((Math.sin(Math.toRadians((long1 - long2) / 2))), 2);

            double c = Math.sqrt(a + b);

            double d = 2 * 6378.137 * Math.asin(c);

            if (d <= r) {
                myMap.put(phone, date);
            }
        }
        reader.close();

        for (String name : myMap.keySet()) {
            long key = Long.parseLong(name);
            list.add(key);
        }

        Collections.sort(list);

        StringBuilder sc = new StringBuilder();
        for (long n : list) {
            if (sc.length() > 0) sc.append(",");
            sc.append(n);
        }

        System.out.print(sc);


    }
}

