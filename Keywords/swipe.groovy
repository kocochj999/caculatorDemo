import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

public class swipe {
	float xLeft = Mobile.getDeviceWidth() * 0.3;
	float xRight = Mobile.getDeviceWidth() * 0.7;

	float yUp = Mobile.getDeviceHeight() * 0.7;
	float yDown = Mobile.getDeviceHeight() * 0.3;

	float midX = Mobile.getDeviceWidth() * 0.5;
	float midY = Mobile.getDeviceHeight()() * 0.5;

	@Keyword
	void swipeLeft() {
		Mobile.swipe(xLeft, midX,xRight, midX)
	}
	@Keyword
	void swipeRight() {
		Mobile.swipe(xRight, midX, xLeft, midX)
	}
	@Keyword
	void swipeUp() {
		Mobile.swipe(midX, yDown, midX, yUp)
	}
	@Keyword
	void swipeDown() {
		Mobile.swipe(midX, yUp, midX, yDown)
	}
}
