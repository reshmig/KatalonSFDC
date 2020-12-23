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

WebUI.check(findTestObject('SF_Lightning/Service/Case_Object/Obj_CaseEdit_Detailpage/selectcase'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_CaseEdit_Detailpage/dropdown'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_Delete_Listview/seldelete'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Cases_Object/Delete_Case_Object/Page_00001030  Salesforce/span_Delete'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/span_Cases'))

WebUI.verifyElementNotPresent(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_Delete_Listview/verify'), 0)

WebUI.closeBrowser()

