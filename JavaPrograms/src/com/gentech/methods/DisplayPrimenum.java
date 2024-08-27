package com.gentech.methods;

class Prime
{
    void display1To50()
    {
        for(int i = 1;i<=50;i++)
        {
            int flag=0;
           for(int j = 2;j<i;j++)
           {
               if(i%j ==0)
               {
                   flag=1;
                   break;
               }
           }
               if(flag ==0)
                   System.out.println(i+" is a prime");
        }
    }
}
public class DisplayPrimenum {
    public static void main(String[] args) {
        Prime n = new Prime();
        n.display1To50();
    }
}
