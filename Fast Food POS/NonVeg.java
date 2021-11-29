import java.io.*;
class NonVeg
{
    public static void m7()throws IOException
    {
        InputStreamReader isr1=new InputStreamReader(System.in);
        BufferedReader br1=new BufferedReader(isr1);
        FileReader fr=new FileReader("NonVeg.txt");
        BufferedReader br2=new BufferedReader(fr);
        String NonVegmenu[]=new String[30];
        String str;
        int n=0,ch,q,sz=0,crz=0;
        while(true)
        {
               str=br2.readLine();
            if(str==null)
            {
                break;
            }
            NonVegmenu[n]=str;
            n++;
        }
        do
        {
            for(int i=0;i<n;i++)
            System.out.println("\t"+NonVegmenu[i]);
            do
            {
                try
                {
                    System.out.println("\n\t\tEnter choice:");
                    ch=Integer.parseInt(br1.readLine());
                    if(ch>=1&&ch<=6)
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
            
            
            if(ch>=1&&ch<=6)
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
                            if(sz==2)
                            {
                            do
                            {
                                System.out.println("\n\tSelect the crust:");
                                System.out.println("Double burst");
                                System.out.println("Deep Dish");
                                System.out.println("3.Thin crust");
                                System.out.println("4.exit");
                                System.out.println("Enter your choice");
                                try
                                {
                                    crz=Integer.parseInt(br1.readLine());
                                    if(crz>=1&&crz<=4)
                                    {}
                                    else
                                    crz=0;
                                }
                                catch(Exception e)
                                {
                                    crz=0;
                                }
                            }while(crz==0);
                        }
                    
                    
                }catch(Exception e)
                {
                    sz=0;
                    System.out.println("Invalid Selsection");
                }
            }while(sz==0);
        }
        if(ch>=1&&ch<=6)
        {
            do
            {
                try
                {
                    System.out.println("\t\tEnter quantity");
                    q=Integer.parseInt(br1.readLine());
                }
                catch(Exception e)
                {
                    q=0;
                    System.out.println("Invalid Selsection");
                }
            }while(q==0);
            int ch1,rt=0;
            String order="";
            for(int x=0;x<n;x++)
            {
                try
                {
                    ch1=Integer.parseInt(NonVegmenu[x].substring(0,2));
                }
                catch(Exception e)
                {ch1=0;
                }
                if(ch1==ch)
                {
                    order=NonVegmenu[x];
                    break;
                }
                if(order.length()<30)
                {
                    for(int z=order.length();z<=30;z++)
                    {
                        order+=" ";
                    }
                }
                if(crz==1)
                {
                    crz=89;
                }
                else if(crz==2)
                {
                    crz=40;
                }
                else if(crz==3)
                {
                    crz=20;
                }
                else if(crz==4)
                {
                    crz=0;
                }
                if(ch==1)
                {
                    if(sz==1)
                    rt=100;
                    else if(sz==2)
                    rt=205+crz;
                    else
                    rt=360;
                }
                else if(ch>=2&&ch<=3)
                {
                    if(sz==1)
                    rt=140;
                    else if(sz==2)
                    rt=205+crz;
                    else
                    rt=410;
                }
                else
                {
                    if(sz==1)
                    rt=180;
                    else if(sz==2)
                    rt=260+crz;
                    else
                    rt=465;
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