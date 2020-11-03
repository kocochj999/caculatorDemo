import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject as TestObject

import io.appium.java_client.MobileBy as MobileBy
import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.touch.offset.PointOption

Mobile.scrollToText('General Management')

CustomKeywords.'gesture.tap'(findTestObject('Common/Main Option', [('optionName') : 'General management']))

CustomKeywords.'gesture.tap'(findTestObject('Common/Main Option', [('optionName') : 'Language and input']))

CustomKeywords.'gesture.tap'(findTestObject('Common/Main Option', [('optionName') : 'Language']))

TestObject source = findTestObject('General Management/Language and input/Language/Language', [('language') : 'Viet'])

TestObject target = findTestObject('General Management/Language and input/Language/Language', [('language') : 'English'])

CustomKeywords.'gesture.dragAndDrop'(source, target)

Mobile.delay(3)
