import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_category_chekhly_dlya_samsung --> navigate to Page_category_chekhly-dlya-samsung'

testObj = findTestObject('Object Repository/Page_home/hyperlink_category_chekhly_dlya_samsung')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_category_chekhly-dlya-samsung click on hyperlink_product_samsung_orange_book --> navigate to Page_product_samsung-orange-book-1'

testObj = findTestObject('Object Repository/Page_category_chekhly-dlya-samsung/hyperlink_product_samsung_orange_book')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-dlya-samsung(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_product_samsung-orange-book-1 click on label_object'

testObj = findTestObject('Object Repository/Page_product/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_product_samsung-orange-book-1 input on input_object'

testObj = findTestObject('Object Repository/Page_product/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_object)

'step 6: At Page_product_samsung-orange-book-1 click on button_object'

testObj = findTestObject('Object Repository/Page_product/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page_product_samsung-orange-book-1'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Product Details for Samsung Orange Book on Category Chekhly Dlya Samsung_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
