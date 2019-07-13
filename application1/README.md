# Application 1

Full Eclipse WTP Multiproject working
* Application1 Core -> *JAR project*
* Application1 Web -> *WAR project (that uses the core jar)*

# Eclipse
`./gradlew clean cleanEclipse eclipse`

Now you can import the project into Eclipse IDE.

# Build
`./gradlew clean build publishToMavenLocal -si`

Check: ${user.dir}.m2/reposity/com/app1

# Access
http://localhost:8080/application1