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
    'Article test')

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in URL'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/CLick on knowledge object'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down of list view'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Select draft article'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Click on Refresh'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Select the 1 st record drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on the publish button'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on publish pop up'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down of list view'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC02_To verify that the user is able to publish a Knowledge article/Click on published articles from drop down'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Click on Refresh'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Select the 1 st record drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on Archive'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on Archive pop up'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down of list view'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC05_To verify user have access to different list views of Knowledge object/Click on Archived Articles'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Click on Refresh'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Select the 1 st record drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on restore'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on restore popup'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC16_To verify user can able to restore the article/Click on Version'))

WebUI.delay(3)

WebUI.verifyTextPresent('Draft', false)

WebUI.closeBrowser()

