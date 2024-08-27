package com.gentech.method.noreturntype;

class CountPrime
{
    void countPrimeNo()
    {
        int count =0;
        for(int i=50;i<=150;i++)
        {
            int flag = 0;
            for(int j=2;j<i;i++)
            {
                if(i%j == 0)
                {
                    flag += 1;

                    break;
                }
            }
            if(flag == 0)
            {
                count = count +1;
            }
        }
        System.out.println("Count of prime numbers between 50 to 150 :"+count);
    }
}
public class CountOfPrimenum {
    public static void main(String[] args) {
        CountPrime a = new CountPrime();
        a.countPrimeNo();
    }
}
