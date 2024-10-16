import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*Navigate to the application login page
Login page is displayed with username and password fields
Enter valid username in the username field
Username is entered successfully
username: testuser
Enter valid password in the password field
Password is entered successfully
password: testpassword123
Click on the login button*/

// Navigate to the application login page
WebUI.navigateToUrl('http://www.example.com/login')

// Enter valid username in the username field
WebUI.setText(findTestObject('Page_Login/input_Username'), 'testuser')

// Enter valid password in the password field
WebUI.setText(findTestObject('Page_Login/input_Password'), 'testpassword123')

// Click on the login button
WebUI.click(findTestObject('Page_Login/button_Login'))