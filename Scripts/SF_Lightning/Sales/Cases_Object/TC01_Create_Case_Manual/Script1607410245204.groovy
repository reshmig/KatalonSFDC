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

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/selectsales'))

//WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_Home  Salesforce/span_More'))
WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_Home  Salesforce/span_Cases'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_Recently Viewed  Cases  Salesforce/div_New'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_New Case  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_New Case  Salesforce/a_Phone'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Cases_Object/Page_New Case  Salesforce/Add_subject'), 'NewCaseAB')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_New Case  Salesforce/span_Save'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Page_Home  Salesforce/span_Cases'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Cases_Object/Page_New Case  Salesforce/verify'), 0)

WebUI.closeBrowser()

