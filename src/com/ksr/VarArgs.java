package com.ksr;

public class VarArgs {

    public int add(int...n)      // Variable length argument
    {
        int sum=0;
        for(int i:n)
        {
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[]args)
    {
        VarArgs obj=new VarArgs();
        System.out.print(obj.add(2,3,4,5));

    }
}
