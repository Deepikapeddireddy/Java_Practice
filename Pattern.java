
public class Pattern{
    public static void main(String[] args){
        Patterns obj = new  Patterns();
        obj.pattern1();
        obj.pattern2();
        obj.pattern3();
        obj.pattern4();
        obj.pattern5();
        obj.pattern6();
        obj.pattern7();
    }
}

class Patterns{
    public void pattern1(){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * *
    }
    public void pattern2(){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println();
// 1 1 1 1 1 
// 2 2 2 2 2 
// 3 3 3 3 3 
// 4 4 4 4 4 
// 5 5 5 5 5 
    }
    public void pattern3(){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        System.out.println();
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
    }
    public void pattern4(){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
// *
// * *
// * * *
// * * * *
// * * * * *
    }

    public void pattern5(){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        System.out.println();

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
    }

    public void pattern6(){
        for(char ch = 'A';ch<='D';ch++)
        {
            for (char j = 'A';j<=ch;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
// A 
// A B 
// A B C 
// A B C D 
    }

    public void pattern7(){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if(i==1 || j==1 || i==5 || j==5)
                     System.out.print("$ ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
        System.out.println();

// $ $ $ $ $
// $       $
// $       $
// $       $
// $ $ $ $ $

    }
}