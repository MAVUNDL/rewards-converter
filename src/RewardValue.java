public class RewardValue
{
    private double CashValue;
    private float Arline_Miles;

    public RewardValue(double CashValue)
    {
        this.CashValue = CashValue;
        cashToMiles(CashValue);
    }

    public RewardValue(float Air_miles)
    {
        this.Arline_Miles = Air_miles;
        MilesToCash(Air_miles);
    }

    public void MilesToCash(float Air_miles)
    {
        this.CashValue = Air_miles*0.0035;
    }

    public void cashToMiles(double cashValue)
    {
        this.Arline_Miles = (float) (cashValue/ 0.0035);
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