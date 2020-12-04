import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
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

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual/search text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual/search text'), 'sales')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual/Select sales'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC01_Opportunity_add_manual/Select_Opportunities'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/Search box'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/Search box'), 'Mani')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/Click on the body of the list'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/Click on the drop down'))

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/click on the edit button from the drop down'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/Add Tracking number by editing existing opp'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/Add Tracking number by editing existing opp'), 
    '45645')

WebUI.click(findTestObject('SF_Lightning/Sales/Opportunity_Object/TC02_Opportunity_Edit_ListView/click on save button'))

WebUI.closeBrowser()

