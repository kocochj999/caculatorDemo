import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.chrome)
Mobile.tap(findTestObject('Object Repository/Web/Searchbox'), 0)
Mobile.sendKeys(findTestObject('Object Repository/Web/Searchbox'), "online calculator")
Mobile.sendKeys(findTestObject('Object Repository/Web/Searchbox'), Keys.ENTER)
Mobile.scrollToText('Calculator.net: Free Online Calculators - Math, Fitness ...')
Mobile.tap(findTestObject('Object Repository/Web/LinkToWeb',[('webName'):'Calculator.net: Free Online Calculators - Math, Fitness ...']), 0)
CustomKeywords.'swipe.swipeDown'()
CustomKeywords.'swipe.swipeUp'()
Mobile.tap(findTestObject('Object Repository/Web/Keypad',[('value'):'5']), 0)
Mobile.tap(findTestObject('Object Repository/Web/Keypad',[('value'):'×']), 0)
Mobile.tap(findTestObject('Object Repository/Web/Keypad',[('value'):'4']), 0)
Mobile.tap(findTestObject('Object Repository/Web/Keypad',[('value'):'=']), 0)
Mobile.verifyMatch(Mobile.getText(findTestObject('Object Repository/Web/Result'), 0), '20', false)
Mobile.closeApplication()
