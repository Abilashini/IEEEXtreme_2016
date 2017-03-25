import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abilashini on 10/23/16.
 */
public class GoldBach {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(reader.readLine());
        List<Long> list = new ArrayList<>();

        for(long i=2;i<N;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

    }
    private static boolean isPrime(long n) {
        for (int i = 3; i*i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
