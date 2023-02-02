<h1> Automation-LT </b> </h1>

## <b> ``Introduction`` </b>

**Before starting the Challenge, I've read the entire challenge and put together a plan to facilitate the process. By doing so, the development of the project became much simpler. For the execution of the project, I used Java and Selenium.**
<br>

## <b> ``Process`` </b>

**Before starting the challenge, I did a study and put together a test plan based on the link that was passed. Soon after, I started the text files and locators of all components before starting the process of automating a Happy Flow, as it makes assembling the scenarios much simpler with this structure ready.**

<br>

## <b> ``Running Automated Tests`` </b>

- Application required to run:
    - IntelliJ IDEA Community Edition( https://www.jetbrains.com/idea/download/#section=windows )
- Download the Automation-LT project from Github
    - https://github.com/VictorHugoSiqueira/Automation-LT

**Steps**
- It's necessary that you have the file pom.xml with these dependecies declared in it.

<dependencies>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.14.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>io.cucumber</groupId>
      <artifactId>cucumber-junit</artifactId>
      <version>6.10.2</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
    <dependency>
      <groupId>io.cucumber</groupId>
      <artifactId>cucumber-java</artifactId>
      <version>6.11.0</version>
    </dependency>
    <dependency>
      <groupId>org.seleniumhq.webdriver</groupId>
      <artifactId>webdriver-parent</artifactId>
      <version>0.9.7376</version>
    </dependency>
    <dependency>
      <groupId>kg.apc</groupId>
      <artifactId>jmeter-plugins-webdriver</artifactId>
      <version>4.7.2</version>
    </dependency>
    <dependency>
      <groupId>io.metersphere</groupId>
      <artifactId>jmeter-plugins-webdriver</artifactId>
      <version>4.5.3</version>
    </dependency>
    <dependency>
      <groupId>ru.stqa.selenium</groupId>
      <artifactId>decorated-webdriver</artifactId>
      <version>4.1</version>
    </dependency>


  </dependencies>

## <b> ``Final considerations``</b>

**As proposed in the challenge, I performed all the tests that were imposed. If I had more time I would have done these testings using BDD and could've done more validations including backend testing, here I will also list some bugs found in the application**

**Bugs:**
- <b> item's description sauce labs backpack with error</b>
- <b> item's name t-shirt red with error </b>
- <b> input first name and last name are letting the user proceed using numbers </b>
- <b> input zipcode letting the user proceed using letters </b>
- <b> User was able to finish a order with no items in the cart </b>