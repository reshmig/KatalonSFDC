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

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj02_Edit Asset record/Asset Record'))

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj02_Edit Asset record/Edit button'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Assets_Object/Obj02_Edit Asset record/Name Field'), 'Edited using Katalon')

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Assets_Object/Obj02_Edit Asset record/Serial Number Field'), '3AEO90123ER-5604A')

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj02_Edit Asset record/Save Button'))

WebUI.delay(10)

WebUI.verifyTextPresent('Edited using Katalon', false)

WebUI.closeBrowser()

