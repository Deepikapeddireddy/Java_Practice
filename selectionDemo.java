public class selectionDemo{
    public static void main(String args[]){
        // if else if 
        int n= 0;
        if(n==0)
        {
            System.out.println("Nothing");
        }
       else if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        // ternary operator
        int i = 4;
        int j= 7;
       String x =  i>j ? "i is greater":"j is greater";
       System.out.println(x);

       //Switch
       int s = 1;

       switch(s)
       {
        case 1:System.out.println("ONE");
                break;
         case 2:System.out.println("TWO");
                break;
         case 3:System.out.println("THREE");
                break;
         case 4:System.out.println("FOUR");
                break;
         case 5:System.out.println("FIVE");
                break;
         default:System.out.println("NO MATCH");
                
       }
       String str = "deep";
       switch(str){
        case "deep":System.out.println("so deep");
                break;
        case "shallow":System.out.println("shallow");
                break;
        default: System.out.println("No water");
       }
    }
}