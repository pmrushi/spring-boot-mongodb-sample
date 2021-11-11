# Mongo DB
MongoDB NoSql database setup and commands.

* References

https://dev.to/sonyarianto/how-to-spin-mongodb-server-with-docker-and-docker-compose-2lef

https://geekflare.com/mongodb-queries-examples/

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

* Alternative mongo client compass
```
https://www.mongodb.com/try/download/compass
```

### Commands
* Access mongodb docker container
```
docker exec -it mongodb bash
```
* Connect via mongo shell
```
mongo admin -u root -p password
```

* Show database version
```
db.version()
```
* Show databases
```
show dbs
```
* Create new non existing database
```
use <database-name>
```
* Drop database
```
db.dropDatabase()
```
* Create collection
```
db.createCollection("<collection-name>")
```
* Show collections
```
show collections
```
* Drop collections
```
db.<collection-name>>.drop()
```
* Show contents/documents of a collection
```
db.<collection-name>>.find().pretty()
```
* Insert a document to a collection
```
db.<collection-name>.save({"name":"ABC"})
```
* Insert multiple documents to a collection
```
db.<collection-name>.insertMany([{"name":"ABC"},{"name":"CED"}])
```
* Delete a document from a collection
```
db.<collection-name>.remove({"name":"ABC"})
```