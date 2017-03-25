import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abilashini on 10/22/16.
 */
public class FindingShelder {
    public static void main(String[] args) throws IOException {
        FindingShelder find = new FindingShelder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Float> soldX = new ArrayList<>();
        List<Float> soldY = new ArrayList<>();
        List<Float> shelX = new ArrayList<>();
        List<Float> shelY = new ArrayList<>();

        int N = Integer.parseInt(reader.readLine());
        float[][] distances = new float[N][N];
        for (int i=0;i<N;i++){
            String[] str = reader.readLine().split(" ");
            soldX.add(Float.valueOf(str[0]));
            soldY.add(Float.valueOf(str[1]));
        }
        for (int j =0;j<N;j++){
            String[] str = reader.readLine().split(" ");
            shelX.add(Float.valueOf(str[0]));
            shelY.add(Float.valueOf(str[1]));
        }
        for(int k =0; k<N;k++){
            for(int l=0;l<N;l++){
                distances[k][l]=find.findDistance(soldX.get(k),soldY.get(k),shelX.get(l),shelY.get(l));
            }
        }
//        for(int i = 0; i<N; i++)
//        {
//            for(int j = 0; j<N; j++)
//            {
//                System.out.print(distances[i][j]+ " ");
//            }
//            System.out.println(" ");
//        }

        float[][] copy = distances.clone();
        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i].clone();
        }


        //                for(int i = 0; i<N; i++)
//        {
//            for(int j = 0; j<N; j++)
//            {
//                System.out.print(copy[i][j]+ " ");
//            }
//            System.out.println(" ");
//        }

        System.out.println(find.getMinValue(distances));
    }

    float findDistance(float x1, float y1, float x2,float y2){
        float d = (float) Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        return d;
    }
    float getMinValue(float[][] numbers) {
        float minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue ) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue ;
    }
}
