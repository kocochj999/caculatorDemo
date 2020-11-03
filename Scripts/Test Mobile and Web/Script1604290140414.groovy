import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

println("I'm inside app.")


Mobile.pressHome()

//Mobile.startExistingApplication(GlobalVariable.chrome)

WebUI.openBrowser("https://google.com.vn")