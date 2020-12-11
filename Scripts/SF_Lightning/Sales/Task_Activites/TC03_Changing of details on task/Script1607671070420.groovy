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

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'), 
    'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select sales'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the more option'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click Task object from drop down'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click on Edit comments'))

WebUI.delay(2)

WebUI.setText(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Add comments'), 'Task will be started')

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/CLick on save button of comments'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click on change date button'))

WebUI.delay(2)

WebUI.setText(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Set value todue date field'), 
    '12/11/2020')

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click on save button of due date'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click on the detailpage drop down'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click on change status'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click on status field from popup'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Select value of status field from pop up'))

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC03_Changing the details on task/Click save of status pop up'))

WebUI.delay(2)

WebUI.verifyTextPresent('Email', false)

WebUI.closeBrowser()

