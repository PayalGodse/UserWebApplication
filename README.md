# UserWebApplication
Application for user database 

Technologies used:

Have bild a small web application
Technologies used:-

Java
JAXRS for rest services
MongoDB for database
Apache Tomcat Server

I preferred Java as it was simple doing things in it like creating a web application project 
developing  servlets for desired apis and communicating it database for accessing the data.

Using mongodb database you dont have to worry about p schema. you can design schema on fly
Also inserting rows and accesing data is convenient using MongoDB. 
Replication and Scalability.

Working:

I have ceated a database name Userdatabase on local host. With following entries in it.
db.users.insert({"uname":"admin","pwd":"admin","city":"SanDiego","age":24})
db.users.insert({"uname":"user1","pwd":"userpwd","city":"SanDiego","age":23})
db.users.insert({"uname":"user2","pwd":"userpwd","city":"Dallas","age":23})
db.users.insert({"uname":"user3","pwd":"userpwd","city":"SanFrancisco","age":25})
db.users.insert({"uname":"user4","pwd":"userpwd","city":"SanFrancisco","age":24})

Enter user name and password and click login button

there are 3 options:
1. ENter age click All users button : this gives results filtered by age and group by cities. (Eg :23)
2.isDatbase up checks whether database is running and we can use any status paramaetr we want
    Have used host,process and OK for displaying
3. Enter directory you want and click ListOf FIles button (eg: F:/)


