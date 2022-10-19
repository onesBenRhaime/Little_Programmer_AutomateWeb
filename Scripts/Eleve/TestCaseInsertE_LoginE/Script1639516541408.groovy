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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable


def slurper = new JsonSlurper()
File f = new File('C:\\data.json')
def InputJSON = new JsonSlurper().parseFile(f, 'utf-8')
//get the input JSON data
InputJSON.each({
		println(it)
	})
String url = InputJSON.data.users.url
	
int x=0;
       String ch1="ones";
       String ch3="@gmail.com";
	   String s= String.valueOf(x);
    ArrayList<String> cars = new ArrayList<String>();
      while (cars.size()<=100){
       cars.add(ch1+x+ch3);
             x++;   
        }
    
//*********//
Random randomEmail = new Random();
int value = randomEmail.nextInt(100 + 0) + 0;
		
String emailT = cars.get(value)			
//*********** insert , login , logout********//
		String alphabet = (('A'..'N')+('P'..'Z')+('a'..'k')+('m'..'z')+('2'..'9')).join()
		def length = 6		
String full_name =emailT.substring(0,emailT.indexOf("@"))
 String password =  new Random().with {  (1..length).collect { alphabet[ nextInt( alphabet.length() ) ] }.join() }
 //if key "email" has value null in your JSON
String getSelectedKey = InputJSON.data.users.emailT

if(getSelectedKey == null) {
     WebUI.openBrowser(url)
     WebUI.delay(2)
     WebUI.click(findTestObject('Object Repository/Etudiant_OR/InsertE/button_Create your                    account'))
	 WebUI.delay(2)
	 WebUI.setText(findTestObject('Object Repository/Etudiant_OR/InsertE/input_Nom_full_name'),full_name)
	 WebUI.delay(2)
	 WebUI.setText(findTestObject('Object Repository/Etudiant_OR/InsertE/input_Email_email'), emailT)
	 WebUI.delay(2)
	 WebUI.setText(findTestObject('Object Repository/Etudiant_OR/InsertE/input_Mot de Passe_password'), password)
	 WebUI.delay(2)
	 WebUI.click( findTestObject('Object Repository/Etudiant_OR/InsertE/button_Register')  )
     WebUI.delay(2)
	 WebUI.click(  findTestObject('Object Repository/Etudiant_OR/InsertE/button_Annuler')  )
	  
	  //Test Login With USer inserted
	  WebUI.setText(findTestObject('Etudiant_OR/LoginE/input__Aemail'), emailT)
	  
	  WebUI.setText(findTestObject('Etudiant_OR/LoginE/input__Apassword'), password)
	  
	  WebUI.click(    findTestObject('Object Repository/Etudiant_OR/LoginE/button_')  )   
}



