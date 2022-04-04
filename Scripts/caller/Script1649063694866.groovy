// Test Cases/caller

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import my.Params

Map params = (Map)new Params(["bar": "Hello, world!"])

WebUI.callTestCase(findTestCase("callee"), ["params": params])