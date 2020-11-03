import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

public class Actions {
	@Keyword
	public void uncheckNoti(String id){
		AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		
		List<MobileElement> notifications = driver.findElementsById(id)
		
		for (MobileElement noti : notifications) {
			if(noti.getAttribute("checked") == "true")
			{
				noti.click();
			}
		}
		
	}
}
