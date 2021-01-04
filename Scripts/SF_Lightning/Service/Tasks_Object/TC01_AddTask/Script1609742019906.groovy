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

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'service console')

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/select service console'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_CaseVerify/dropdown'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Tasks_Object/Obj01_AddTask/Tasks'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Tasks_Object/Obj01_AddTask/newtask'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the status field'))

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Select value from status field'))

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Tasks_Object/Obj01_AddTask/subject'), Keys.chord('Email', Keys.ENTER))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Tasks_Object/Obj01_AddTask/priority'))

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Select value from priority'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on save button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Email', false)

WebUI.closeBrowser()

