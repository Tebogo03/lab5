package Com.Task;

import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        Random number = new Random();
        int[] num = new int[10];
        int min=0,max=100;
        for (int i=0;i<10;i++){
            int a=number.nextInt(100);
            if(a<max){
                max=a;
            }
            num[i]=a;
            if(a>min){
                min=a;
            }
        }
        for (int a:num
             ) {
            System.out.println(a);

        }
        System.out.println("The min number is "+ max);
        System.out.println("The max number is "+ min);
    }
}
