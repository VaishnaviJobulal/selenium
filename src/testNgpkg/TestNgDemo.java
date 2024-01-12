package testNgpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	@BeforeTest
	public void setup() {
		System.out.println("open browser");
	}
	@BeforeMethod
	public void urlload() {
		System.out.println("loading url");
	}
	@Test(groups = {"smoke","sanity"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups = {"sanity","regression"})
	public void test3() {
		System.out.println("test3");
	}
	@Test(groups = "sanity")
	public void test4() {
		System.out.println("test4");
	}
	@Test(groups = "regression")
	public void test5() {
		System.out.println("test5");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	@AfterTest
	public void tteatdown() {
		System.out.println("browser close");
	}

}
