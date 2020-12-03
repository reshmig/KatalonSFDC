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

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj04_Account_Edit_From Record Details page/Account_RV_Open 1st Record'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj04_Account_Edit_From Record Details page/Account_Details_Drop-Down'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Record Detail Page_Change Owner Button'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Change Owner_Search Field Name'), 
    'Laura Garza')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Change Owner_Submit Button'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Change Owner_Search Field Name'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Change Owner_1st Value Selected'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Change Owner_Submit Button'))

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_Record_Details Tab'))

WebUI.verifyElementText(findTestObject('SF_Lightning/Sales/Account_Object/Obj05_Account_Change Owner_From Record Details page/Account_record_Details tab_Owner Name'), 
    'Laura Garza')

WebUI.closeBrowser()

