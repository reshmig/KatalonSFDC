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

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down to select knowledge'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/CLick on knowledge object'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down of list view'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC05_To verify user have access to different list views of Knowledge object/CLick on Recent viewed'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/click close'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on New button'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in title'), 
    'Change Owner')

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in URL'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/CLick on knowledge object'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down of list view'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Select draft article'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/Click on the check box'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/Click on assign button'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/Click on contact field'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/Select the contact'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/Click on save'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Service/Knowledge_Object/TC04_To verify user is able to assign the knowledge article to another user/Verify owner'), 
    3)

WebUI.closeBrowser()

