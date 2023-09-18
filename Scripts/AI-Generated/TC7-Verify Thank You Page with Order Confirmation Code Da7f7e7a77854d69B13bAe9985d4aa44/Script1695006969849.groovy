import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_thank-you_da7f7e7a-7785-4d69-b13b-ae9985d4aa44'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/da7f7e7a-7785-4d69-b13b-ae9985d4aa44')

'step 2: Add visual checkpoint at Page_thank-you_da7f7e7a-7785-4d69-b13b-ae9985d4aa44'

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Thank You Page with Order Confirmation Code Da7f7e7a77854d69B13bAe9985d4aa44_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
