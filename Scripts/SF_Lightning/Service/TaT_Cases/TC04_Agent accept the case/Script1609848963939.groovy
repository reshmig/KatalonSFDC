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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.refresh()

WebUI.setText(findTestObject('SF_Lightning/Login/username'), 'qamarlabsapprover@gmail.com')

WebUI.setText(findTestObject('SF_Lightning/Login/password'), 'marlabs5678')

WebUI.click(findTestObject('SF_Lightning/Login/login'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Login/applauncher'))

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'Service Console')

WebUI.click(findTestObject('SF_Lightning/Service/Entitlement_Object/Obj01_CreateEntitlement/App Launcher_Service Console'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Omni Channel/Obj04_Verify Omni channel is available/Omni Channel_Header Lnk'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Omni Channel/Obj05_Verify change in status of Omni channel/OC_Status Drop Down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Omni Channel/Obj05_Verify change in status of Omni channel/OC_Status_Available'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('SF_Lightning/Service/Omni Channel/Obj05_Verify change in status of Omni channel/OC_Status Title'), 
    'Available - Case')

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/TaT_Cases/OmniChannel_Accept Case B'))

WebUI.delay(5)

