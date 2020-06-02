import org.junit.Assert;
import org.junit.Test;


public class LeapYearTest {
    
     @Test
     public void isYearDivisibleBy4() {
         Assert.assertEquals(true, LeapYear.yearLeapChecker(1996));
         Assert.assertEquals(false, LeapYear.yearLeapChecker(1999));
     }
 
    
    @Test
    public void isDivisibleBy400() {
        Assert.assertEquals(true, LeapYear.checkIfLeapYear(2000));
        Assert.assertEquals(false, LeapYear.checkIfLeapYear(2001));
    }

    
}