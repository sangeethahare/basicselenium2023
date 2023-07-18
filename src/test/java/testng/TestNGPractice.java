package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {
@Test(invocationCount=2)//@Test run based on invocationCount value
public void sampleTest()
{
	Assert.fail();
	System.out.println("Hi");        
	}

@Test(dependsOnMethods="sampleTest")
public void sample()
{
	System.out.println("Hello! This is TestNG script");}
}
