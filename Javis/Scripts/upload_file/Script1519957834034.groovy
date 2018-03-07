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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stagedms.deltaww.com/jarvisweb/zh-tw/Login')

WebUI.setText(findTestObject('Upload/Page_DMS/input_username'), 'ches.shen')

WebUI.setText(findTestObject('Upload/Page_DMS/input_userpassword'), 'HAUhau0827')

WebUI.sendKeys(findTestObject('Upload/Page_DMS/input_userpassword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Upload/Page_DMS/a_'))

WebUI.click(findTestObject('Upload/Page_DMS/span_'))

WebUI.click(findTestObject('Upload/Page_DMS/span__1'))

WebUI.click(findTestObject('Upload/Page_DMS/span_radio-icon'))

WebUI.click(findTestObject('Upload/Page_DMS/span_QA create report from dep'))

WebUI.delay(1)

WebUI.click(findTestObject('Upload/Page_DMS/span__2'))

WebUI.click(findTestObject('Upload/Page_DMS/span__3'))

WebUI.click(findTestObject('Upload/Page_DMS/div_'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/span__4'))


WebUI.uploadFile(findTestObject('Upload/Page_DMS/span__4'), "C:\\Javis_pdf.pdf".replaceAll("\\\\\\\\", "\\\\"))


//WebUI.sendKeys(findTestObject('Chrome/div_pdfExcelWordPowerPoint'), '123', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/div__1'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/li_'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/span__5'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/div_Javis_pdf'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/button_doc-viewer__back'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/path'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/div__2'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/li__1'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/div__3'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/span__6'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/div__1'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/li__2'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/span__5'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/div_Javis_pdf'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/button_doc-viewer__back'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/svg'))

not_run: WebUI.click(findTestObject('Upload/Page_DMS/span__5'))

WebUI.closeBrowser()

