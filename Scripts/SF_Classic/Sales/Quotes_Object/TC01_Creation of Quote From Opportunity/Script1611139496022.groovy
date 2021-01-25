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

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Opportunities tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Opp record'))

WebUI.click(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Detail Page New quote Button'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Quote Creation page Name field'), 'Test SR Quote from Opp1234')

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Quote Creation Page Description Field'), 
    'This record s created using Katalon')

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Quote Creation Page Tax Field'), '550')

WebUI.click(findTestObject('SF_Classic/Sales/Quotes_Object/TC01_Creation of Quote/Quote Creation Page Save button'))

