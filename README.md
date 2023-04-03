# Calculator-app-automation

Skip to content
Search or jump to…
Pull requests
Issues
Codespaces
Marketplace
Explore
 
@Majhar-98 
Majhar-98
/
Google-Calculator-App-Automation-using-Appium
Public
Cannot fork because you own this repository and are not a member of any organizations.
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Settings
Google-Calculator-App-Automation-using-Appium
/
README.md
in
main
 

Spaces

1

Soft wrap
1
# Google-Calculator-App-Automation-using-Appium
2
​
3
## Android app Automation with Appium:
4
App Automation with Selenium Appium refers to using Appium, an open-source mobile application automation testing framework, in conjunction with Selenium, an open-source web application automation testing framework, to automate the testing of mobile applications.
5
Appium is a cross-platform tool that enables automation of native, hybrid, and mobile web applications on iOS and Android platforms. Selenium is primarily used for automating web applications and has limited support for mobile applications. However, by using Appium with Selenium, developers can automate the testing of mobile applications across multiple platforms.
6
​
7
## App Name: 
8
- [Calculator](https://play.google.com/store/apps/details?id=com.google.android.calculator)
9
​
10
 
11
## APK build version downloader:
12
- [APK link](https://apps.evozi.com/apk-downloader/)
13
​
14
## IDE Used:
15
- Intelji Idea
16
- Appium
17
- Android Studio
18
​
19
## Prerequisites:
20
- Install Android Studio latest version
21
- Install Appium 
22
- Install jdk or any LTS version
23
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME Stable internet connection
24
​
25
## Langueges
26
- Java
27
​
28
## How to run this project:
29
- Clone this project
30
- Open Android Studio and Open the APK file
31
- Set required configuration
32
- Execute command in cmd for checking the connectivity with emulator : adb devices
33
- Open Appium Server with following command: appium -p 4723
34
- Open Appium Inspector
35
- Open Intellij Idea
36
- Execute the following command into the terminal: 
37
   gradle clean test
38
- For generating Allure Report use these commands: allure generate allure-results --clean -o allure-report and allure serve allure-results
39
​
40
## Automation Steps: 
41
I have implemented in the following test automation steps.
42
- Sum of 2 numbers (9+5=14)
43
- Subtraction of 2 numbers (8-3=5)
44
- multiplied of Result of Sum and Subtraction (14*5=70)
45
- Divided the result of multiplication with 10 (70/10=7)
46
- Solved this series (100+200-100*2/5)
47
​
48
## Allure Report:
49
![allu-1](https://user-images.githubusercontent.com/123467715/222777120-50d812a1-ba2c-4719-b1bf-75e7b27c9dc0.PNG)
50
​
51
![allu-3](https://user-images.githubusercontent.com/123467715/222777180-e1b003a0-c32d-470a-9472-e6b985f3c123.PNG)
52
​
53
![allu-4](https://user-images.githubusercontent.com/123467715/222777228-f2276961-79cb-4433-b124-6200ee50e6d7.PNG)
54
​
55
![allu-5](https://user-images.githubusercontent.com/123467715/222777305-59ceac68-512d-4e06-89dc-c6d58ffcaf0d.PNG)
56
​
57
![allu-6](https://user-images.githubusercontent.com/123467715/222777039-78aebc34-614a-4461-9233-e32413620a5e.PNG)
58
​
59
## Gradle Report:
60
![cal-1](https://user-images.githubusercontent.com/123467715/222656951-23aa440e-d7c5-467a-a798-cb87a9642745.PNG)
61
​
62
![cal-2](https://user-images.githubusercontent.com/123467715/222656992-ac9b2c78-9657-4860-89b7-2e0c81921d65.PNG)
63
​
64
## Project video:
65
- [Youtube](https://youtu.be/mcgSZKY7c10)
