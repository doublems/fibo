import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //System.out.println(getFiboo(8).toString());
        //1 1 2 3 5 8
        System.out.println(getFiboNum(1000000));
    }

    //피보나치 리스트
    public static List<Integer> getFiboList(int endNum){
        List <Integer> returnList = new ArrayList <Integer>();
        if(endNum>0){
        for (int i = 0 ;i<endNum;i ++){
            if(i == 0){
                returnList.add(0);
            }else if(i == 1){
                returnList.add(1);
            }else {
                returnList.add(returnList.get(i-2)+returnList.get(i-1));
            }
        }


        }

        return returnList;
    }
    //재귀
    public static int selfGetFibo(int num){
            if(num <= 1){
                return num;
            }else {
                return selfGetFibo(num-2) + selfGetFibo(num-1);
            }
    }
    //피보나치 해당 위치 숫자
    public static int getFiboNum(int index){
        int [] temp = new int [3];

        for(int i = 0;i<index;i++){
            if(i<=1){
                temp[0] = 0;
                temp[1] = 1;
                temp[2] = 1;
            }else {
                int result = 0;
                result = temp[1] + temp [2];
                temp[0] = temp[1];
                temp[1] = temp[2];
                temp[2] = result;
            }

        }

        return temp[2];
    }
}
