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

WebUI.callTestCase(findTestCase('SF_Classic/Login Sales'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_New B'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Salutation'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Salutation'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), lastname)
WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Last Name'), 'Alice')

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Company'), 'Marlabs')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), company)
WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Save B'))

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Tab'))

WebUI.verifyTextPresent('Alice', false)

WebUI.delay(5)

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj02_Edit Lead from Lead Home Page/Lead_List View Drop Down'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj02_Edit Lead from Lead Home Page/Lead_Lsit View_Go B'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj02_Edit Lead from Lead Home Page/Lead_Lsit View_Edit_1st Item'))

WebUI.setText(findTestObject('SF_Classic/Sales/Lead_Object/Obj02_Edit Lead from Lead Home Page/Lead_Description'), 'Lead record updated succesfully')

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj01_Create Lead from Lead Home Page/Lead_Save B'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj02_Edit Lead from Lead Home Page/Lead_List View_1st Item'))

WebUI.click(findTestObject('SF_Classic/Sales/Lead_Object/Obj02_Edit Lead from Lead Home Page/Lead_DP_Delete B'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.closeBrowser()

