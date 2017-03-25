import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abilashini on 10/22/16.
 */
public class Play20Question {

    public static void main(String[] arcs) {
        Play20Question play20Question = new Play20Question();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int q = sc.nextInt();
            int n = sc.nextInt();



            for (int l = 0; l < q; l++) {
                sc.nextLine();
                String question = sc.nextLine();
//                System.out.println(question);
                String result = sc.next();
//                System.out.println(result);
                List<String> sub = new ArrayList<>();
                String[] array = question.split(" ");
                if(array.length>4) {
                    if (array[3].equals("and")) {
                        sub = Arrays.asList(question.split(" and "));
                    } else if (array[3].equals("or")) {
                        sub = Arrays.asList(question.split(" or "));
                    }
                }else {
                    sub.add(question);
                }
//                for(int i=0;i<sub.size();i++){
//                    System.out.println(sub.get(i));
//                }
//                if (action.equals("color")) {
//                    int i  =sc.nextInt();
//                    String c = sc.next();
//                    question.color(i,c);
//
//                }else if(action.equals("count")){
//                    String c = sc.next();
//                    int j = sc.nextInt();
//                    question.count(c,j);
//                }

            }

        }
    }

    public void color(int i, String c){

    }

    public void count (String c, int j){

    }


}
