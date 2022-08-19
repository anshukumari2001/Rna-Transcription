import java.util.*;

public class PythagoreanTriplet{

    public static List<Integer> answer = new ArrayList<>();

    public static void findAllTriplet(int N)
    {
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N;j++){
                for(int k=j;k<=N;k++){
                    if((i+j+k)==N){
                        if((i*i+j*j)==k*k){
                            answer.add(i);
                            answer.add(j);
                            answer.add(k);
                        }
                    }
                }
            }
        }
        System.out.print(answer);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();
        findAllTriplet(N);
    }
}
