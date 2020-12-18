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

WebUI.setText(findTestObject('SF_Lightning/Sales/Product_Object/Obj01_Product_CaseCreation/sel sales'), 'Sales')

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Price_Object/Page_Home  Salesforce/b_Sales'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/Obj01_Product_CaseCreation/products'))

WebUI.check(findTestObject('SF_Lightning/Sales/Product_Object/Obj05_Product_EditListView/select'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Product_Object/Obj05_Product_EditListView/dropdown'))

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/Obj08_Product_Delete_ListView/delete'))

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/Obj08_Product_Delete_ListView/confirmdel'))

WebUI.delay(10)

WebUI.verifyElementNotPresent(findTestObject('SF_Lightning/Sales/Product_Object/Obj08_Product_Delete_ListView/verify'), 
    5)

WebUI.closeBrowser()

