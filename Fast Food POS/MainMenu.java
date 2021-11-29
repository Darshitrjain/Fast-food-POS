import java.io.*;
class MainMenu
{
    static String order[][]=new String[50][5];
    static int srno;
    public static void main()throws IOException
    {
        InputStreamReader isr1=new InputStreamReader(System.in);
        BufferedReader br1=new BufferedReader(isr1);
        String mMenu[]=new String[10];
        FileReader fr=new FileReader("menu.txt");
        BufferedReader br2=new BufferedReader(fr);
        String str;
        int n=0,ch,q;
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            {break;
            }
            System.out.println(n+"."+str);
            mMenu[n]=str;
            n++;
        }
        do
        {
            System.out.println("WELCOME TO DOMINO'S PIZZA");
            System.out.println("\f\n\t\t\t----MAIN MENU----");
            for(int x=0;x<n;x++)
            System.out.println("\t\t"+(x+1)+")."+mMenu[x]);
            System.out.println("\t\t"+(n+1)+").Bill");
            System.out.println("\n\t\tEnter choice:");
            do
            {
                try
                {
                    ch=Integer.parseInt(br1.readLine());
                    break;
                }
                catch(Exception e)
                {ch=0;
                }
            }while(ch!=0);
            
            
            switch(ch)
            {
                case 1:System.out.println("\f\t\tYou have chosen VEG.");
                Veg.m1();
                main();
                break;
                
                case 2:System.out.println("\f\t\tYou have chosen NON VEG.");
                NonVeg.m7();
                main();
                break;
                
                case 3:System.out.println("\f\t\tYou have chosen FEAST PIZZA.");
                Feast.m2();
                main();
                break;
                
                case 4:System.out.println("\f\t\tYou have chosen PIZZA MANIA COMBINATIONS.");
                ManiaCombo.m6();
                main();
                break;
                
                case 5:System.out.println("\f\t\tYou have chosen PIZZA MANIA SINGLE.");
                MSingle.m4();
                main();
                break;
                
                case 6:System.out.println("\f\t\tYou have chosen SIDE ORDER.");
                SOrder.m5();
                main();
                break;
                
                case 7:System.out.println("\f\t\tYou have chosen Coco Cola");
                do
                {
                   try
                   {
                    System.out.println("\t\tEnter quantity:");
                    q=ch=Integer.parseInt(br1.readLine());
                    }
                    catch(Exception e)
                    {
                        q=0;
                        System.out.println("Invalid Selection");
                    }
               }
            while(q==0);
            order[srno][0]="Coco Cola";
            order[srno][1]="30";
            order[srno][2]=""+q;
            order[srno][3]=""+(q*30);
            srno++;
            break;
            case 8:System.out.println("\f\t\tYou have Chosen CHOCO LAVA CAKE.");
            do
            {
                 try
                   {
                    System.out.println("\t\tEnter quantity:");
                    q=ch=Integer.parseInt(br1.readLine());
                }
                catch(Exception e)
                {
                    q=0;
                    System.out.println("Invalid Selection");
                }
            }while(q==0);
            order[srno][0]="Choco Lava Cake";
            order[srno][1]="30";
            order[srno][2]=""+q;
            order[srno][3]=""+(q*30);
            srno++;
            break;
            case 9:System.out.println("\f\n\n");
            Bill.display();break;
            default:System.out.println("\t\tInvalid choice");
            for(double i=0;i<10000;i+=0.001);
        }
    }while(ch!=9);
}
}