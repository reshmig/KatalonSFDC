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

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/New Case Button'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Subject Field'), 
    'Case from Asset Related List Katalon')

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Status Field'), 
    'Working', false)

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Case Origin Field'), 
    'Phone', false)

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Description Field'), 
    'Created using KATALON')

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Product Picklist'), 
    'GC5040', false)

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Potential Liability Picklist'), 
    'No', false)

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj13_Creation of New Case From related List/Save Button'))

WebUI.verifyTextPresent('Case from Asset Related List Katalon', false)

WebUI.closeBrowser()

