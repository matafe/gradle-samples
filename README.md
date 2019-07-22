# gradle-samples

Some gradle examples...

* [Application 1](application1/README.md) - Full Eclipse WTP Multiproject (core + web) working.
* [Application 2](application2/README.md) - Eclipse WTP (web) using gradle composite build.
    * If application 2 exists on the same folder as application 1 a WTP project dependency is setup and you can use the project inside eclipse with your Server. (Hot Deployment Application 1 code changes)
    * If not application 2 will depends on the published specific version from application 1.