package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.PetsitcareBaseclass;

public class LoginTest extends PetsitcareBaseclass
{
	@Test(priority = 1)
	public static void login() throws Exception
	{
		intialization();
		browserintialization();
		launchUrl();
		pageIntialisation();
		PetsitcareBaseclass.loginfun();
	}
	@Test(priority = 2)
	public static void addService() throws InterruptedException, IOException
	{
		addServicefirststep();
		addServicesecondstep();
		addServicethirdstep();
	}
	@Test(priority = 3)
	public static void verifyService() throws InterruptedException
	{
		PetsitcareBaseclass.verifyAddService();
	}
}
