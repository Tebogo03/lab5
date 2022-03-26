package Com.Task;

public class Array {
    public static void main(String[] args) {
        int[] number = new int[10] ;

        System.out.println(number.length);
        for (int i=0; i<number.length;i++ ){
          number[i]=number.length -1-i;
        }
        for (int num: number
        ) { System.out.println("Array["+ num +"] = "+number[num]);

        }

    }

}
