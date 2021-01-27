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

WebUI.callTestCase(findTestCase('SF_Classic/Login sales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Quotes_Object/Obj03_Editing a quote from Quote record detail pageb/Quote Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Quotes_Object/Obj03_Editing a quote from Quote record detail pageb/Quote Record Link'))

WebUI.click(findTestObject('SF_Classic/Sales/Quotes_Object/Obj03_Editing a quote from Quote record detail pageb/Edit Button Quote Record Detail Page'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Quotes_Object/Obj01_Creation of Quote/Quote Creation page Name field'), 'Edited using directly from Quote record page ')

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Quotes_Object/Obj01_Creation of Quote/Quote Creation Page Description Field'), 
    'Edited using Katalon from Quote det page ')

WebUI.click(findTestObject('SF_Classic/Sales/Quotes_Object/Obj02_Editing a quote from Opportunity record detail page/Save Button Quote Detail Page'))

