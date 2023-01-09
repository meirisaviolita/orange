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
import groovy.json.JsonSlurper

Integer id = 0

Integer petId = 0

Integer quantity = 0

String shipDate = "2023-01-03T07:31:07.684Z"

String status = "placed"

boolean complete = true

response = WS.sendRequest(findTestObject('petpet', [('id') : id, ('petId') : petId, ('quantity') : quantity, ('shipDate') : shipDate, ('status') : status, ('complete') : true]))

WS.comment(response.getResponseBodyContent())

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseBodyContent())

String meiparsing = parsedJson.id

WS.comment(meiparsing)

String parsing = parsedJson.status

WS.comment(parsing)

WS.verifyMatch(parsing, status, false)




