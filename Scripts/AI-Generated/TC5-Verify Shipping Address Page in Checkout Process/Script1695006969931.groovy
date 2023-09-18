import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_checkout_shipping-address'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/checkout/shipping-address')

'step 2: Add visual checkpoint at Page_checkout_shipping-address'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Shipping Address Page in Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
