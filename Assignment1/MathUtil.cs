using System;

class MathUtil 
{
    public static bool IsEven(int number)
    {
        if(number % 2 == 0)
          return true;

        else
          return false;
    }

    public static bool IsOdd(int number)
    {
        if(number % 2 == 1)
          return true;

        else
          return false;
    }

    public static bool IsPrime(int number)
    { int a;
      int count = 0;
      for(a = 1; a <= number; ++a)
       {   if(number % a == 0)
             count += 1;
       }   

      if(count == 2)
           return true;
      else
            return false;
    }

    public static int CountPrimes (int lower, int upper)
    {
        int i;
        int count = 0;
        for(i = lower; i <= upper; ++i)
        {
            if(IsPrime(i) == true)
               count += 1;
        }
        return count;
    }

    public static int ReverseNumber(int number)
    {
        int a = 0;
        while(number > 0)
         { a = a * 10 + number % 10;
            number = number / 10;
         }
         return a;
    }

    public static int CountDigit(int number)
    {
        int i=1, count = 0;
        while(i <= number)
        {
            i = i * 10;
            count = count + 1;
        }
        return count;
    }


}

