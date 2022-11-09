using System;


int x = int.Parse(args[0]);
int y = int.Parse(args[1]);

if(MathUtil.IsEven(x) == true)
 Console.WriteLine("The given number {0} is even", x);

if(MathUtil.IsOdd(x) == true)
 Console.WriteLine("The given number {0} is odd", x);

if(MathUtil.IsPrime(x) == true)
 Console.WriteLine("The given number {0} is prime", x);

Console.WriteLine("Total prime numbers in this limit are {0}", MathUtil.CountPrimes(x,y));
Console.WriteLine("reverse number is {0} : ", MathUtil.ReverseNumber(x));
Console.WriteLine($"Total digit in number: {MathUtil.CountDigit(x)}  ");


