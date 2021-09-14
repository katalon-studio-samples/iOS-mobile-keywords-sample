
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.model.FailureHandling

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize


/**
	 * Verify two images are matched or not
	 * @param expectedImgPath the location of expected image
	 * @param actualImgPath the location of actual image
	 * @return
	 */
def static "katalon.verifyImage.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new katalon.verifyImage.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}


def static "katalon.verifyImage.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new katalon.verifyImage.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "katalon.common.StartApps.startMobileApps"() {
    (new katalon.common.StartApps()).startMobileApps()
}

/**
	 * Verify two images are matched or not
	 * @param expectedImgPath the location of expected image
	 * @param actualImgPath the location of actual image
	 * @return
	 */
def static "webdriver.screenshot.TakeScreenshot.takeScreenshot"(
    	String expectedFilename	
     , 	FailureHandling flowControl	) {
    (new webdriver.screenshot.TakeScreenshot()).takeScreenshot(
        	expectedFilename
         , 	flowControl)
}


def static "webdriver.screenshot.TakeScreenshot.takeScreenshot"(
    	String expectedFilename	) {
    (new webdriver.screenshot.TakeScreenshot()).takeScreenshot(
        	expectedFilename)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}
