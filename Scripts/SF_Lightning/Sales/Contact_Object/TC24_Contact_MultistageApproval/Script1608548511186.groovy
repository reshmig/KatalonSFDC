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

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Sales')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Account_Object/Obj01_Account_Add_Manual/b_Sales_App Launcher'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/Contact Creation/Page_Home  Salesforce/span_Contacts'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_Recently Viewed  Contacts  Salesforce/New Button'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_New Contact  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_New Contact  Salesforce/a_Ms'))

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_New Contact  Salesforce/First Name'), 
    'MultiApproval_Client')

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_New Contact  Salesforce/Contact lastname'), 
    'test')

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_New Contact  Salesforce/Phone'), 
    '4565432134')

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Contact_Object/TC21_Contact_Searchlistviews/Page_New Contact  Salesforce/span_Save'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Contact_Object/TC22_Contact_Submit for Approval/Contact_Submit 4 Approval B'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Account_Object/Obj34_Submit an Approval from Account Details Page/Account_DP_SA_Comments'), 
    'Please approve the Contact Record')

WebUI.click(findTestObject('SF_Lightning/Sales/Account_Object/Obj34_Submit an Approval from Account Details Page/Account_DP_SA_Submit B'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_ApprovalMultistage/bellicon'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Contact_Object/TC24_Contact_MultistageApproval/approvenote'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvefinal'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/commentsfinal'), 'approved')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvefinalbutton'))

WebUI.delay(10)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/sellogout'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/logout'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/?locale=eu')

WebUI.setText(findTestObject('SF_Lightning/Login/username'), 'qamarlabsapprover@gmail.com')

WebUI.setText(findTestObject('SF_Lightning/Login/password'), 'marlabs5678')

WebUI.click(findTestObject('SF_Lightning/Login/login'))

WebUI.delay(7)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/bellicon'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvenote'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvefinal'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/commentsfinal'), 'approved')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Approval/approvefinalbutton'))

WebUI.delay(10)

WebUI.closeBrowser()

