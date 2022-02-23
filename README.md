# TMB_SeleniumFramework2
This project is designed and developed with the help of -
1. Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins)
------------------------------------------------------------
![image](https://user-images.githubusercontent.com/26399692/155394468-276d8a47-8425-4d42-be05-81cc0162da64.png)
![image](https://user-images.githubusercontent.com/26399692/155394512-2f51ccd0-0bac-4350-9455-0b92d5cdedc6.png)
------------------------------------------------------------
![image](https://user-images.githubusercontent.com/26399692/155396875-133fe246-ed52-42b1-b007-0a3d7b9025b8.png)
![image](https://user-images.githubusercontent.com/26399692/155396925-7b96cfb4-8746-4239-a15e-20808def51a2.png)
------------------------------------------------------------
**ExtentReports V5** 
1. User can apply the Filters - 
- Author - Rajat, Nishant, Gautam, Pankaj 
- Browser - Chrome, Edge, Safari, Firefox 
- TestType - Smoke, Sanity, Regression, BVT

2. Screenshots are attached in the ExtentReport as Base64 format.
![image](https://user-images.githubusercontent.com/26399692/155394977-86801396-1c1f-4889-83af-21b16fafce74.png)
![image](https://user-images.githubusercontent.com/26399692/155395075-f74f2a24-3a85-493f-bca5-a7635b9d43b9.png)

------------------------------------------------------------
**User has options for customization**
![image](https://user-images.githubusercontent.com/26399692/155395550-a7fc790c-a9c8-4e10-96af-1baf6ad95187.png)
------------------------------------------------------------
**Email to User(s) using Java mail API**
![image](https://user-images.githubusercontent.com/26399692/155395917-43d1969f-3552-46c0-ab69-f09d8b03f0a5.png)
------------------------------------------------------------
**Others implementations:**
1. Custom Enums, Exceptions, Annotations 
2. Data Driven testing using .xlsx file (Reading values with the help of Data Supplier)
-------------------------------
3. Icons addition in ExtentReport (Browser icon with every test case | Test status | Test Description -> Last -> Pass (Happy), Fail (Sad) | OS + Browser | Details in Dashboard page of ExtentReport (Rajat linkedIn and Github URL)
------------------------------
4. Zip the ExtentReports directory into Project path (you can send this Zip file as well as an Attachment in Email)
5. Automatically open the report after tests execution.
----------------------------------
6. Send EMail using Java mail API to User(s) with attachment(s).
 - https://mvnrepository.com/artifact/javax.mail/mail/1.4.7
 - https://www.tutorialspoint.com/java/java_sending_email.htm
 - Gmail -> Manage your Google account: 
        ![image](https://user-images.githubusercontent.com/26399692/137579937-12c01d4d-1f62-4867-8c40-c056391d3b7e.png)
 - Security -> Turn on : Less Secure App access:
        ![image](https://user-images.githubusercontent.com/26399692/137579959-e1554f06-5583-4ad1-ad28-ed69ed27b922.png)

------------------------------------------------------------
**How to run the Project from Local machine**
1. Pull the code into your machine and import in IDE (Eclipse/intelliJ).
2. Run Project as Mvn test
  It should start the execution -> Parallel Browser Testing.
 - **NOTE:** config.properties (./src/test/resources/config) is the configuration file.
------------------------------------------------------------

