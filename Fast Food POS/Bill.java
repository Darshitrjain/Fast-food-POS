import java.util.*;
class Bill
{
    public static void display ()
    {
        String str;
        int i=MainMenu.srno;
        int len;
        double sum=0.0,stax,gtotal;
        Calendar obj=Calendar.getInstance();
        String date=""+obj.get(Calendar.DATE)+"-"+(obj.get(Calendar.MONTH)+1)+"-"+obj.get(Calendar.YEAR);
        String time=""+obj.get(Calendar.HOUR)+":"+obj.get(Calendar.MINUTE)+":"+obj.get(Calendar.SECOND);
        System.out.println("\f");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t DOMINOS PIZZA");
        System.out.println("\n\t\t\t\t\t Date:"+date+"\t\t\t BILL\t\t\t   TIME="+time);
        System.out.println("\t");
        for(int x=0;x<100;x++)
        {
            System.out.println("-");
        }
        System.out.println("\n\t\tITEM NAME\t\t\t\t\tRate/-\t\tQuantity\tTotal");
        System.out.println("\t");
        for(int x=0;x<100;x++)
        {
            System.out.println("-");
            System.out.println();
        }
        for(int j=0;j<i;j++)
        {
            str=MainMenu.order[j][0];
            len=str.length();
            System.out.print("\t\t"+(j+1)+").");
            for(int a=len;a<=35;a++)
               str=str+"";
            System.out.println(str);
            System.out.println("\tRs."+MainMenu.order[j][1]+"\t\t"+MainMenu.order[j][2]+"\t\tRs."+MainMenu.order[j][3]);
            sum=sum+Double.parseDouble(MainMenu.order[j][3]);
        }
        stax=sum*0.125;
        gtotal=sum+stax;
        System.out.print("\t");
        for(int x=0;x<100;x++)
           System.out.print("-");
        System.out.print("\n\t");
        for(int x=0;x<100;x++)
           System.out.print("-");
        
           
        System.out.print("\n\t\t\t\t\t\t\tTotal:-Rs.\t"+sum);
        System.out.print("\n\t\t\t\t\t\t\tService Tax:-Rs.\t"+stax);
        System.out.print("\n\t\t\t\t\t\t\tGrand Total:-Rs.\t"+gtotal);
        System.out.print("\n\t");
        for(int x=0;x<100;x++)
           System.out.print("-");
        System.out.println("\n\t\t\t THANK YOU AND DO VISIT AGAIN");
        System.exit(0);
    }
}
