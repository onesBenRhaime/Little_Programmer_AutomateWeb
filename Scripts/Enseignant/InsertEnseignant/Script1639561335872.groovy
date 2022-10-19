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
import org.openqa.selenium.Rectangle as Rectangle
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

def slurper = new JsonSlurper()

File f = new File('C:\\data.json')
def InputJSON = new JsonSlurper().parseFile(f, 'utf-8')
//get the input JSON data
InputJSON.each({
		println(it)
	})

String urlP = InputJSON.data.professeurs.url

///******TEST Prof******///



//*****Email****//
int x = 0

String ch1 = 'FoulanFoulaniP'
String ch3 = '@gmail.com'
String s = String.valueOf(x)
ArrayList<String> cars = new ArrayList<String>()
while (cars.size() <= 100) {
	cars.add((ch1 + x) + ch3)
	x++
}

Random randomEmail = new Random()

int value = randomEmail.nextInt(100 + 0) + 0
//var
String emailT = cars.get(value)

//nom
String nameN =emailT.substring(6,emailT.indexOf("@"))
//
//prenom
String prenomP = "Foulan"/*emailT.substring(pos(6,emailT.indexOf("@")))*/

//Password

String alphabet = ((((('A'..'N') + ('P'..'Z')) + ('a'..'k')) + ('m'..'z')) + ('2'..'9')).join()
def length = 6

//var
String password = new Random().with({
		(1..length).collect({
				alphabet[nextInt(alphabet.length())]
			}).join()
	})

//Liste Adresse
String adr="Menzel Temime adresse "
int xA=0;
ArrayList<String> adrC = new ArrayList<String>();
while (adrC.size()<=100){
adrC.add(adr+xA);
	 xA++;
}
// var adress
Random randomAdrC= new Random();
int valueA = randomAdrC.nextInt(100 + 0) + 0;
String adress=adrC.get(valueA);



//Telephone
String numP = ('0'..'9').join()
  def lengthNum = 8
  String chN="2549"
  String chC="01"
  String l=1
  //var
  String tel = new Random().with{  l.collect { chN[ nextInt(chN.length() ) ] }.join() }  + new Random().with {  (1..lengthNum).collect { numP[ nextInt(numP.length() ) ] }.join() }
  String cin = new Random().with{  l.collect { chC[ nextInt(chC.length() ) ] }.join() }  + new Random().with {  (1..lengthNum).collect { numP[ nextInt(numP.length() ) ] }.join() }
  
  //CIN
 /* String numC = ('0'..'9').join()
	def lengthNumC = 7
	String chC="01"
	String l=1
	//var
	String cin = new Random().with{  1.collect { chC[ nextInt(chN.length() ) ] }.join() }  + new Random().with {  (1..lengthNumC).collect { numC[ nextInt(numP.length() ) ] }.join() }
  */

	
	//image
	
	
	//
	
/******************************Lancer the code************************************/
  

	WebUI.openBrowser(urlP)
	WebUI.delay(2)
	WebUI.maximizeWindow()
	WebUI.delay(3)
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\openProf1.png')
	WebUI.delay(3)

	
	/*********************************************************CREATE ACCOUANT************************************************************************/
	
	WebUI.executeJavaScript("alert('Le Automate est maintenant en train de ajouter un nouvel Professeur a la base de donnees')",null)
	WebUI.delay(2)

	WebUI.click( findTestObject('Object Repository/Enseignant/insertP/button_Create your                    account')	 )

	WebUI.delay(2)

	WebUI.setText( 	findTestObject('Object Repository/Enseignant/insertP/input_Cin_cinP') , cin)

	
	
	WebUI.delay(2)

	WebUI.setText( 	 findTestObject('Object Repository/Enseignant/insertP/input_Nom_nom'), nameN)

	
	
	WebUI.delay(2)

	WebUI.setText( 	 	findTestObject('Object Repository/Enseignant/insertP/input_Prenom_prenom'),  prenomP)

	
	
	WebUI.delay(2)

	WebUI.setText(    findTestObject('Object Repository/Enseignant/insertP/input_Email_email')   , emailT)

	WebUI.delay(2)


	
	WebUI.setText( findTestObject('Object Repository/Enseignant/insertP/input_Address_adr')  , adress)
	
		WebUI.delay(2)
		
		WebUI.setText(  findTestObject('Object Repository/Enseignant/insertP/input_Telephone_tel') , tel)
		
			WebUI.delay(2)
			WebUI.setText(findTestObject('Object Repository/Enseignant/insertP/input_Mot de Passe_psw')    , password)
			
				WebUI.delay(2)
	
   
	/*//'Upload test-photo.png to input_browse'
   WebUI.uploadFile(findTestObject('input_browse'), 'https://flutter.dev/docs/development/platform-integration/web$photoId.png')
	
			
			String getRandomPhoto() {
				int photoId = random.nextInt(21) + 1;
				return 'https://flutter.dev/docs/development/platform-integration/web$photoId.png';
			  }*/
	/*//'Upload test-photo.png to input_browse'
	WebUI.uploadFile(findTestObject('Object Repository/Enseignant/insertP/input_Image_img'), 'D:\\test-photo.png')*/

	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\screenshotInscritE.png')
	WebUI.delay(2)
	
	WebUI.click(  findTestObject('Object Repository/Enseignant/insertP/input_Annuler_Register')  )
	WebUI.click(findTestObject('Object Repository/Enseignant/insertP/button_Annuler')  )

	WebUI.delay(2)
	
	
	 /********************************Test Login With USer created *************************************************/
	
	WebUI.executeJavaScript("alert('Le Automates est maintenant en train de  accéder  interface admin ')",null)
	
    WebUI.setText(   findTestObject('Object Repository/Enseignant/AuthP/input_concat(Nom d, , utilisateur)_mail'), emailT)

    WebUI.setText( 	findTestObject('Object Repository/Enseignant/AuthP/input_Mot de passe_password')  , password)
	
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\screenshotLoginE.png')
	WebUI.delay(3)

    WebUI.click( findTestObject('Object Repository/Enseignant/AuthP/input_Mot de passe_login') )
	
	WebUI.delay(3)
	

	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\etudiant.png')
	WebUI.delay(3)