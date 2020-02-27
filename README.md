# java-spring-webflux-reactive-cassandra-kafka-docker-testcontainers
A project creating a backend with reactive REST APIs using Spring for Java, Cassandra as DB, Sending out events to Kafka, Dockerizing the whole war/jar file and running Integ Tests in TestContainers

# Prerequisite
```
docker run -d -p 9042:9042 cassandra:3.11.4
cqlsh localhost 9042 
create keyspace demo with replication={'class':'SimpleStrategy', 'replication_factor':1};
use demo;
CREATE TABLE person( id text PRIMARY KEY, name text);
```
