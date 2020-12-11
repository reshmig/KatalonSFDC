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
WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Sales')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/b_Sales_App Launcher'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC12_Edit opp from Con rel tab/Page_Home  Salesforce/span_Contacts'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC12_Edit opp from Con rel tab/Page_Recently Viewed  Contacts  Salesforce/Con_sel first record'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC18_Edit Case frm con rel tab (Case det)/Page_Contact creation katalonn 121  Salesforce/span_Cases'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC20_Del Case frm Con rel tab (Case detail)/Page_Cases  Salesforce/first case rec'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC20_Del Case frm Con rel tab (Case detail)/Page_00001039  Salesforce/button_Delete'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC20_Del Case frm Con rel tab (Case detail)/Page_00001039  Salesforce/span_Delete'))

