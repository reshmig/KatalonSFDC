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

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select_Opportunities'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search bar in opp list view'), 
    Keys.chord('Blue Star', Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC06_Clone_Opportunity/select the 1st record from the list view'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/Click on the Product dropdown'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/Click on Add products from dropdown'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/click on the check box'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/Click on next button'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/click on quantity field'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/Enter quantity'), '1')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC14_Add_Product_to_Opportunity/Click on save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC17_Editproductfromexistingproductdropdown/Verify product element present or not'), 
    5)

WebUI.closeBrowser()

