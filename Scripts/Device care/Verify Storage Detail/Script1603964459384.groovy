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

Mobile.scrollToText('Device care')

Mobile.tap(findTestObject('Common/Main Option', [('optionName'):'Device care']), 0)

Mobile.tap(findTestObject('Device care/Status Option', [('optionName'):'storage']), 0)

String doc = Mobile.getText(findTestObject('Device care/Storage Memory', [('dataType'):'doc']), 0)

String img = Mobile.getText(findTestObject('Device care/Storage Memory', [('dataType'):'img']), 0)

String video = Mobile.getText(findTestObject('Device care/Storage Memory', [('dataType'):'video']), 0)

String audio = Mobile.getText(findTestObject('Device care/Storage Memory', [('dataType'):'audio']), 0)

String applications = Mobile.getText(findTestObject('Device care/Storage Memory', [('dataType'):'applications']), 0)

Mobile.verifyMatch(doc, "0 MB", false)

Mobile.verifyMatch(img, "22.4 MB", false)

Mobile.verifyMatch(video, "730 MB", false)

Mobile.verifyMatch(audio, "216 MB", false)

Mobile.verifyMatch(applications, "1.5 GB", false)