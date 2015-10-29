Project `Documentation` can be found at:
https://sites.google.com/site/structurepredictiontools/
***
The `project license` can be found at:
https://sites.google.com/site/structurepredictiontools/license
***
The project is governed by proprietary software from multiple sources.
Refer to license folder for details.
***
Your `profile` page can be found at:
https://sites.google.com/site/structurepredictiontools/Discussion/user-profile
If you don't have a profile, that would mean you are a volunteer. Thank you for your interest and help. Please contact me at suvo@github.com if you want to understand what I am doing and what else you can help me with, that is to say, if you have some free time to spare for this project. 
 
***
If you want to add your custom license that governs the code contributed by you,
you should
1. Request permission by sending an email along with a copy of your license to suvo@github.com
1.a. You need to do this every time you make changes in your license file. 
2. Put your license in the license folder.
3. Put a note/comment in the source code of each file that needs to be covered by your license.
4. If you fail to mention the license details, your code (only that particular file) would be governed by MIT Software License.
5. Everything is governed by `project license`, if there is any contradictory clause in your license, the note given, and the stand taken by the `project license` would be upheld.  
***
The OpenShift `jbossas` cartridge documentation can be found at:
https://github.com/openshift/origin-server/tree/master/cartridges/openshift-origin-cartridge-jbossas/README.md
***

# WELCOME TO PROJECT CENTRAL REPOSITRON
This is a jboss maven application with default layout. 
The project would be migrated to gradle with custom layout at a later stage.
The View would be put in WEB-INF folder at a later stage. So avoid hard-coding links. All requests need to pass through controller.
MVC framework used is Struts2, in general. Spring Security is used for login module. Hibernate/JPA is used as ORM. JEE/Websockets is used for two way communication. JAX/RS is used for Web Services.
View framework used is AngularJS with HTML5 and JQuery.
Database used is MySQL at the moment. To be migrated to Hadoop later.
The project is hosted at Openshift. Later to be migrated to AWS on a RedHat box. Docker images would be provided as well. 

## Notes to Web Devs
1. Put all your resources in centralrepositron > src > main > webapp folder in the order mentioned below.
1.a. Put all your html files in html folder. 
1.a.i.  Complete portal pages need to go to html/frontend folder.
1.a.ii. Fragment pages need to go to html/byparts folder.
1.b. Put all your stylesheets in opt/css folder.
1.c. Put all your custom scripts in opt/js folder.
1.d. Put all your image files in images folder.

## Notes to Java Devs
1. Put all your java files in src/main/java folder.
2. Put all your test classes in src/main/test folder.
3. Put all your resource files in src/main/resources folder.
4. Put all your configuration in src/main/resources/yourname.xml and <include> it in struts.xml

## Notes to linux/Perl/Python Devs
1. In case you think a file is required to be placed INSIDE the project directory, think again and discuss with me first.
1.a. If there is no other solution, place it in webapp/www/cgi-bin folder.
1.b. Html files would go to webapp/www/htm folder. 

### General Note:
1. It appears that adding a test resource folder breaks JAX/RS support.
2. Do not add/generate files larger than 50MB. Github puts a 1GB cap to regular projects plus large files make it slow for users pulling the project. If you do, I'll delete the files and causative code without notice.
3. Library files should be maintained in POM and not in the lib folder.
4. External executables support is not enabled at the moment due to limitations in Openshift platform. They would be revisited later.
 
 



