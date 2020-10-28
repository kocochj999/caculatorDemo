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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.scrollToText('General Management')
Mobile.tap(findTestObject('Common/Main Option', [('optionName'):'General management']), 0)
Mobile.tap(findTestObject('Common/Main Option', [('optionName'):'Language and input']), 0)

Mobile.waitForElementPresent(findTestObject('Common/Main Option', [('optionName'):'Language']), 3)
Mobile.tap(findTestObject('Common/Main Option', [('optionName'):'Language']), 0)

TestObject fromObject = findTestObject('General Management/Language and input/Language/Language', [('language'):'Viet'])

TestObject toObject = findTestObject('General Management/Language and input/Language/Language', [('language'):'English'])


Mobile.dragAndDrop(fromObject, toObject, 3)