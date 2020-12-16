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

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Asset_Object/TC01_Create_Asset'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj03_Asset_Edit_Detail/Page_Login  Salesforce/input_Username_username'), 
    'qa.katalonautomation@gmail.com')

WebUI.setEncryptedText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj03_Asset_Edit_Detail/Page_Login  Salesforce/input_Password_pw'), 
    'y6DZPm+MBX0CnWA9hcdx/w==')

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj03_Asset_Edit_Detail/Page_Login  Salesforce/input_Password_Login'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Asset_Object/Obj03_Asset_Edit_Detail/Page_Home  Salesforce/span_More'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Asset_Object/Obj03_Asset_Edit_Detail/Page_Home  Salesforce/span_Assets'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj03_Asset_Edit_Detail/Page_Recently Viewed  Assets  Salesforce/a_Server-Dell'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/related'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/new'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/origin'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/phone'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/subject1'), 'casetest01')

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/verify'), 0)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/dropdown'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/edit'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/subject1'), 'casetest01_updated')

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Asset_Object/Obj15_Asset_EditCase/verify2'), 0)

WebUI.closeBrowser()

