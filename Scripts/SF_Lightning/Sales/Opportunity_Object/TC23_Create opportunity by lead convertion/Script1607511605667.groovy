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

WebUI.callTestCase(findTestCase('SF_Lightning/Login'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/viewall'))
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/selectsales'))

WebUI.delay(3)

//WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salesoption'))
WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/leadobject'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/newlead'))

WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/salutation'))

CustomKeywords.'Marlabscustom.Salutation'('Mrs.')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), lastname)
WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/lastname'), 'Alpha')

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), 'Marlabs')

//WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/company'), company)
WebUI.click(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/save'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC23_Create_opportunity by lead convertion/Click on the drop down button'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC23_Create_opportunity by lead convertion/Click on the convert from the drop down'))

WebUI.delay(4)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC23_Create_opportunity by lead convertion/Click on the convert button'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC23_Create_opportunity by lead convertion/Click on the Go to leads button'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select_Opportunities'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search bar in opp list view'), 
    Keys.chord('Marlabs-', Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC23_Create_opportunity by lead convertion/Verify element lead convertion'), 
    3)

WebUI.closeBrowser()

