import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement

Mobile.scrollToText('Notifications')

CustomKeywords.'gesture.tap'(findTestObject('Common/Main Option', [('optionName') : 'Notifications']))

Mobile.scrollToText('See all')

CustomKeywords.'gesture.tap'(findTestObject('Notifications/See All'))

CustomKeywords.'Actions.uncheckNoti'('android:id/switch_widget')

Mobile.pressBack()