import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Calculation {



	@Keyword
	int calculate(String first,String second, String math ) {
		println(first)
		int firstNum = Integer.parseInt(first)
		int secondNum = Integer.parseInt(second)
		if(math.equalsIgnoreCase('add')) {
			return firstNum + secondNum;
		}
		else if(math.equalsIgnoreCase('sub')) {
			return firstNum - secondNum;
		}
		else if(math.equalsIgnoreCase('mul')) {
			return firstNum * secondNum;
		}
		else if(math.equalsIgnoreCase('div')) {
			return firstNum / secondNum;
		}
		return null;
	}
}
