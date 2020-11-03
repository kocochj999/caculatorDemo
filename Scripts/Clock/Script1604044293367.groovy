import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable as GlobalVariable



/*Mobile.tap(findTestObject('Clock/MiniOption', [('optionName'):'World Clock']), 0)

String city = "London"
String temp = Mobile.getText(findTestObject('Clock/Temperature', [('cityName'):city]), 0)
println("In "+ city +", temperature is: " + temp +" oC.")*/

Mobile.waitForElementPresent(findTestObject('Clock/MiniOption', [('optionName'):'Stopwatch']), 5)
Mobile.tap(findTestObject('Clock/MiniOption', [('optionName'):'Stopwatch']), 3)

TestObject start = findTestObject('Clock/StopwatchButton', [('buttonName'):'start'])
Mobile.tap(start, 3)

Mobile.delay(5)

TestObject lap = findTestObject('Clock/StopwatchButton', [('buttonName'):'lap'])
Mobile.tap(lap, 3)

Mobile.delay(5)

TestObject stop = findTestObject('Clock/StopwatchButton', [('buttonName'):'stop'])
Mobile.tap(stop, 3)

Mobile.delay(5)

TestObject resume = findTestObject('Clock/StopwatchButton', [('buttonName'):'resume'])
Mobile.tap(resume, 3)

Mobile.delay(5)

Mobile.tap(stop, 3)

Mobile.delay(5)

TestObject reset = findTestObject('Clock/StopwatchButton', [('buttonName'):'reset'])
Mobile.tap(reset, 3)

