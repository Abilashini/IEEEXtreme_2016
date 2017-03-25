import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by abilashini on 10/22/16.
 */
public class GameOfStones {
    public static void main(String[] arcs) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for(int i=0;i<T;i++){
            List<Integer> piles = new ArrayList<>();
            int G = Integer.parseInt(reader.readLine());
            for(int j=0;j<G;j++){
                int N = Integer.parseInt(reader.readLine());
                String P = reader.readLine();
                String[] str = P.split(" ");
                for(int k=0;k<N;k++){
                    //System.out.println(str[k]);
                    piles.add(Integer.parseInt(str[k]));
                }
            }
            Collections.sort(piles);
           // System.out.println(piles);

            int w=0;
            for(int l=0;l<piles.size();l++){
                if(piles.get(l)>1){
                    w++;
                    piles.set(l,piles.get(l)-2);
                    piles.add(1);
                    piles.add(1);
                    Collections.sort(piles);
                    //System.out.println(piles);

                }
            }
            if(w%2 ==1){
                System.out.println("Alice");
            }else{
                System.out.println("Bob");
            }
        }
    }
}
