$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/searching.feature");
formatter.feature({
  "name": "Searching",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching by price as non-logged user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchingByModelSteps.userIsNotLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill minimal price with 5000",
  "keyword": "When "
});
formatter.match({
  "location": "SearchingByModelSteps.userFillMinimalPriceWithMinimalPrice(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cspan class\u003d\"select2 select2-container select2-container--suggestions select2-container--below select2-container--open\" dir\u003d\"ltr\" style\u003d\"width: 100%;\"\u003e...\u003c/span\u003e is not clickable at point (566, 303). Other element would receive the click: \u003cinput class\u003d\"select2-search__field\" type\u003d\"search\" tabindex\u003d\"0\" autocomplete\u003d\"off\" autocorrect\u003d\"off\" autocapitalize\u003d\"off\" spellcheck\u003d\"false\" role\u003d\"textbox\"\u003e\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u00271404\u0027, ip: \u00270.0.5.124\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.3.0-42-generic\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /tmp/.com.google.Chrome.y1yEi6}, goog:chromeOptions: {debuggerAddress: localhost:42915}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2dd297b4b4515b547f9c7734c0831422\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat page_object.MainPage.FillMinimalPriceField(MainPage.java:40)\n\tat step_definitions.SearchingByModelSteps.userFillMinimalPriceWithMinimalPrice(SearchingByModelSteps.java:60)\n\tat ✽.User fill minimal price with 5000(src/test/resources/features/searching.feature:19)\n",
  "status": "failed"
});
formatter.step({
  "name": "User fill maximal price with 10000",
  "keyword": "And "
});
formatter.match({
  "location": "SearchingByModelSteps.userFillMaximalPriceWithMaximalPrice(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchingByModelSteps.userClickSearchButton()"
});
formatter.result({
  "status": "skipped"
});
});