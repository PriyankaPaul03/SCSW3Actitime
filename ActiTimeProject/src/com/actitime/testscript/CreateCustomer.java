package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String customername=f.getExcelValue("CreateCustomer", 1, 0);
		String customerDescp=f.getExcelValue("CreateCustomer", 1, 1);
		
		HomePage h= new HomePage(driver);
		h.clickTasktab();
		
		TaskListPage t= new TaskListPage(driver);
		t.getAddNewBtn().click();
	    t.getNewCustomerMenu().click();
	    t.getNewCustomerMenu().click();
	    t.getEnterCustomerdescriptionTbx().sendKeys(customername);
	    t.getEnterCustomerdescriptionTbx().sendKeys(customerDescp);
	    t.getProjectDropDown().click();
	    t.getOwnCompanyMenu().click();
	    t.getCreateCustomerBtn().click();
	    Thread.sleep(7000); //we have explict wait here
	    String Actualtext=t.getActualCustomerCreated().getText();
	}


}
