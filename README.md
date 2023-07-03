# Spring Boot

### Applications:
1. Web Applications
2. Rest API
3. Full Stack
4. Microservices

### Maven:

#### *what is Maven ?*
* Maven is a build tool used to generate souce code, documentation from source and its also responsible for compling of the source code then packaging to JAR files
* It can also be used to install the packaged code in local repository, server or central repository.
* It helps in project management and its written in Java, C# based on Project Object Model(POM): 
* > Project Object Model is an XML file that has all the inofrmation regarding project and configuration details, **Maven** searches for this file while executing the task.

#### *Problems that Maven solved:*

* Getting right JAR Files for each project. (since there can be different versions of seperate packages).
* To download dependencies visiting the official website of different software is not needed because its all present in "[mvnrepositiry.com](https://mvnrepositiry.com)"
* Maintain Project Structure while execution
* Building and Deploying the project with lesser effort

---

### Create Spring Application

#### *Generating spring configured project:*
1. Go to [spring initializer](https://start.spring.io).
2. Select Maven Project
3. Select Java Language
4. Select Released latest version for spring boot
5. Name your project package
6. Select JAR packaging
7. Select java 17
8. Click Generate to download the zip file and extract it.

#### *Initializing spring project in eclipse:*

1. Open Eclipse and select import project from File -> import project.
2. Select "Existing Maven Projects" and click Next.
3. Select the extracted folder and click Next.
3. Make sure POM file is selected and click Finish.
4. Import will complete in few minutes.

#### *connecting GitHub with current project:*

1. Install EGit to eclipse by:
1.1 Eclipse -> Help Menu -> Install New Software
1.2 Click on Add button
1.3 In name type ``` EGit ```
1.4 In Location type ```https://download.eclipse.org/egit/updates ``` and click Next
1.5 Select all GIT packages and click Next
1.6 Then accept aggerement and close the dialog.
2. Connect Git to repo:
2.1 File -> import and select Projects from Git and click Next
2.2 Select Clone URI and click next
2.3 Paste the repo url in URI field, then input GitHub credentials and click Next.
3. Add .gitIgnore:
3.1   

