package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import pages.JUnitExamPage;
import util.BrowserFactory;

public class JUnitExamTest {
	

	WebDriver driver ;
	
		
	
	
	@Test
	public void toggleAllCheckboxTest () {
		
		driver = BrowserFactory.init();
		
		JUnitExamPage page = PageFactory.initElements(driver, JUnitExamPage.class);
		page.checkSideBoxesIfAvailble();
		page.addSideBoxes();
		
		page.clickOnToggleAllCheckBox();
		page.verifyToggleAllboxesIsChecked();
		page.checkBoxVerification();
		BrowserFactory.teardown();
	}
	
	//@Test 
	public void removeCheckedBoxTest() {
		
			driver = BrowserFactory.init();
		
		JUnitExamPage page = PageFactory.initElements(driver, JUnitExamPage.class);
		
		
		
		page.checkSideBoxesIfAvailble();
		page.addSideBoxes();
		page.SelectCheckBox(4);
		page.clickOnRemoveButton();
		page.verifyThatCheckedBoxIsRemoved(4);
		

	}

	//@Test
	public void toggleAllAndDeleteTest() {

		driver = BrowserFactory.init();
	
	JUnitExamPage page = PageFactory.initElements(driver, JUnitExamPage.class);
	page.checkSideBoxesIfAvailble();
	page.addSideBoxes();
	page.clickOnToggleAllCheckBox();
	page.clickOnRemoveButton();
	page.verifyNoCheckboxisDisplayed();
	BrowserFactory.teardown();
	
	}
	
	
}


