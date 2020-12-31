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

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Reports_Object/Obj05_CasewithEmails_Report/report'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/CLick on new reports button'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Switch to frame'), 
    4)

WebUI.setText(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on the search field'), 
    'Case')

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Reports_Object/Obj06_CaseHistory_Report/reportselect'))

WebUI.click(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on continue'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/CLick on run button'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on the drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on save from drop down'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on the Report name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on the Report name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on the Report name'), 
    ' Katalon')

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click save'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on Report object tab'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Reports_object/TC01_To verify that the user is able create a report for Opportunity History/Click on the search report in list view'), 
    Keys.chord('New Case History Report Katalon', Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Service/Reports_Object/Obj06_CaseHistory_Report/verify'), 4)

WebUI.closeBrowser()

