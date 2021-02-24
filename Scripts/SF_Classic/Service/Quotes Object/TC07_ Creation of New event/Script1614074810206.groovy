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

WebUI.enhancedClick(findTestObject('SF_Classic/Service/Quotes Object/TC01_ Creation of New Task/Quotes Tab'))

WebUI.click(findTestObject('SF_Classic/Service/Quotes Object/TC01_ Creation of New Task/Quote Record Link'))

WebUI.click(findTestObject('SF_Classic/Service/Quotes Object/TC07_ Creating New event/Create Event Button'))

WebUI.setText(findTestObject('SF_Classic/Service/Quotes Object/TC07_ Creating New event/Subject Field'), 'EVENT CREATED USING KATALON')

WebUI.setText(findTestObject('SF_Classic/Service/Quotes Object/TC07_ Creating New event/Description Field'), 'THIS RECORD IS CREATED USING KATALON. PLEASE DONT DELETE')

WebUI.click(findTestObject('SF_Classic/Service/Quotes Object/TC01_ Creation of New Task/Save Button'))

