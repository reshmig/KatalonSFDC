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

WebUI.callTestCase(findTestCase('SF_Classic/Login Sales'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_New B'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Contacts_Object/TC14_Contact_LeadConvert/salutation'), 'Mr.', 
    false)

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), lastname)
WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Last Name'), 'Katalon_ContactLeadConvert')

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Company'), 'Marlabs')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), company)
WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Save B'))

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Tab'))

WebUI.verifyTextPresent('Katalon_ContactLeadConvert', false)

WebUI.click(findTestObject('SF_Classic/Sales/Contacts_Object/TC14_Contact_LeadConvert/select'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj13_Convert lead with Opportunity/Lead_Convert B'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Contacts_Object/TC14_Contact_LeadConvert/account'), '0015g0000032mnA', 
    false)

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj14_Convert lead with Opportunity with Task/Lead_Convert_Subject'), 
    'Test_Subject_Convert')

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj13_Convert lead with Opportunity/Lead_Convert_Comment'), 'Test_Lead convert')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj13_Convert lead with Opportunity/Lead_Convert_Convert B'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Classic/Sales/Contacts_Object/TC14_Contact_LeadConvert/click contacts'))

WebUI.verifyTextPresent('Katalon_ContactLeadConvert', false)

WebUI.delay(2)

WebUI.closeBrowser()

