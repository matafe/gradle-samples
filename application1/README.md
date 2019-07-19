# Application 1

Full Eclipse WTP Multiproject working
* Application1 Core -> *JAR project*
* Application1 Web -> *WAR project (that uses the core jar)*

# Eclipse

`./gradlew dev`

Now you can import the project into Eclipse IDE.

# Full build and Local Publish
`./gradlew`

Check the default task for this build.

Check: ${user.dir}.m2/reposity/com/matafe/application1

# Access
http://localhost:8080/application1