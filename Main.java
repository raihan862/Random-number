package Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j,min,max,detect;

        Scanner sc= new Scanner(System.in);
        System.out.println("Give   the range of the random number");
       max=sc.nextInt();
        min=sc.nextInt();
        RandomNumber rn=new RandomNumber();
        int check=rn.randomNumber(max,min);
        if(max<=10){
            detect=1;
        }
        else if(max<=100 && max>10){
            detect=10;
        }
        else if(max<=1000 && max>100){
            detect=100;
        }
        else if (max<=10000 && max>1000){
            detect=1000;
        }
        else {
            System.out.println("you cross the limit of range");
            return ;
        }
        int count;
        System.out.println("Guess a number");
        int arr[]=new int[10];
        count=0;
        for(j=0;j<10;j++){
            count++;
            i=sc.nextInt();
            arr[j]=i;
            if(i==check){
                System.out.println("Successfull\n the number is %d"+i);
            }
            else{
                if(count<=3){
                    System.out.println("try again");
                }
                else if(count>3 && count<5){
                    int range1=check/detect;
                    int range=range1*detect;
                    System.out.println("the number is lies between  "+range+"and "+(range+detect));
                }
                else if (count>=5){
                    System.out.println("Failed better luck next time\n the number was  "+check);

                    return;
                }

            }
        }
        for(int k=0;k<count;k++){
            System.out.println(arr[k]);
        }
    }
}
