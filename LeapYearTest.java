
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
        LeapYear Leap = new LeapYear();
        assertEquals(true, Leap.checkIfLeapYear(2000));
        assertEquals(false, Leap.checkIfLeapYear(2001));
    }

    
}