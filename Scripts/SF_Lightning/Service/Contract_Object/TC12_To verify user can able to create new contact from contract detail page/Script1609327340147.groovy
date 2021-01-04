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

WebUI.setText(findTestObject('SF_Lightning/Sales/Lead_Object/Obj_Lead_Add_Manual/searchsales'), 'service console')

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_Service_Createcase/select service console'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down to select knowledge'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Contract_object/TC01_To verify user can able to create contract/CLick on the service contract from drop down'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Contract_object/TC02_To verify user can able to edit the contract from list view/Click on the search field'), 
    Keys.chord('Contract for detail page', Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Contract_object/TC04_To verify user can able to edit the contract/Verify contract present'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Contract_object/TC12_To verify user can able to create new contact from contract detail page/Click on new contact'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC21_Create_OpportunityFrom_ContactObject_Relatedtab/Click on salutation'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC21_Create_OpportunityFrom_ContactObject_Relatedtab/Select value of salutation'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC21_Create_OpportunityFrom_ContactObject_Relatedtab/Enter last name'), 
    'Mani')

WebUI.click(findTestObject('SF_Lightning/Service/Contract_object/TC12_To verify user can able to create new contact from contract detail page/click on save'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Service/Case_Object/Obj_CaseVerify/dropdown'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Contract_object/TC12_To verify user can able to create new contact from contract detail page/Click on contact object'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Service/Contract_object/TC12_To verify user can able to create new contact from contract detail page/verify contacts'), 
    3)

WebUI.closeBrowser()

