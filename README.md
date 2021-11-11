# spring-boot-mongodb-sample
Spring boot application connect to MongoDB NoSql database and CRUD samples.

### Setup MongoDB

* Pull images and create containers
```
cd mongodb
docker-compose up -d
```
* shutdown database without delete all containers.
```
docker-compose stop
```
* shutdown database and delete all containers.
```
docker-compose down
```
 
### Connect to mongo express client
* Login to mongo express
```
URL      : http://localhost:8081/
User     : admin
Password : admin
```
####Run Application
```
./gradlew bootRun
gradlew.bat bootRun (windows)
```
####Test Application
* Save Employee - POST - http://localhost:8080/api/v1/employee

Request body :
```
{
    "employeeId": "E001",
    "employeeName": "Jack",
    "employeeEmail": "jack@gmail.com",
    "employeeAddress": "US"
}
```
Response :
```
{
  "id": "618d3f178536a6332aacf7b6",
  "employeeId": "E001",
  "employeeName": "Jack",
  "employeeEmail": "jack@gmail.com",
  "employeeAddress": "US"
}
```

* Update Employee - POST - http://localhost:8080/api/v1/employee

Request body :
```
{
    "id": "618d3f178536a6332aacf7b6",
    "employeeId": "E001",
    "employeeName": "Jack1",
    "employeeEmail": "jack@gmail.com",
    "employeeAddress": "US"
}
```
Response :
```
{
  "id": "618d3f178536a6332aacf7b6",
  "employeeId": "E001",
  "employeeName": "Jack1",
  "employeeEmail": "jack@gmail.com",
  "employeeAddress": "US"
}
```

* Get All Employees - GET - http://localhost:8080/api/v1/employee/all

Response :
```
[
    {
        "id": "618d3f178536a6332aacf7b6",
        "employeeId": "E001",
        "employeeName": "Jack",
        "employeeEmail": "jack@gmail.com",
        "employeeAddress": "US"
    }
]
```

* Find Employee By ID - GET - http://localhost:8080/api/v1/employee/618d3f178536a6332aacf7b6

Response :
```
[
    {
        "id": "618d3f178536a6332aacf7b6",
        "employeeId": "E001",
        "employeeName": "Jack",
        "employeeEmail": "jack@gmail.com",
        "employeeAddress": "US"
    }
]
```

Delete Employee By ID - DELETE - http://localhost:8080/api/v1/employee/618d3f178536a6332aacf7b6
