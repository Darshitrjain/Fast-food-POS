import java.io.*;
class Feast
{
    public static void m2()throws IOException
    {
        InputStreamReader isr1=new InputStreamReader(System.in);
        BufferedReader br1=new BufferedReader(isr1);
        FileReader fr=new FileReader("Feast.txt");
        BufferedReader br2=new BufferedReader(fr);
        String feast[]=new String[30];
        String str;
        int n=0,ch,q=0,sz=0,crz=0;
        while(true)
        {
               str=br2.readLine();
            if(str==null)
            {
                break;
            }
            feast[n]=str;
            n++;
        }
        do
        {
            for(int i=0;i<n;i++)
            System.out.println("\t"+feast[i]);
            do
            {
                try
                {
                    System.out.println("\n\t\tEnter choice:");
                    ch=Integer.parseInt(br1.readLine());
                    if(ch>=1&&ch<=4)
                    {}
                    else
                    {
                        ch=0;
                    }
                }
                catch(Exception e)
                {
                    ch=0;
                    System.out.println("Invalid Selection");
                }
            }while(ch==0);
            if(ch>=1&&ch<=10)
            {
                do
                {
                    try
                    {
                        System.out.println("Select SIZE:");
                        System.out.println("\t\t1.Small\n\t\t2.Medium\n\t\t3.Large");
                        sz=Integer.parseInt(br1.readLine());
                        if(sz>=1&&sz<=3)
                        {}
                        else
                    {
                        sz=0;   
                    }
                }
                catch(Exception e)
                {
                    sz=0;
                    System.out.println("Invalid Selection");
                }
            }while(sz==0);
        }
        if(ch>=1&&ch<=14)
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
                    ch1=Integer.parseInt(feast[x].substring(0,2));
                }
                catch(Exception e)
                {ch1=0;
                }
                if(ch1==ch)
                {
                    order=feast[x];
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
                {
                    if(sz==1)
                    rt=175;
                    else if(sz==2)
                    rt=295;
                    else
                    rt=465;
                }
                else if(ch>=2&&ch<=4)
                {
                    if(sz==1)
                    rt=215;
                    else if(sz==2)
                    rt=340;
                    else
                    rt=520;
                }
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