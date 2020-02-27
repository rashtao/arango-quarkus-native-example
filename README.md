# arango-quarkus-native-example project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## prerequisites

- Checkout and install the latest snapshot version of the driver:

```shell script
git clone git@github.com:arangodb/arangodb-java-driver.git
cd arangodb-java-driver
mvn clean install -Dgpg.skip -DskipTests=true
docker run -e ARANGO_ROOT_PASSWORD=test -p 8529:8529 --rm arangodb:3.6
``` 

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `arango-quarkus-native-example-1.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/arango-quarkus-native-example-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/arango-quarkus-native-example-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .