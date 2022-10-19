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

String urlE = "file:///C:/Users/BAZINFO/Desktop/StageCloudMaster/BlocklyTestProjet/docs/demo/login/login.html"
String urlP = "file:///C:/Users/BAZINFO/Desktop/StageCloudMaster/BlocklyTestProjet/docs/demo/login/loginProf.html"

///******TEST ETUDIANT******///
        //*****Email****//
int x = 0

String ch1 = 'FoulanFoulaniE'
String ch3 = '@gmail.com'
String s = String.valueOf(x)
ArrayList<String> cars = new ArrayList<String>()
while (cars.size() <= 100) {
    cars.add((ch1 + x) + ch3)
    x++
}

     //*****Password****//
Random randomEmail = new Random()

int value = randomEmail.nextInt(100 + 0) + 0

String emailT = cars.get(value)

//*********** insert , login , logout********//
String alphabet = ((((('A'..'N') + ('P'..'Z')) + ('a'..'k')) + ('m'..'z')) + ('2'..'9')).join()
def length = 6
String name = emailT.substring(0, emailT.indexOf('@'))
String password = new Random().with({ 
        (1..length).collect({ 
                alphabet[nextInt(alphabet.length())]
            }).join()
    })

////************TEST PROFESSEUR*************//
//List Mail
int xp=0;
String ch1P="FoulanFoulaniP";
String ch3P="@gmail.com";
String sP= String.valueOf(x);
ArrayList<String> emailsP = new ArrayList<String>();
while (emailsP.size()<=100){
emailsP.add(ch1P+xp+ch3P);
	 xp++;
}

//Liste Adresse
String adr="Menzel Temime adresse "
int xA=0;
ArrayList<String> adrC = new ArrayList<String>();
while (adrC.size()<=100){
adrC.add(adr+xA);
	 xA++;
}



//email
Random randomEmailP = new Random();
int valueP = randomEmailP.nextInt(100 + 0) + 0;
String emailTP = emailsP.get(valueP);
//
//Password
String passwordP =  new Random().with {  (1..lengthP).collect { alphabet[ nextInt( alphabetP.length() ) ] }.join() }

//
	
String alphabetP = (('A'..'N')+('P'..'Z')+('a'..'k')+('m'..'z')+('2'..'9')).join()
def lengthP = 6
//Telephone
String numP = ('0'..'9').join()
  def lengthNum = 7
  String chN="2549"
  String l=1
  String tel = new Random().with{  1.collect { chN[ nextInt(chN.length() ) ] }.join() }  + new Random().with {  (1..lengthNum).collect { numP[ nextInt(numP.length() ) ] }.join() }
//
  
  //CIN
  String numC = ('0'..'9').join()
	def lengthNumC = 7
	String chC="01"
	String l=1
	String cin = new Random().with{  1.collect { chC[ nextInt(chN.length() ) ] }.join() }  + new Random().with {  (1..lengthNumC).collect { numC[ nextInt(numP.length() ) ] }.join() }
  //
  
	//nom
	String nameN =emailTP.substring(5,emailTP.indexOf("@"))
	//
  //prenom
	String perenomP =emailTP.substring(pos(6,emailTP.indexOf("@")))	
  //
	//adress
		Random randomAdrC= new Random();
		int valueA = randomAdrC.nextInt(100 + 0) + 0;
		String adress=adrC.get(valueA);
   //
	

	
	//image
	
	
	//
	
/******************************************************************/
  
/* String full_nameP =emailTP.substring(0,emailTP.indexOf("@"))
String passwordP =  new Random().with {  (1..lengthP).collect { alphabet[ nextInt( alphabetP.length() ) ] }.join() }
String emailTP = emailsP.get(valueP)*/


//Lancer the code

