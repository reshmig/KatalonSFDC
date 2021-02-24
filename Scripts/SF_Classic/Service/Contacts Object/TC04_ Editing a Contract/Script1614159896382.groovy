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

WebUI.enhancedClick(findTestObject('SF_Classic/Service/Contracts Object/TC01_ Creating a Contract/Contracts Tab'))

WebUI.click(findTestObject('SF_Classic/Service/Contracts Object/TC02_ Cloning a Contract/Contract Record'))

WebUI.click(findTestObject('SF_Classic/Service/Contracts Object/TC04_ Editing a contract/Edit Button'))

WebUI.setText(findTestObject('SF_Classic/Service/Contracts Object/TC01_ Creating a Contract/Contract Start Date Field'), 
    '12/24/2021')

WebUI.setText(findTestObject('SF_Classic/Service/Contracts Object/TC01_ Creating a Contract/Contract Term field'), '56')

WebUI.click(findTestObject('SF_Classic/Service/Quotes Object/TC01_ Creation of New Task/Save Button'))

