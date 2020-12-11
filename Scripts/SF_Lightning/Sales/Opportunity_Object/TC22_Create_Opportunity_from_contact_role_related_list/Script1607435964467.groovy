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

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/Select_Opportunities'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual_home page/search bar in opp list view'), 
    Keys.chord('Blue Star', Keys.ENTER))

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC06_Clone_Opportunity/select the 1st record from the list view'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/contact object scroll'), 
    2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the contact role dropdown'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the Add contact role from drop down'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the search field'))

WebUI.sendKeys(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the search field'), 
    Keys.chord('Mani', Keys.ENTER))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the check box of Add contact role screen'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the Next button'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Click on the save button on Add contact role screen'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC22_Create_Opportunity_from_contactrolerelatedlist/Verify contact role'), 
    3)

WebUI.closeBrowser()

