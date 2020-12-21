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

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'), 
    'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select sales'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on product object tab'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on new button'))

WebUI.delay(2)

WebUI.setText(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/enter product name'), 
    'Heater')

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on save'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on related tab'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on Add standard price book'))

WebUI.delay(2)

WebUI.setText(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Enter text in list price book'), 
    '200')

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Click on save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Product_Object/TC05_To verify user is able to add one price Book for the product for the first time/Verify price book'), 
    2)

WebUI.closeBrowser()

