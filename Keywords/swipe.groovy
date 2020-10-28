import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

public class swipe {
	
	int xLeft = Mobile.getDeviceWidth() * 0.3;
	int xRight = Mobile.getDeviceWidth() * 0.7;

	int yUp = Mobile.getDeviceHeight() * 0.7;
	int yDown = Mobile.getDeviceHeight() * 0.3;

	int midX = Mobile.getDeviceWidth() * 0.5;
	int midY = Mobile.getDeviceHeight() * 0.5;
	@Keyword
	public void swipeLeft() {
		
		Mobile.swipe(xLeft, midX,xRight, midX)
	}
	@Keyword
	public void swipeRight() {
		
		Mobile.swipe(xRight, midX, xLeft, midX)
	}
	@Keyword
	public void swipeUp() {
		
		Mobile.swipe(midX, yDown, midX, yUp)
	}
	@Keyword
	public void swipeDown() {
		
		Mobile.swipe(midX, yUp, midX, yDown)
	}
}
