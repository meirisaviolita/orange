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

WebUI.navigateToUrl(GlobalVariable.URLOrange)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), '')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), '')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/USERNAME_POP UP LINE_Required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/PASSWORD_POP UP LINE_Required'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/input_Username_username'), 2)

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), '')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/USERNAME_POP UP LINE_Required'))

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), '')

WebUI.sendKeys(findTestObject('OrangeHRM/input_Password_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('OrangeHRM/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('OrangeHRM/input_Password_password'), '')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/PASSWORD_POP UP LINE_Required'))

WebUI.sendKeys(findTestObject('OrangeHRM/input_Username_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('OrangeHRM/input_Username_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/pop up salah password'))

WebUI.sendKeys(findTestObject('OrangeHRM/input_Username_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('OrangeHRM/input_Username_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admii')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/pop up salah username'))

WebUI.setText(findTestObject('OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('OrangeHRM/button_Login'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/a_Admin'), 2)

WebUI.click(findTestObject('OrangeHRM/a_Admin'))

WebUI.click(findTestObject('OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/user role'))

WebUI.click(findTestObject('OrangeHRM/span_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('OrangeHRM/span_Enabled'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('input'), 'Odis  Adalwin')

WebUI.delay(3)

WebUI.click(findTestObject('span_Odis  Adalwin'))

WebUI.setText(findTestObject('OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'admin132', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OrangeHRM/input_Password_oxd-input oxd-input--focus'), 'P@ssw0rd')

WebUI.setText(findTestObject('OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 'P@ssw0rd')

WebUI.click(findTestObject('OrangeHRM/Saveafterconfirm password'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/username search'), 'admin132')

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/button_Reset_search admin'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/username search'), 'admin132')

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Search'))

WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM/div_UsernameAscendingDecendingUser RoleAscendingDecendingEmployee NameAscendingDecendingStatusAscendingDecendingActionsadmin1AdminShazia CollingsEnabled'), 
    1)

WebUI.click(findTestObject('Object Repository/OrangeHRM/div_admin53AdminOdis AdalwinEnabled'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/button_Enabled_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/a_My Info'))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/firmstname_pop up line_Required'))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/01. input_Employee_firstName'), 'helan')

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/02. input_Employee_middleName'), 'mariya')

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/03. input_Employee_lastName'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/03. input_Employee_lastName'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/03. input_Employee_lastName'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.verifyElementVisible(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/lastname_pop up line_Required'))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/03. input_Employee_lastName'), 'POL')

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), 'minnu')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/04. input_Nickname_'), 'minnu')

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/06. input_Employee Id'), '0028')

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/07. input_Other Id'), 'asdf')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), '')

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), '')

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/8. input_concat Driver'), '1234567')

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/i_License Expiry Date_oxd-icon bi-calendar oxd-date-input-icon'))
	
WebUI.click(findTestObject('Object Repository/OrangeHRM/9. tanggal_4'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), '1234')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/10. input_SSN Number'), '')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), '1234')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/11. input_SIN Number'), '')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/12. dropdown national'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/13. Afghan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/14 drodown material status'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/15. Married'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/16. Date of Birth'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/17. _15'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/18. Male'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/19. Female'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), '')

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), 'ABCD')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), Keys.chord(
		Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), Keys.chord(
		Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/20. input_Military Service'), '')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/21. i_Yes'))

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/22. label_Yes kosong'))

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/button_Save Personal Detail'))

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/i_PIM_oxd-icon bi-caret-down-fill oxd-userdropdown-icon'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PERSONAL DATA/Page_OrangeHRM/a_Logout'))


