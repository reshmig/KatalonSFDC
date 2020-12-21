import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'), 
    'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select sales'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on product object tab'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/Enter text in search box'), 
    Keys.chord('Heater', Keys.ENTER))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC06_Clone_Opportunity/select the 1st record from the list view'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on related tab'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/CLick on add price book'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/Click on price book drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/select price book from drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/Select the currency'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/Value of USD'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/CLick on next'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/Click on save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Product_Object/TC06_To verify user is able to add more price book for a product/Verify price book value'), 
    2)

WebUI.closeBrowser()

