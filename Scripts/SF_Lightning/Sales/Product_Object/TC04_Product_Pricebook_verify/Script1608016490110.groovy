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

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.setText(findTestObject('SF_Lightning/Sales/Price_Object/Page_Home  Salesforce/input_Search apps and items..._input-69'), 
    'Sales')

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Price_Object/Page_Home  Salesforce/b_Sales'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Price_Object/Page_Test Price Book  Salesforce/span_Price Books'))

WebUI.click(findTestObject('SF_Lightning/Sales/Price_Object/Page_Recently Viewed  Price Books  Salesforce/Test_Price_Book'))

WebUI.click(findTestObject('SF_Lightning/Sales/Price_Object/Obj07_Price_AddProduct/related'))

WebUI.click(findTestObject('SF_Lightning/Sales/Price_Object/Obj07_Price_AddProduct/addproduct'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/prodsel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/related'))

WebUI.click(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/addtopricebook'))

WebUI.selectOptionByValue(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/selpricebook'), 
    '01s5g000001vUtbAAE', false)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/currency'), 
    'USD', false)

WebUI.click(findTestObject('SF_Lightning/Sales/Price_Object/Obj07_Price_AddProduct/next'))

WebUI.delay(5)

WebUI.setText(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/price'), '5500')

WebUI.click(findTestObject('SF_Lightning/Sales/Price_Object/Obj07_Price_AddProduct/save'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Product_Object/Obj_04_Product_Pricebook_verify/verify'), 0)

WebUI.delay(5)

WebUI.closeBrowser()

