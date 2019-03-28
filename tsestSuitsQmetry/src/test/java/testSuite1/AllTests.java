package testSuite1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testSuits.testc1;

@RunWith(Suite.class)
@SuiteClasses({testc1.class})
public class AllTests {

}
