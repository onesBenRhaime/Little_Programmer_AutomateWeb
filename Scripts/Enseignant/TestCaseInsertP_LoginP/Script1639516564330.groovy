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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

def slurper = new JsonSlurper()

File f = new File('C:\\data.json')

def InputJSON = new JsonSlurper().parseFile(f, 'utf-8')

//get the input JSON data
InputJSON.each({ 
        println(it)
    })

int x = 0

String ch1 = 'nahla'

String ch2

String ch3 = '@gmail.com'

String s = String.valueOf(x)

ArrayList<String> cars = new ArrayList<String>()

while (cars.size() <= 100) {
    cars.add((ch1 + x) + ch3)

    x++
}

//*********//
Random randomEmail = new Random()

int value = randomEmail.nextInt(100 + 0) + 0

String emailT = cars.get(value)

//*********** insert , login , logout********//
String alphabet = ((((('A'..'N') + ('P'..'Z')) + ('a'..'k')) + ('m'..'z')) + ('2'..'9')).join()

def length = 6

String full_name = emailT.substring(0, emailT.indexOf('@'))

String password = new Random().with({ 
        (1..length).collect({ 
                alphabet[nextInt(alphabet.length())]
            }).join()
    })
String url = "file:///C:/Users/BAZINFO/Desktop/StageCloudMaster/BlocklyTestProjet/docs/demo/login/loginProf.html"

/*String url = InputJSON.data.professeurs.url*/

//if key "email" has value null in your JSON
String getSelectedKey = InputJSON.data.professeurs.emailT

if (getSelectedKey == null) {
   WebUI.openBrowser(url)
    WebUI.delay(2)


	 WebUI.click(  findTestObject('Object Repository/testFin/Page_Little Programmeur/button_Create your                    account')  )
	 WebUI.delay(2)
	 WebUI.setText(   findTestObject('Object Repository/testFin/Page_Little Programmeur/input_Nom et Prenom_full_name'),full_name)
	 WebUI.delay(2)
	 WebUI.setText(  findTestObject('Object Repository/testFin/Page_Little Programmeur/input_Entrez votre Email_email'), emailT)
	 WebUI.delay(2)
	 WebUI.setText(   findTestObject('Object Repository/Professeur_OR/InsertP/input_Mot de Passe_password') , password)
	 WebUI.delay(2)
	 WebUI.click(   findTestObject('Object Repository/testFin/Page_Little Programmeur/button_Register')  )

	  
	  WebUI.delay(3)
	 
	  WebUI.click( findTestObject('Object Repository/testFin/Page_Little Programmeur/button_Annuler')  )
	  
	  WebUI.delay(2)
	  
	
	    //Test Login With USer inserted
	  
	  
	  
	  WebUI.setText(findTestObject('Object Repository/Professeur_OR/LoginP/input_concat(Nom d, , utilisateur)_Pemail') , emailT)
	  
	  WebUI.setText(findTestObject('Object Repository/Professeur_OR/LoginP/input_Mot de passe_Ppassword'), password)
	  
	  WebUI.click( findTestObject('Object Repository/Professeur_OR/LoginP/button_LOGIN')  )
	
  
}

