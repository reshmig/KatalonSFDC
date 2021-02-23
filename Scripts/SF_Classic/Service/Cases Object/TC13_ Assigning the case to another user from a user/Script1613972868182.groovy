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

WebUI.callTestCase(findTestCase('SF_Classic/Login Service'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.enhancedClick(findTestObject('SF_Classic/Service/Cases Object/TC01_Creation of Cases/Cases Tab'))

WebUI.click(findTestObject('SF_Classic/Service/Cases Object/TC04_Editing a Case Record from List View/List View Button'))

WebUI.click(findTestObject('SF_Classic/Service/Cases Object/TC11_ Assigning the case from List View/Checkbox for Case record'))

WebUI.click(findTestObject('SF_Classic/Service/Cases Object/TC11_ Assigning the case from List View/Change Owner Button'))

WebUI.selectOptionByValue(findTestObject('SF_Classic/Service/Cases Object/TC08_ Assigning a case to a Queue/Case Owner Picklist'), 
    '005', false)

WebUI.setText(findTestObject('SF_Classic/Service/Cases Object/TC07_ Assigning a case to another Person/Change Owner Text Field'), 
    'QA Katalon')

WebUI.click(findTestObject('SF_Classic/Service/Cases Object/TC07_ Assigning a case to another Person/Save Button'))

WebUI.closeBrowser()

