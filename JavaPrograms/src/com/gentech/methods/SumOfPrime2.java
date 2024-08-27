package com.gentech.methods;
class PrimeNUM{
    void PrimeaNum()
    {
        int sum =0;
        for(int i=1;i<=100;i++)
        {
            int flag = 0;
            for(int j=2;j<i;j++)
            {
                if(i%j ==  0)
                {
                   flag = 1;
                   break;
                }
            }
            if(flag == 0)
                sum = sum+i;
        }
        System.out.println("SUM OF PRIME NO "+sum);
    }
}
public class SumOfPrime2 {
    public static void main(String[] args) {
    	PrimeNUM ob = new PrimeNUM();
        ob.PrimeaNum();
    }
}
