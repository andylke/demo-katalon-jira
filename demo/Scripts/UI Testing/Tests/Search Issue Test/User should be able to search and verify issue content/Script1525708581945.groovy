import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('UI Testing/Pages/Open Browser/Open the Login page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('UI Testing/Pages/Login Page/Login with username and password'), [('username') : GlobalVariable.LoginUsername
        , ('password') : GlobalVariable.LoginPassword], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('UI Testing/Pages/Master Page/Open the Search for issue page'), [:], FailureHandling.STOP_ON_FAILURE)

issue_summary = 'Demo summary'

jql = 'text~"Demo summary"'

WebUI.callTestCase(findTestCase('UI Testing/Pages/Search Issue Page/Search issues using jql'), [('jql') : jql], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('UI Testing/Pages/Search Issue Page/Simple Issue List/Open the issue having specified summary'), 
    [('issue_summary') : issue_summary], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('UI Testing/Pages/Search Issue Page/Issue Content/Verify opening issue content'), [('issue_summary') : issue_summary], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

