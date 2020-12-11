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

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC09_Create_Opportunity_From_Account_QuickAction/To click on the Account tab'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/div_Account_New Button'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/input__Account Name'), 'Acc_Panasonic')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/span_Account_Save'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC09_Create_Opportunity_From_Account_QuickAction/Click on the drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC09_Create_Opportunity_From_Account_QuickAction/Select new opportunity from drop down'))

WebUI.delay(2)

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Enter Opp Name'), 
    'Panasonic')

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Set text in date field'), 
    '12/10/2021')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/stage values'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/select stage value prospecting'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC09_Create_Opportunity_From_Account_QuickAction/Save'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select_Opportunities'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search bar in opp list view'), 
    Keys.chord('Panasonic', Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC09_Create_Opportunity_From_Account_QuickAction/Verify Element text'), 
    5)

WebUI.closeBrowser()

