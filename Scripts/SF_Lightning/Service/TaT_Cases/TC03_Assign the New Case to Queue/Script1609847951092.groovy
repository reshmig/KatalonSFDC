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

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Cases_Object/Case_Transfer_Object/Page_Recently Viewed  Cases  Salesforce/dropdown'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj08_Case_QueueVerification/changeowner'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj08_Case_QueueVerification/imageclick'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj_Case_ChangeOwnertoQueue/queue'))

WebUI.setText(findTestObject('SF_Lightning/Service/Case_Object/Obj08_Case_QueueVerification/queuename'), 'Medium')

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/TaT_Cases/Case_Change Owner_1st item'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Case_Object/Obj08_Case_QueueVerification/submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

