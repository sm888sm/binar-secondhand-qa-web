$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/07 User Search Product.feature");
formatter.feature({
  "name": "Use Search Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User searches and views a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters the product name in the search field",
  "keyword": "When "
});
formatter.step({
  "name": "presses the Enter key",
  "keyword": "And "
});
formatter.step({
  "name": "the search results should display the product name, category \u003ccategoryName\u003e and price \u003cpriceFormatted\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "description",
        "priceFormatted",
        "categoryName"
      ]
    },
    {
      "cells": [
        "Used laptop",
        "Rp 8.000.000",
        "Hobi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User searches and views a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters the product name in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "SellerSearchProduct.inputProductName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presses the Enter key",
  "keyword": "And "
});
formatter.match({
  "location": "SellerSearchProduct.submitSearchProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the search results should display the product name, category Hobi and price Rp 8.000.000",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSearchProduct.displaySearchProductItem(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User clicks the product to open the product page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on the desired product from the search results",
  "keyword": "When "
});
formatter.step({
  "name": "the user is redirected to the product details page",
  "keyword": "Then "
});
formatter.step({
  "name": "the product is submitted with valid information \u003ccategoryName\u003e, \u003cpriceFormatted\u003e, \u003cdescription\u003e, \u003csellerName\u003e, \u003csellerCity\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "description",
        "priceFormatted",
        "categoryName",
        "sellerName",
        "sellerCity"
      ]
    },
    {
      "cells": [
        "Used laptop",
        "Rp 5.000.000",
        "Elektronik",
        "Seller QA Group 03 Wave 10",
        "Jakarta"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User clicks the product to open the product page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on the desired product from the search results",
  "keyword": "When "
});
formatter.match({
  "location": "SellerSearchProduct.clickSearchProductItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is redirected to the product details page",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSearchProduct.redirectToProductPage()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: productID is not matched\r\n\tat com.kms.katalon.core.util.KeywordUtil.markFailed(KeywordUtil.java:19)\r\n\tat com.kms.katalon.core.util.KeywordUtil$markFailed.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat SellerSearchProduct.redirectToProductPage(SellerSearchProduct.groovy:110)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:70)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:52)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat Script1692534660085.run(Script1692534660085.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1692738115695.run(TempTestSuite1692738115695.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the product is submitted with valid information Elektronik, Rp 5.000.000, Used laptop, Seller QA Group 03 Wave 10, Jakarta",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.productPublishSuccess(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});