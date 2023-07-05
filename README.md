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


#### *connecting GitHub with current project:*

1. Connect Git to repo:
    1. File -> import and select Projects from Git and click Next
    2. Select Clone URI and click next
    3. Paste the repo url in URI field, then input GitHub credentials and click Next.
2. Setting up SSH connection with GitHub:
    1. Install ssh-agent in your OS.
    2. If windows, open a terminal with admin priveleges and set startType to manual by using this command ```Get-Service -Name ssh-agent | Set-Service -StartupType Manual```.
    3. Create an RSA key with this command ```ssh-keygen```.
    4. Provide key name in such a way ```USERNAME-HOST_ALGORITHM```
    5. Add the key to ssh by this command ```ssh-add FILE_NAME_OF_KEY```
    6. Copy the contents public key file and add it to ```Github -> Settings -> SSH -> Add SSH -> name a tile and paste the content in SSH-key field```
    7. Create a config file in ```~/.ssh``` folder.
    8. write down the below code in config file:
  ```
Host github.com
    HostName github.com
    User git
    IdentityFile ~/.ssh/USERNAME-HOST_ALGORITHM
```

3. Setting up Git user in local repo:
    1. Go to the location in which the repo is present
    2. Configure user email using ```git config user.email indhu.consultancy.services@gmail.com```

#### *Initializing spring project in eclipse:*

1. Copy and paste the Sprint boot extracted files to the git initialized folder
2. Open Eclipse and select import project from File -> import project.
2. Select "Existing Maven Projects" and click Next.
3. Select the git initialized folder and click Next.
3. Make sure POM file is selected and click Finish.
4. Import will complete in few minutes.