//if key "email" has value null in your JSON
String getSelectedKeyE = InputJSON.data.users.emailT
String getSelectedKeyP = InputJSON.data.professeurs.emailTP
if (getSelectedKeyE == null && getSelectedKeyP == null  ) {
    WebUI.openBrowser(urlE)
	WebUI.delay(4)
	WebUI.maximizeWindow()
    WebUI.delay(4)
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\open1.png')
	WebUI.delay(3)
    /*********************************************************CREATE ACCOUANT************************************************************************/
	
	WebUI.executeJavaScript("alert('Le Automate est maintenant en train de ajouter un nouvel utilisateur ala base de donnees')",null)
	WebUI.delay(2)

	WebUI.click( 	findTestObject('Object Repository/Eleve/insertE/button_Create your                    account')  )

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Eleve/insertE/input_Nom_nom'), nameN)

	
	WebUI.delay(2)

    WebUI.setText(  findTestObject('Object Repository/Eleve/insertE/input_Email_email')  , emailTP)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Etudiant_OR/InsertE/input_Mot de Passe_password'), password)

    WebUI.delay(2)

	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\screenshotInscritE.png')
	WebUI.delay(2)
	
    WebUI.click(findTestObject('Object Repository/Etudiant_OR/InsertE/button_Register'))

    WebUI.click(findTestObject('Object Repository/Etudiant_OR/InsertE/button_Annuler'))

    WebUI.delay(2)
    /********************************Test Login With USer created *************************************************/
	
	WebUI.executeJavaScript("alert('Le Automates est maintenant en train de  accéder  au cours avec le nouvel utilisateur cree ')",null)
	
    WebUI.setText(findTestObject('Etudiant_OR/LoginE/input__Aemail'), emailT)

    WebUI.setText(findTestObject('Etudiant_OR/LoginE/input__Apassword'), password)
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\screenshotLoginE.png')
	WebUI.delay(3)

    WebUI.click(findTestObject('Etudiant_OR/LoginE/button_'))
	
	WebUI.delay(3)

	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\etudiant.png')
	WebUI.delay(3)
	
	/************cours*********************/
	WebUI.click(findTestObject('Object Repository/cours_OR/circle__1')  )
	WebUI.delay(3)
	WebUI.click(   findTestObject('Object Repository/cours_OR/button_4')      )
	WebUI.delay(3)
	
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\coure1.png')
	
	WebUI.delay(3)

	WebUI.back()
	
	WebUI.click(     findTestObject('Object Repository/cours_OR/circle__2'))
	
	WebUI.delay(3)
	WebUI.click(   findTestObject('Object Repository/cours_OR/button_7')     )
	WebUI.delay(3)
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\coure2.png')
	
	WebUI.delay(3)
	WebUI.back()
	
	WebUI.click(  findTestObject('Object Repository/cours_OR/circle_0                             99_3')   )
	WebUI.delay(3)
	WebUI.click(   findTestObject('Object Repository/cours_OR/button_10')     )
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\coure3.png')
	
	WebUI.delay(3)
	WebUI.back()
    /********************************Logout *************************************************/
    WebUI.click(   findTestObject('Object Repository/Etudiant_OR/LoginE/Page_/a_Logout') )

    WebUI.verifyAlertPresent(2)

    WebUI.delay(2)

    WebUI.acceptAlert() 
	WebUI.delay(3)
	
	/******************************** Professeur *************************************************/


	WebUI.navigateToUrl("file:///C:/Users/BAZINFO/Desktop/Stage_Cloud_M/blocklyTest/docs/demo/login/loginProf.html")
  
	WebUI.delay(2)
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\open2.png')
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Professeur_OR/InsertP/button_Create your                    account'))
	WebUI.delay(2)
	WebUI.setText(  findTestObject('Object Repository/Professeur_OR/InsertP/input_Nom_full_name')   ,full_nameP)
	WebUI.delay(2)
	
	WebUI.setText( findTestObject('Object Repository/Professeur_OR/InsertP/input_Entrez Votre Tel_tel')  , tel)
	WebUI.delay(2)
	WebUI.setText(  findTestObject('Object Repository/Professeur_OR/InsertP/input_Email_email')  , emailTP)
	WebUI.delay(2)
	WebUI.setText(   findTestObject('Object Repository/Professeur_OR/InsertP/input_Mot de Passe_password') , passwordP)
	WebUI.delay(3)
	
	WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\screenshotInscritProf.png')
	WebUI.delay(3)
	WebUI.click(       findTestObject('Object Repository/Professeur_OR/InsertP/button_Register')  )

	WebUI.delay(2)
	

	 

	  
	 WebUI.click(findTestObject('Object Repository/Professeur_OR/InsertP/button_Annuler')  )
	 
	 WebUI.delay(2)
	 
   
	   //Test Login With USer inserted
	 
	 
	 
	 WebUI.setText(findTestObject('Object Repository/Professeur_OR/LoginP/input_concat(Nom d, , utilisateur)_Pemail') , emailTP)
	 
	 WebUI.setText(findTestObject('Object Repository/Professeur_OR/LoginP/input_Mot de passe_Ppassword'), passwordP)
	 
	 WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\LoginProf.png')
	 WebUI.delay(3)
	 
	 WebUI.click( findTestObject('Object Repository/Professeur_OR/LoginP/button_LOGIN')  )
	 
	   
	
	 /********************************Logout *************************************************/
	 WebUI.takeScreenshot('C:\\Users\\BAZINFO\\Katalon Studio\\Little_ProgrammerTest\\imagesAutomate\\prof.png')
	 WebUI.delay(3)
	  WebUI.click(findTestObject('Object Repository/Professeur_OR/LoginP/a_Dconnexion')  )
 
	 WebUI.verifyAlertPresent(2)
 
	 WebUI.delay(3)
 
	 WebUI.acceptAlert()
	 WebUI.delay(3)
	 
	
	WebUI.closeBrowser()
}

