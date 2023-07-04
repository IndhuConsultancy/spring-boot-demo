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
3. Setting up SSH connection with GitHub:
3.1 Install ssh-agent in your OS.
3.2 If windows, open a terminal with admin priveleges and set startType to manual by using this command ```Get-Service -Name ssh-agent | Set-Service -StartupType Manual```.
3.2 Create an RSA key with this command ```ssh-keygen -t rsa -b 4096 -C "indhu.consultancy.services@gmail.com"```.
3.3 Add the key to ssh by this command ```ssh-add .\indhu.consultancy.services@gmail.com_github```.
3.4 Copy the contents public key file and add it to ```Github -> Settings -> SSH -> Add SSH -> name a tile and paste the content in SSH-key field```
3.5 Check if connections is established using this command ``` ssh -T git@github.com```
4. Setting up Git user in local repo:
4.1 Go to the location in which the repo is present
4.2 Configure user email using ```git config user.email indhu.consultancy.services@gmail.com```
4.3


