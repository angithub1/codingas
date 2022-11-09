using SeqLib;

class Program
{
    public static void Main(string[] args)
    {
        double a = double.Parse(args[0]);
        double b = double.Parse(args[1]);
        double c = double.Parse(args[2]);
        double d = double.Parse(args[3]);

        Sequence ls = new LinearSequence(a, b);
        Console.WriteLine("first sum of sequence is {0}", ls.Sum(d));
        Console.WriteLine("second sum of sequence is {0}", ls.Sum(d));

        PowerSequence ps = new PowerSequence(a, c);
        Console.WriteLine("first sum of sequence is {0}", ls.Sum(d));
        ps.Reset();
        Console.WriteLine("second sum of sequence is {0}", ls.Sum(d));

   }
}
