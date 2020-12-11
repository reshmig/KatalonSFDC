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

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/b_Sales_App Launcher'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/span_Accounts_Tab'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/div_Account_New Button'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/input__Account Name'), 'Test_Account_Name')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/a_Account_Rating_--None--'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/a_Account_Rating_Value_Warm'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/textarea_Account_Billing Street'), 
    'Test-Billing Street')

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/textarea_Account_Description'), 
    'Successfully Created from Account Home page using Katalon.')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/span_Account_Save'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj04_Account_Edit_From Record Details page/Account_Details_Drop-Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Account_Object/Obj34_Submit an Approval from Account Details Page/Account_DP_Submit 4 Approval B'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj34_Submit an Approval from Account Details Page/Account_DP_SA_Comments'), 
    'Please approve the Account Record')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj34_Submit an Approval from Account Details Page/Account_DP_SA_Submit B'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.closeBrowser()

