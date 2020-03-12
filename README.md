# quarkus-kt-gradle-multiproject
Demonstration of bug with kotlin multiproject using quarkus 1.2.1.Final

## Steps to reproduce the issue 
* Remove the comment in application/build.gradle file at line 
`implementation(project(":core"))`

* Run `gradlew quarkusDev`

