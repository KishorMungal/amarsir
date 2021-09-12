package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.Homepage;
import com.qa.testbase.Testbase;

public class HomepageTest extends Testbase {

	Homepage home;

	public HomepageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException {
		Testbase.initilization();
		home = new Homepage(driver);

	}

	@Test
	public void validatelogo() {
		home.Verifylogo();
	}

	@AfterMethod
	public void shutdown() {
		driver.close();
	}

}
