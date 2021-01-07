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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('SF_Lightning/Login/username'), GlobalVariable.username)

WebUI.setText(findTestObject('SF_Lightning/Login/password'), GlobalVariable.password)

WebUI.click(findTestObject('SF_Lightning/Login/login'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Classic/Login sales/Click close on pop up'))

WebUI.enhancedClick(findTestObject('SF_Classic/Login sales/Click on App menu'))

WebUI.enhancedClick(findTestObject('SF_Classic/Login sales/Click on App launcher'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('SF_Classic/Login sales/Click on qick find box'), Keys.chord('Service', Keys.ENTER))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Classic/Login for Service/Click on Service'))

