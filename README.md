# JBoss Simple Test

Minimal application to test JBoss Logging on WildFly.

## Requirements
- Java 8
- Maven
- WildFly 26

## Build and Deploy
```bash
mvn clean package
cp target/simple-test.war $WILDFLY_HOME/standalone/deployments/
```

## Test
```bash
curl http://localhost:8080/simple-test/log
```

## Technologies
- JBoss Logging 3.4.1
- Servlet API 3.1
- WildFly 26 (open source base of JBoss EAP 7.4)
