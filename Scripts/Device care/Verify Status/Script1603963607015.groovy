import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.scrollToText('Device care')

Mobile.tap(findTestObject('Common/Main Option', [('optionName'):'Device care']), 0)

String battery = Mobile.getText(findTestObject('Device care/Status Info',[('optionName'):'battery']), 0)

String storage = Mobile.getText(findTestObject('Device care/Status Info',[('optionName'):'storage']), 0)

String ram = Mobile.getText(findTestObject('Device care/Status Info',[('optionName'):'ram']), 0)

String security = Mobile.getText(findTestObject('Device care/Status Info',[('optionName'):'security']), 0)

Mobile.verifyMatch(battery, "Charging", false)

Mobile.verifyMatch(storage, "47 GB free", false)

Mobile.verifyMatch(ram, "1.7 GB free", false)

Mobile.verifyMatch(security, "Deactivated", false)