import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject

import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption

public class gesture {
	@Keyword
	void dragAndDrop(TestObject source, TestObject target){
		def driver = MobileDriverFactory.getDriver()
		int sourceX = Mobile.getElementLeftPosition(source, 0)
		int sourceY = Mobile.getElementTopPosition(source, 0)
		
		int tartgetX = Mobile.getElementLeftPosition(target, 0)
		int targetY = Mobile.getElementTopPosition(target, 0) - 20
		
		TouchAction action = new TouchAction(driver)
		PointOption po = new PointOption()
		action.longPress(po.point(sourceX, sourceY)).moveTo(po.point(tartgetX,targetY)).release().perform()
	}
	@Keyword
	void tap(TestObject to){
		Mobile.waitForElementPresent(to, 0)
		Mobile.tap(to, 0)
	}
}
