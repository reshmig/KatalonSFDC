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

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/new'))

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/Account lookup'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

//WebUI.switchToWindowTitle('Search ~ Salesforce - Developer Edition')
WebUI.delay(3)

WebUI.setText(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/search'), 'Marlabs')

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/search go'))

//WebUI.setText(findTestObject('Object Repository/Page_Asset Edit New Asset  Salesforce - Dev_3b9812/input_Account_Account'), 'Marlabs')
WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/selectMarlabs'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Asset Edit: New Asset ~ Salesforce - Developer Edition')

WebUI.setText(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/name'), 'Test SR Check 123')

WebUI.click(findTestObject('SF_Classic/Sales/Assets_Object/Obj01_CreateAsset/save'))

WebUI.delay(3)

WebUI.verifyTextPresent('Test SR Check 123', false)

WebUI.closeBrowser()

