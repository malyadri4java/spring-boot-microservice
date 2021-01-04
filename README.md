# spring-boot-microservice
spring boot microservice application

Use below curl commands to insert user and department records.
curl -v localhost:9001/departments/1
curl -X POST localhost:9001/departments/ -H 'Content-type:application/json' -d '{"departmentName": "IT", "departmentAddress": "25th cross street", "departmentCode": "IT-005"}'
curl -v localhost:9001/departments/

curl -v localhost:9002/users/1
curl -X POST localhost:9002/users/ -H 'Content-type:application/json' -d '{"firstName": "Malyadri", "lastName": "Patiban", "email": "malya@gmail.com", "departmentId": "1"}'
curl -v localhost:9002/users/


Here User is one micro service and department is another micro service.
user will fetch department from user service based on userId.
