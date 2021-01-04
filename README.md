# spring-boot-microservice
spring boot microservice application

Use below curl commands to insert user and department records.

curl -X POST localhost:9001/departments/ -H 'Content-type:application/json' -d '{"departmentName": "IT", "departmentAddress": "25th cross street", "departmentCode": "IT-005"}'

curl -X POST localhost:9002/users/ -H 'Content-type:application/json' -d '{"firstName": "Malyadri", "lastName": "Patiban", "email": "malya@gmail.com", "departmentId": "1"}'

curl -v localhost:9191/user-api/users/1

Here User is one micro service and department is another micro service.

user will fetch department from user service based on userId.
