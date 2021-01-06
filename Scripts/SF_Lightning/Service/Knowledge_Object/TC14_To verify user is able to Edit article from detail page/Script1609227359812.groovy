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

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on New button'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in title'), 
    'Aricle to edit ')

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in URL'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC14_To verify user is able to Edit article from detail page/Click on Edit'))

WebUI.delay(3)

WebUI.setText(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Set text in title'), 
    ' Article test')

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on save'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/CLick on knowledge object'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Click on drop down of list view'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC01_To verify user is able to create a knowldge article/Select draft article'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Click on Refresh'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Service/Knowledge_Object/TC12_To verify user is able to Edit article from list view/Verify edit'), 
    4)

WebUI.closeBrowser()

