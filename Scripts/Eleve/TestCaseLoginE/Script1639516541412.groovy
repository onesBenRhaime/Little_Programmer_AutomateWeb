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


String url = "http://127.0.0.1/plateformeEducative/projet/docs/demo/login/login.php"

String email = "hakim@gmail.com"
String password = "123456"
// 'Open browser and navigate to elated site'
WebUI.openBrowser(url)
//'Maximize current browser window'
WebUI.maximizeWindow()
WebUI.delay(3)
//'Enter email && password'
WebUI.setText( findTestObject('Object Repository/Eleve/AuthE/input__mail')  , email)
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Eleve/AuthE/input__password'), password)

WebUI.delay(3)
WebUI.click(  findTestObject('Object Repository/Eleve/AuthE/input__login'))
WebUI.delay(5)

WebUI.click(   findTestObject('Object Repository/Eleve/AuthE/button_OK') )
WebUI.delay(5)

// 'close browser'
WebUI.closeBrowser()
