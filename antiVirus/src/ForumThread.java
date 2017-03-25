import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by abilashini on 10/22/16.
 */
public class ForumThread {
    public static void main(String[] args) throws IOException {
        ForumThread thread = new ForumThread();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=reader.readLine()) != null){

            Map<Integer,Integer> store = new LinkedHashMap<>();
            Map<Integer,Integer> myMap = null;

            List<Integer> list = new ArrayList<>();
            String[] str = line.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            for(int i=0;i<b;i++){
                int p = Integer.parseInt(reader.readLine());
                list.add(p);
            }

            for(int j=0;j<b;j++){
              myMap = thread.storeValue(store,list,j);
            }

            int x = myMap.size();



            int[] array = new int[x];
            int m=0;
            for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
                    array[m] = entry.getValue();
                m++;
            }
            for (int w = 0; w<x;w++){
                if(array[w]<a){
                    array[w] = array[w]+array[w+1];
                }
            }

            int[] check = new int[x];
            for(int k = 0; k<x;k++){
                check[k] = Math.abs(a-array[k]);
                if(check[k]>0){

                }
            }

            System.out.println(thread.getMinFloat(check));


        }

    }

    Map<Integer,Integer> storeValue(Map<Integer,Integer> map , List<Integer> list, int j){
        if(list.get(j) == 0){
            if(map.get(j)==null){
                map.put(j,1);
            }else{
                map.put(j,map.get(j)+1);
            }
        }else{
            j = list.get(j)-1;
            storeValue(map,list,j);
        }
        return map;
    }

    private int getMinFloat(int[] data) {

        int[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy[0];
    }

}
