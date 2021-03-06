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

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'service console')

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/select service console'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_CaseVerify/dropdown'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/span_Cases'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/div_New'))

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/sel_case'))

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/a_Phone'))

WebUI.setText(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/subject'), 'Case Change Owner01')

WebUI.setText(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/description'), 'Case created using Katalon')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/save'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Cases_Object/Case_Transfer_Object/Page_Recently Viewed  Cases  Salesforce/dropdown'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_QueueVerification/changeowner'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_QueueVerification/imageclick'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_ChangeOwnertoPeople/people'))

WebUI.setText(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_QueueVerification/queuename'), 'James Clifton')

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_ChangeOwnertoPeople/selpeople'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_QueueVerification/submit'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/caselist'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_ChangeOwnertoPeople/selectcase'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_ChangeOwnertoPeople/verify'), 0)

WebUI.closeBrowser()

