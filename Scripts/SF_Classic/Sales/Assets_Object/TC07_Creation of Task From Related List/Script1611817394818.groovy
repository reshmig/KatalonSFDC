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

WebUI.maximizeWindow()

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/Assets'))

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj06_Cloning a Asset/Asset Record'))

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj07_Creation of Task from related List/Task Button'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Assets_Object/Obj07_Creation of Task from related List/Text Box'), 'THIS RECORD IS CREATED BY KATALON')

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Assets_Object/Obj07_Creation of Task from related List/Status Picklist'), 
    'In Progress', false)

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Assets_Object/Obj07_Creation of Task from related List/Priority Picklist'), 
    'Normal', false)

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Assets_Object/Obj07_Creation of Task from related List/Subject Field'), 
    'Created using Katalon')

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj07_Creation of Task from related List/Save Button'))

WebUI.delay(5)

WebUI.verifyTextPresent('Created using Katalon', false)

WebUI.closeBrowser()

