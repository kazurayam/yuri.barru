// Test Cases/caller

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import my.ParamsFactory

ParamsFactory func1ParamFactory = new ParamsFactory(["no":"1","foo":"bar","john":"doe"])
WebUI.callTestCase(findTestCase("func1"), ["params": func1ParamFactory.createParams(["no":"007"])])

ParamsFactory func2ParamFactory = new ParamsFactory(["city": "Jakarta", "phone": 15000, "isNeedCall": false]);
WebUI.callTestCase(findTestCase("func2"), ["params": func2ParamFactory.createParams(["city":"Soeul"])])

ParamsFactory func3ParamFactory = new ParamsFactory(["isExpensive": false, "isRetired" : false]);
WebUI.callTestCase(findTestCase("func3"), ["params": func3ParamFactory.createParams(["isExpensive":true])])
