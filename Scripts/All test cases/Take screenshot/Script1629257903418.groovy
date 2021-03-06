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

String uniqueString = UUID.randomUUID().toString().substring(0, 3)

'take screenshot by appium driver and put the screenshot to /Screenshots/Appiumdriver'
String expectedFilename = GlobalVariable.currentProjDir + '/Screenshots/Appiumdriver/driver' + uniqueString + '.png'
CustomKeywords.'webdriver.screenshot.TakeScreenshot.takeScreenshot'(expectedFilename, FailureHandling.STOP_ON_FAILURE)

'take screenshot by Katalon keyword and put the screenshot to /Screenshots/Katalon'
Mobile.takeScreenshot("Screenshots/Katalon/katalon" + uniqueString + ".png")

'Compare two images taken by appium driver and katalon keyword'
String actualFilename = GlobalVariable.currentProjDir + '/Screenshots/Katalon/katalon' + uniqueString + '.png'
CustomKeywords.'katalon.verifyImage.ImageComparison.areMatched'(expectedFilename,  actualFilename, FailureHandling.CONTINUE_ON_FAILURE)
