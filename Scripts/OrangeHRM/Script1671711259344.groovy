import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com')

//WebUI.maximizeWindow()

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), '')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), '')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.delay(1)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), '')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.delay(1)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), '')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.delay(2)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.delay(1)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admii')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.delay(1)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.click(findTestObject('OrangeHRM/a_Admin'))

WebUI.click(findTestObject('OrangeHRM/button_Add'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/OrangeHRM/user role'))

WebUI.click(findTestObject('OrangeHRM/span_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.click(findTestObject('OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('OrangeHRM/span_Enabled'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('input'), 'Odis  Adalwin')

WebUI.delay(6)

WebUI.click(findTestObject('span_Odis  Adalwin'))

WebUI.setText(findTestObject('OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'admin116', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OrangeHRM/input_Password_oxd-input oxd-input--focus'), 'P@ssw0rd')

WebUI.setText(findTestObject('OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 'P@ssw0rd')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Saveafterconfirm password'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/OrangeHRM/username search'), 'admin116')

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Search'))

WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM/div_UsernameAscendingDecendingUser RoleAscendingDecendingEmployee NameAscendingDecendingStatusAscendingDecendingActionsadmin1AdminShazia CollingsEnabled'), 
    1)

WebUI.click(findTestObject('Object Repository/OrangeHRM/div_admin53AdminOdis AdalwinEnabled'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Enabled_oxd-icon-button oxd-table-cell-action-space'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OrangeHRM/a_My Info'))

WebUI.delay(6)

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/input_driverslicensenum'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/input_driverslicensenum'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/input_driverslicensenum'), '5678')

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/OrangeHRM/input_ Date'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Saveafterdate'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.HOME))

WebUI.click(findTestObject('Object Repository/OrangeHRM/a_Contact Details'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/country'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/aftercountry_Afghanistan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHRM/buttonSaveafterafganistan'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Addaftersaveafganistan'))

//String Project = RunConfiguration.getProjectDir().replace("/","\\")
WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM/p_OrangeHRM OS 5.2'), 1)

//WebUI.uploadFile(findTestObject('Object Repository/OrangeHRM/div_Browse'),'C://Users//hrd//Katalon Studio//contoh//Data Files//1545111808_contoh-pdf.pdf')
//String ttd = RunConfiguration.getProjectDir()
//WebUI.uploadFile(findTestObject('Object Repository/OrangeHRM/browsss'),
//	ttd + '\\Data Files\\1545111808_contoh-pdf.pdf')
//String filePatch = RunConfiguration.getProjectDir() + '\\Data Files\\1545111808_contoh-pdf.pdf'
//Path absolutePath = Paths.get(filePatch)
//String absolutePathStr = absolutePath.toString()
//WebUI.uploadFile(findTestObject('OrangeHRM/div_No file'), absolutePathStr)
WebUI.click(findTestObject('Object Repository/OrangeHRM/test_open_file'))

WebUI.uploadFile(findTestObject('Object Repository/OrangeHRM/test_open_file'), 'Object Repository/OrangeHRM/1545111808_contoh-pdf.pdf')

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Save upload file'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/div_1545111808_contoh-pdf.pdf14.09 kBapplicationpdf2022-12-27Admin'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/button buka file upload file'))

WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM/scroll Attachment upload file'), 1)

WebUI.click(findTestObject('Object Repository/OrangeHRM/melihat keseluruhan Attachment'))

WebUI.setText(findTestObject('Object Repository/textarea_Comment_oxd-textarea oxd-textarea--focus oxd-textarea--resize-vertical'), 
    'comment')

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Saveafterbrowseraddsave'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd-userdropdown-icon'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/a_Logout'))

