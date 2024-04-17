public class RewardValue
{
    private final double CashValue;
    private final float Arline_Miles;

    public RewardValue(double CashValue)
    {
        this.CashValue = CashValue;
        // converting cash to miles
        this.Arline_Miles = (float)(this.CashValue / 0.0035);
    }

    public RewardValue(float Air_miles)
    {
        this.Arline_Miles = Air_miles;
        // converting miles to cash
        this.CashValue = this.Arline_Miles*0.0035;
    }

    public float getMilesValue()
    {
        return this.Arline_Miles;
    }

    public double getCashValue()
    {
        return this.CashValue;
    }
}