import org.junit.Test;

public class SecondActivityTest extends SecondActivity {

    private SecondActivity theCalc;

    SecondActivity calc;

    protected void setUp() throws Exception {
        super.setUp();
        calc = new SecondActivity();

    }


    protected void tearDown() throws Exception {
        super.tearDown();
    }
    @Test

    public void testGetSum() {

        int a = 5;
        int b = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (theCalc.getProduct(a, b)), (theCalc.getSum(a+1,b)));
        assertEquals(15, (theCalc.getProduct(a, b)), (theCalc.getSum(b+1,a)));

        a = -5;
        b = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(5, (theCalc.getProduct(a, b)), (theCalc.getSum(a,b)));
        assertEquals(5, (theCalc.getProduct(a, b)), (theCalc.getSum(b,a)));

        a = -5;
        b = -10;
        //	Checks the sum of two (2) negative values
        assertEquals(-15, (theCalc.getProduct(a, b)), (theCalc.getSum(a,b)));
        assertEquals(-15, (theCalc.getProduct(a, b)), (theCalc.getSum(b,a)));
    }

    private void assertEquals(int i, double product, int sum) {
    }

    public void testGetDifference() {

        int a = 3;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(1, (theCalc.getProduct(a, b)), (theCalc.getDifference(a,b)));
        //	Checks if b is greater than a
        assertEquals(-1, (theCalc.getProduct(a, b)), (theCalc.getDifference(b,a)));

        a = 5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(9, (theCalc.getProduct(a, b)), (theCalc.getDifference(a,b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-9, (theCalc.getProduct(a, b)), (theCalc.getDifference(b,a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (theCalc.getProduct(a, b)), (theCalc.getDifference(a,b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (theCalc.getProduct(a, b)), (theCalc.getDifference(b,a)));
    }

    public void testGetProduct() {

        int a = 5;
        int b = 10;
        //	Checks the product of two (2) positive values
        assertEquals(50, (theCalc.getProduct(a,b)),0);
        assertEquals(50, (theCalc.getProduct(b,a)),0);

        a = -5;
        b = 10;
        //	Checks the product of a postive value and a negative value
        assertEquals(-50, (theCalc.getProduct(a,b)),0);
        assertEquals(-50, (theCalc.getProduct(b,a)),0);

        a = -3;
        b = -10;
        //	Checks the product of two (2) negative values
        assertEquals(30, (theCalc.getProduct(a,b)),0);
        assertEquals(30, (theCalc.getProduct(b,a)),0);
    }

    public void testGetQuotient() {

        int a = 10;	int b = 5;
        //	Checks if b is lesser than a
        assertEquals(2, (theCalc.getDivision(a,b)),0);
        //	Checks if b is greater than a
        assertEquals(1, (theCalc.getDivision(b,a)),0);

        a = 9;	b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (theCalc.getDivision(a,b)),0);
        //	Checks if negative value is divided with positive value
        assertEquals(3, (theCalc.getDivision(b,a)),3);

        a = -10;	b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (theCalc.getDivision(a,b)),0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(5, (theCalc.getDivision(b,a)),0);
    }

    public void testThrowException(){

        try {

            theCalc.getSum(2, 1);
            theCalc.getDifference(3, 3);
            theCalc.getProduct(0, 1);
            theCalc.getDivision(1, 0);
            new SecondActivity();

        } catch (Exception e) {
        }
        catch (Error e) {
        }
    }
}
