
import java.io.*;
class MSingle
{
    public static void m4()throws IOException
    {
        InputStreamReader isr1=new InputStreamReader(System.in);
        BufferedReader br1=new BufferedReader(isr1);
        String MS[]=new String[15];
        FileReader fr=new FileReader("ManiaSingle.txt");
        BufferedReader br2=new BufferedReader(fr);
        String str;
        int n=0,ch,q;
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            {break;
            }
            MS[n]=str;
            n++;
        }
        do
        {
            for(int i=0;i<n;i++)
            System.out.println("\t\t"+MS[i]);
            do
            {
                try
                {
                    System.out.println("\n\t\tEnter choice:");
                    ch=Integer.parseInt(br1.readLine());
                }
                
                catch(Exception e)
                {
                    ch=0;
                    System.out.println("Invalid Selection");
                }
            }while(ch==0);
            if(ch>=1&&ch<=n)
            {
                do
                {
                    try
                    {
                        System.out.println("\t\tEnter Quantity");
                        q=Integer.parseInt(br1.readLine());
                    }
                    catch(Exception e)
                {
                    q=0;
                    System.out.println("Invalid Selection");
                }
            }while(q==0);
            int ch1,rt=0;
            String order="";
            for(int x=0;x<n;x++)
            {
                try
                {
                    ch1=Integer.parseInt(MS[x].substring(0,1));
                }
                catch(Exception e)
                {ch1=0;
                }
                if(ch1==ch)
                {
                    order=MS[x];
                    order=order.substring(0,order.indexOf('-')).trim();
                    break;
                }
                if(order.length()<30)
                {
                    for(int z=order.length();z<=30;z++)
                    {
                        order+=" ";
                    }
                }
                 if(ch==1)
                
                    rt=39;
                    else if(ch==2)
                    rt=55;
                    else if(ch==3)
                    rt=65;
                    else if(ch==4)
                    rt=75;
                }
                MainMenu.order[MainMenu.srno][0]=""+order;
            MainMenu.order[MainMenu.srno][1]=""+rt;
            MainMenu.order[MainMenu.srno][2]=String.valueOf(q);
            MainMenu.order[MainMenu.srno][3]=String.valueOf(rt*q);
            MainMenu.srno++;
        }
        else
        System.out.println("Invalid choice");
        do
        {
            try
            {
                System.out.println("\t\tDo you want to CONTINUE?\n\t\t1.Yes\n\t\t2.No");
                ch=Integer.parseInt(br1.readLine());
            }
            catch(Exception e)
            {
                ch=0;
                System.out.println("Invalid Selection");
            }
        }while(ch==0);
    }while(ch!=2);
}
}          