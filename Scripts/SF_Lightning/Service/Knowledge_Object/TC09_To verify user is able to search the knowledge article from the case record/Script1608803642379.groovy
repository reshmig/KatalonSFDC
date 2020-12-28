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

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/CLick on knowledge object'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on New button'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in title'), 
    'LKS')

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in URL'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on save'))

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC09_To verify user is able to search the knowledge article from the case record/Click on publish'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC02_To verify that the user is able to publish a Knowledge article/click publish from pop up'))

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down to select knowledge'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC07_To verify user is able to attach article to a case/select case from drop down'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC07_To verify user is able to attach article to a case/Click on list drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC07_To verify user is able to attach article to a case/Click on All open cases'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Knowledge_Object/TC07_To verify user is able to attach article to a case/Click on saerch field'), 
    Keys.chord('Knowledge', Keys.ENTER))

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC07_To verify user is able to attach article to a case/Click on case name'))

WebUI.delay(4)

WebUI.sendKeys(findTestObject('SF_Lightning/Service/Knowledge_Object/TC09_To verify user is able to search the knowledge article from the case record/Click on the search knowledge field'), 
    Keys.chord('LKS', Keys.ENTER))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Service/Knowledge_Object/TC09_To verify user is able to search the knowledge article from the case record/Verify knowledge present'), 
    5)

WebUI.closeBrowser()

