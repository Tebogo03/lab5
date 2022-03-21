package Com.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea{
    double length ,breath,area;

    public void getData () throws IOException {
        System.out.println("This program calculates the area of a rectangle");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter the length");
        length = Double.parseDouble(br.readLine()) ;
        System.out.println("please enter the breath");
        breath = Double.parseDouble(br.readLine());
    }
    public void computerField(){

        area = length * breath;
    }
    public void fieldDisplay(){
        System.out.printf("The area of the rectangle is "+ "%2.2f", area);
    }

    static void start() throws IOException{
        RectangleArea ra=new RectangleArea();
        ra.getData();
        ra.computerField();
        ra.fieldDisplay();
    }
}

public class RectangleDemo {

    public static void main(String[] args) throws IOException {
        RectangleArea.start();
    }



}
