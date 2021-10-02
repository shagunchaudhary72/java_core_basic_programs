import java.util.Scanner;

class totalSundays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Day of month : ");
        String str=sc.nextLine();
        System.out.print("Enter number of days : ");
        int days=sc.nextInt();
        sc.close();
        boolean flag=true;
         if(str.equals("mon")){
            if(days<7){
                flag=false;
                System.out.println("Total SUndays : 0");
            }
            days-=1;
        }else if(str.equals("tue")){
            if(days<6){
                flag=false;
            System.out.println("Total SUndays : 0");
            }
            days-=2;
        }
        else if(str.equals("wed")){
            if(days<5){
                flag=false;
            System.out.println("Total SUndays : 0");
            }
            days-=3;
        
        }else if(str.equals("thu")){
            if(days<4){
                flag=false;
            System.out.println("Total SUndays : 0");
            }
            days-=4;
        
        }else if(str.equals("fri")){
            if(days<3){
                flag=false;
            System.out.println("Total SUndays : 0");
            }
            days-=5;
        
        }else if(str.equals("sat")){
            if(days<2){
                flag=false;
            System.out.println("Total SUndays : 0");
            }
            days-=6;
        }
        if(days%7==0 && flag){
            System.out.println("total Sundays : "+ (days/7));
        }if(days%7!=0 && flag){
        System.out.println("Total Sundays : " + (days/7+1));
        }
    }
}