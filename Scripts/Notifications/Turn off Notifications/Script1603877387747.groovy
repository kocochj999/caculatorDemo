import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement

Mobile.scrollToText('Notifications')

Mobile.tap(findTestObject('Common/Main Option', [('optionName') : 'Notifications']), 0)

Mobile.scrollToText('See all')

Mobile.tap(findTestObject('Notifications/See All'), 0)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Mobile.delay(3)

//CustomKeywords.'swipe.swipeDown'()

List<MobileElement> notifications = driver.findElementsById("android:id/switch_widget") 

for (MobileElement noti : notifications) {
	if(noti.getAttribute("checked") == "true")
	{
		noti.click();
    }
}

Mobile.pressBack()