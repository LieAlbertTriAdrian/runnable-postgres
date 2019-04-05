# runnable-postgres
Runnable postgres in multi-platform

* [runnable-postgres](#runnable-postgres)
	* [Setup](#setup)
	* [Onboarding](#onboarding)
		* [Build](#build)
		* [Run](#run)
	* [TODO:](#todo)

## Setup
* [Gradle](https://gradle.org/)
* [Java 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Onboarding

### Build
* Builds are done using gradle
* [build.gradle](./build.gradle) contains the steps for producing the build artifact such as jar

`gradle clean` : clean all the artifacts in the `build` folder
`gradle fatJar` : build the artifacts into one jar file containing all the dependencies in `build/libs` folder

### Run
* There will be postgres process running in port 5432
* Command: `java -jar build/libs/runnable-postgres-all-1.0.jar`

## TODO:
* WIP