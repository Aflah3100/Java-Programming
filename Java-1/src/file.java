import java.util.Scanner;

class calc{
    int num1;
    int num2;
    int sum(int a,int b){
        return a+b;
    }
    int multi(int a,int b){
        return a*b;
    }
    int diff(int a, int b){
        return a-b;
    }
    float div(int a, int b){
        float num=(float)a;
        return num/b;
    }
}

public class file{
    public static void main(String args[]){

        System.out.println("Enter 1 to add 2 numbers and 2 to multiply\n");
        Scanner sc=new Scanner(System.in);
        byte choice=sc.nextByte();
        if(choice==1){
            calc obj1=new calc();
            Scanner n=new Scanner(System.in);
            Scanner m=new Scanner(System.in);
            obj1.num1=n.nextInt();
            obj1.num2=m.nextInt();

            System.out.println("The result is "+(obj1.sum(obj1.num1,obj1.num2)));

        }

        else if (choice==2){
            calc obj1=new calc();
            Scanner n=new Scanner(System.in);
            Scanner m=new Scanner(System.in);
            obj1.num1=n.nextInt();
            obj1.num2=m.nextInt();

            System.out.println("The result is "+(obj1.multi(obj1.num1,obj1.num2)));
        }

    }
}

