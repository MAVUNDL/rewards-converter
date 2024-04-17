import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles()
    {
        double cash  =  1000;
        double AirMiles = (float)(cash/0.0035);
        var milesValue = new RewardValue(cash);
        assertEquals(AirMiles, milesValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash()
    {
        float miles = 100.0F;
        double cash = (miles*0.0035);
        var cashValue = new RewardValue(miles);
        assertEquals(cash, cashValue.getCashValue());

    }
}
