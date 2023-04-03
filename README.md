# Calculator-app-automation

## Android app Automation with Appium:
App Automation with Selenium Appium refers to using Appium, an open-source mobile application automation testing framework, in conjunction with Selenium, an open-source web application automation testing framework, to automate the testing of mobile applications.
Appium is a cross-platform tool that enables automation of native, hybrid, and mobile web applications on iOS and Android platforms. Selenium is primarily used for automating web applications and has limited support for mobile applications. However, by using Appium with Selenium, developers can automate the testing of mobile applications across multiple platforms.

## App Name: 
- [Calculator](https://play.google.com/store/apps/details?id=com.google.android.calculator)

 
## APK build version downloader:
- [APK link](https://apps.evozi.com/apk-downloader/)

## IDE Used:
- Intelji Idea
- Appium
- Android Studio

## Prerequisites:
- Install Android Studio latest version
- Install Appium 
- Install jdk or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME Stable internet connection
## Langueges
- Java

## How to run this project:
- Clone this project
- Open Android Studio and Open the APK file
- Set required configuration
- Execute command in cmd for checking the connectivity with emulator : adb devices
- Open Appium Server with following command: appium -p 4723
- Open Appium Inspector
- Open Intellij Idea
- Execute the following command into the terminal: 
   gradle clean test
- For generating Allure Report use these commands: allure generate allure-results --clean -o allure-report and allure serve allure-results

## Automation Steps: 
I have implemented in the following test automation steps.
- Sum of 2 numbers (9+5=14)
- Subtraction of 2 numbers (8-3=5)
- multiplied of Result of Sum and Subtraction (14*5=70)
- Divided the result of multiplication with 10 (70/10=7)
- Solved this series (100+200-100*2/5)
## Allure Report:
![allu-1](https://user-images.githubusercontent.com/123467715/222777120-50d812a1-ba2c-4719-b1bf-75e7b27c9dc0.PNG)

![allu-3](https://user-images.githubusercontent.com/123467715/222777180-e1b003a0-c32d-470a-9472-e6b985f3c123.PNG)

![allu-4](https://user-images.githubusercontent.com/123467715/222777228-f2276961-79cb-4433-b124-6200ee50e6d7.PNG)

![allu-5](https://user-images.githubusercontent.com/123467715/222777305-59ceac68-512d-4e06-89dc-c6d58ffcaf0d.PNG)

![allu-6](https://user-images.githubusercontent.com/123467715/222777039-78aebc34-614a-4461-9233-e32413620a5e.PNG)

## Gradle Report:
![cal-1](https://user-images.githubusercontent.com/123467715/222656951-23aa440e-d7c5-467a-a798-cb87a9642745.PNG)

![cal-2](https://user-images.githubusercontent.com/123467715/222656992-ac9b2c78-9657-4860-89b7-2e0c81921d65.PNG)

## Project video:
- [Youtube](https://youtu.be/mcgSZKY7c10)
