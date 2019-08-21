# Spring boot JWT based authentication integrated with MySQL Database

Import the project as gradle project. The `/authenticate` and `/register` methods are filtered in FilterServlet

Used Encyrption for password and same need to be required for token

### Changes required
Change the below file and update the database URL.
* [application.properties] 


### Installation

RUN the project as SPRING boot app.

### Database table

RUN below table in your database script

```sh
CREATE TABLE user (
	id INT(10) AUTO_INCREMENT PRIMARY KEY,
	userName VARCHAR(10) NOT NULL,
	password varchar(200) NOT NULL,
	email varchar(100) NOT NULL,
	roleId varchar(20) NOT NULL,
	isFirstTime INT NOT NULL,
	createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	createdBy varchar(20) DEFAULT 'InitialScript',
	modifiedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	modifiedBy varchar(20) DEFAULT 'InitialScript'
)
```

### Development

Want to contribute? Great!

### TEST 
Run in postman
1. Register the user
url `localhost:8181/register`
```sh
{
	"username":"admin124",
	"password":"123456",
	"email":"sumitku@gmail.com",
	"roleId":"PL",
	"isFirstTime":1
}
```

2. Authenticate the user and generate the token

url `localhost:8181/authenticate`

```sh
{
	"username":"admin124",
	"password":"123456"
}
```

Output will be 

```sh
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIzOTg5NTkiLCJleHAiOjE1NjYzNzExMDUsImlhdCI6MTU2NjM1MzEwNX0.teTXQgpaC4gVEbbBVepWIq9Me35HdAiUEBHL8D_VhFi98-lorm2v5isV1Af-fsL6-7F_qgL3QueqLBfdaFYucQ"
}
```