namespace SeqLib;

public class LinearSequence : Sequence
{
    private double current;
    private double difference;

    public LinearSequence(double crnt, double diff)
    {
        current = crnt;
        difference = diff;
    }

    public double Next()
    {
        double term = current;
        current = current + difference;
        return term;
    }

}