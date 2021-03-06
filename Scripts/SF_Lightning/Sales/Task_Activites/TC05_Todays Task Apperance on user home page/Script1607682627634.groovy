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

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search text'), 
    'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select sales'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the more option'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click Task object from drop down'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the drop down to create Task'))

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Select New Task from drop down'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the status field'))

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Select value from status field'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on the subject field'), 
    Keys.chord('Call', Keys.ENTER))

WebUI.setText(findTestObject('SF_Lightning/Sales/Task_Activites/TC05_Todays Task Apperance on user home page/Set value for due date'), 
    '12/11/2020')

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/click on priority'))

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Select value from priority'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Task_Activites/TC01_Creation of Task based on different subject/Click on save button'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Task_Activites/TC05_Todays Task Apperance on user home page/Click on home object'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Task_Activites/TC05_Todays Task Apperance on user home page/Verify the todays task'), 
    5)

WebUI.closeBrowser()

