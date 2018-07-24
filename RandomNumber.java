package Exam;

import java.util.Random;

public class RandomNumber {
    public int randomNumber(int max,int min) {

        Random r=new Random();
        int a=max-min+1;
        int b=r.nextInt(a)+min;
 return b;
    }
}
