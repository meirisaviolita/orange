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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.scrollToElement(findTestObject('Appointmentt/h1_CURA Healthcare Service'), 0)

WebUI.click(findTestObject('Appointmentt/h3_We Care About Your Health'))

WebUI.click(findTestObject('Appointmentt/a_Make Appointment'))

WebUI.setText(findTestObject('Appointmentt/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Appointmentt/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Appointmentt/button_Login'))

WebUI.click(findTestObject('Object Repository/Appointmentt/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'))

WebUI.sendKeys(findTestObject('Object Repository/Appointmentt/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 'Hongkong CURA Healthcare Center')

WebUI.click(findTestObject('Object Repository/Appointmentt/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'))

WebUI.sendKeys(findTestObject('Object Repository/Appointmentt/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 'Tokyo CURA Healthcare Center')

WebUI.click(findTestObject('Object Repository/Appointmentt/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'))

WebUI.sendKeys(findTestObject('Object Repository/Appointmentt/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 'Seoul CURA Healthcare Cente')

WebUI.click(findTestObject('Appointmentt/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Appointmentt/label_Medicare'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Appointmentt/input_Visit Date (Required)_visit_date'))

String Tanggal = '28'

WebUI.click(findTestObject('Object Repository/Appointmentt/td_28', [('Tanggal') : Tanggal]))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Appointmentt/textarea_Comment_comment'), 'comment')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Appointmentt/button_Book Appointment'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Appointmentt/h2_Appointment Confirmation'))

