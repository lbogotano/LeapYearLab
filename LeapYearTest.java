
import org.junit.Assert;
import org.junit.Test;


public class LeapYearTest {
    
     @Test
     public void isYearDivisibleBy4() {
        LeapYear Leap = new LeapYear();
         assertEquals(true, Leap.yearLeapChecker(1996));
         assertEquals(false, Leap.yearLeapChecker(1999));
     }
 
    
    @Test
    public void isDivisibleBy400() {
        Assert.assertEquals(true, LeapYear.checkIfLeapYear(2000));
        Assert.assertEquals(false, LeapYear.checkIfLeapYear(2001));
    }

    
}