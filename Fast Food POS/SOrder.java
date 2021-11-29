import java.io.*;
class SOrder
{
    public static void m5()
    throws IOException
    {
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        String Sorder[]=new String[12];
        FileReader fr=new FileReader("SIDEORDER.txt");
        BufferedReader br2=new BufferedReader(fr);
        String str,order="";
        int n=0,ch,q,ch1,rt=0;
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            break;
            Sorder[n]=str;
            n++;
        }
        do
        {
            for(int i=0;i<n;i++)
               System.out.println("\t\t"+Sorder[i]);
            do
            {
                try
                {
                    System.out.print("\t\tEnter Choice:");
                    ch=Integer.parseInt(br1.readLine());
                }
                catch(Exception e)
                {
                    ch=0;
                    System.out.println("Invalid Selection");
                }
            }
            while(ch==0);
            if(ch>0&&ch<=n)
            {
                do
                {
                    try
                    {
                       System.out.print("\t\tEnter the quantity");
                       q=Integer.parseInt(br1.readLine());
                    }
                    catch(Exception e)
                    {
                        q=0;
                        System.out.println("Invalid Selection");
                    }
                }while(q==0);
                for(int x=0;x<n;x++)
                {
                    try
                    {
                        ch1=Integer.parseInt(Sorder[x].substring(0,1));
                    }
                    catch(Exception e)
                    {
                        ch1=0;
                    }
                    if(ch1==ch)
                    {
                        order=Sorder[x];
                        order=order.substring(0,order.indexOf('-')).trim();
                        break;
                    }
                    if(order.length()<30)
                    {
                        for(int z=order.length();z<=30;z++)
                        {
                            order+="";
                        }
                    }
                    if(ch==1)
                       rt=79;
                    else if(ch==2)
                       rt=79;
                    else if(ch==3)
                       rt=85;
                    else if(ch==4)
                       rt=55;
                    else if(ch==4)
                       rt=90;
                    else if(ch==4)
                        rt=25;
                    }
                    MainMenu.order[MainMenu.srno][0]=order;
                    MainMenu.order[MainMenu.srno][1]=""+rt;
                    MainMenu.order[MainMenu.srno][2]=String.valueOf(q);
                    MainMenu.order[MainMenu.srno][3]=String.valueOf(rt*q);
                    MainMenu.srno++;
                }
                else
                   System.out.println("\t\tInvalid Choice");
                do
                {
                    try
                    {
                        System.out.print("\t\tDo you want to continue?\n\t\t1.Yes\n\t\t2.No");
                        ch=Integer.parseInt(br1.readLine());
                    }
                    catch(Exception e)
                    {
                        ch=0;
                        System.out.println("Invalid Choice");
                    }
                }while(ch==0);
            }
            while(ch!=2);
        }
    }
    
                