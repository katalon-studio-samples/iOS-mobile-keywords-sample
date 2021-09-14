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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'The iOS apps is started from setupTestCase()'

//click Add button of the first menu
Mobile.tap(findTestObject('DragAndDropApps/Clear text/XCUIElementTypeStaticText - Add'), 0)

//input a text into Textbox
TestObject txtEmptyElem = findTestObject('DragAndDropApps/Clear text/XCUIElementTypeTextField')
String inputText = 'Katalon QA Team'
Mobile.callTestCase(findTestCase('_common/functionTC_setText'), [('object') : txtEmptyElem, ('text') : inputText])

//clear the input text
TestObject txtElem = findTestObject('DragAndDropApps/Clear text/XCUIElementTypeTextField - element after inputting text', [('dynamicText') : inputText])
Mobile.clearText(txtElem, 0)

//verify the txtElem with input text not exist anymore
Mobile.verifyElementNotExist(txtElem, 0)


