import java.util.Scanner;

class Calc{


    float num1;
    float num2;


    float sum(float a,float b){
        return a+b;
    }

    float diff(float a,float b){
        return a-b;
    }

    float multi(float a,float b){
        return a*b;
    }

    float div(float a,float b){
        return a/b;
    }




}








public class calculator{


    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);



        System.out.println("Enter 1 to add 2 numbers \n2 to Subtract \n3 to Multiply \n4 to Divide");

        byte choice=obj.nextByte();

        if(choice==1)
        {
            Calc obj1=new Calc();
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);

            obj1.num1=sc1.nextFloat();
            obj1.num2=sc2.nextFloat();

            System.out.println(obj1.num1+"+"+obj1.num2+"="+(obj1.sum(obj1.num1,obj1.num2)));
        }

        else if(choice==2)
        {
            Calc obj1=new Calc();
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);

            obj1.num1=sc1.nextFloat();
            obj1.num2=sc2.nextFloat();

            System.out.println(obj1.num1+"-"+obj1.num2+"="+(obj1.diff(obj1.num1,obj1.num2)));


        }

        else if(choice==3)
        {
            Calc obj1=new Calc();
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);

            obj1.num1=sc1.nextFloat();
            obj1.num2=sc2.nextFloat();

            System.out.println(obj1.num1+"*"+obj1.num2+"="+(obj1.multi(obj1.num1,obj1.num2)));
        }

        else if(choice==4)
        {
            Calc obj1=new Calc();
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);

            obj1.num1=sc1.nextFloat();
            obj1.num2=sc2.nextFloat();

            System.out.println(obj1.num1+"/"+obj1.num2+"="+(obj1.div(obj1.num1,obj1.num2)));
        }

        else{

            System.out.println("Incorrect Choice Detected\n");


        }

    }
}
