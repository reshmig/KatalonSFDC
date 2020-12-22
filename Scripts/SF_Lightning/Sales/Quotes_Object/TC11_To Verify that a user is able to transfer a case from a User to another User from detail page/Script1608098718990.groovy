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

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the more option'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Quotes_Object/TC07_To verify user is able to add products in quote line items/Click on the quotes object from drop down'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Quotes_Object/TC07_To verify user is able to add products in quote line items/Click on the search btn in quotes list'), 
    Keys.chord('Installation', Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Quotes_Object/TC07_To verify user is able to add products in quote line items/Select the 1st record name'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Quotes_Object/TC11_To Verify that a user is able to transfer a case from a User to another User from detail page/Click on the new case button'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC11_Create of Case In Opportunity/Click on the drop down of status field'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC11_Create of Case In Opportunity/Select new from the drop down of stage feild'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC11_Create of Case In Opportunity/Enter text on subject'), 
    'Enquire with quotes')

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC11_Create of Case In Opportunity/Enter value to description field'), 
    'change the owner of the case')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC11_Create of Case In Opportunity/Click on save button'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Login/applauncher'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'), 
    'Cases')

WebUI.click(findTestObject('SF_Lightning/Sales/Quotes_Object/TC11_To Verify that a user is able to transfer a case from a User to another User from detail page/Select cases from app launcher'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC06_Clone_Opportunity/select the 1st record from the list view'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Quotes_Object/TC11_To Verify that a user is able to transfer a case from a User to another User from detail page/Click on change owner button'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC07_Opportunity_ToChangeOwner_DetailPage/Click on the search box to select owner'), 
    'James')

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC07_Opportunity_ToChangeOwner_DetailPage/Select the owner'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC07_Opportunity_ToChangeOwner_DetailPage/Submit'))

WebUI.delay(2)

WebUI.closeBrowser()

