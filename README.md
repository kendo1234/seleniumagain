### Checklist for starting a basic Selenium-Java-POM project ###

- Go to mvn repo for Selenium-java, junit, webdriver manager 

- Create driver factory: Create a package for driver-based management and a class for initialising the driver within your page object classes

- Create a page object/component package - add classes in here that will consist of a collection of elements and interaction methods that use the driver instance inherited from your driver factory. In this suite I have used @FindBy annotations to return elements.

Add the page contructure to each class of this nature, to initialise elements declared in the class so they can be used in your test methods.

- Create tests - create a test package and start adding tests that use the test methods from your page objects.

Instantiate a driver for this class (i've used web driver manager as it fetches binaries for you, without having to use local files).

Instantiate the page object.

Write test methods, seperating them out using JUNIT annotations.  


### Factory Test ###

This test uses the factory pattern detailed above, it leverages the GoogleSearch page component class, which in turn uses the DriverFactory class.

### Constant Variable Elements ###

This test does not utilise factory/page object pattern, but does seperate elements out into constant variables at the start of the class, which can help maintenance of tests. Note the google search field constant at the top of the class. This means that you would not have to repeat element locators throughout your methods.

### Vanilla Test ###

This test uses no design pattern at all, it a quick and easy selenium example without even a unit test annotation to assist running it.

### Referance Material ###

WebDriver Manager - https://github.com/bonigarcia/webdrivermanager

Design patterns with selenium and java - 

http://www.testautomationguru.com/arquillian-graphene-page-fragments/
http://www.testautomationguru.com/selenium-webdriver-how-to-design-page-objects-in-fluent-style/
http://www.testautomationguru.com/selenium-webdriver-design-patterns-in-test-automation-factory-pattern/
http://www.testautomationguru.com/selenium-webdriver-design-patterns-in-test-automation-decorator-design-pattern/

