package avi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class primenumbersTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public primenumbersTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( primenumbersTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testprimenumbers()
    {
        assertTrue( true );
    }
}
