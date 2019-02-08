# HMCTS health library

[![Build Status](https://travis-ci.com/hmcts/health-spring-boot-starter.svg?branch=master)](https://travis-ci.com/hmcts/health-spring-boot-starter)
[ ![Download](https://api.bintray.com/packages/hmcts/hmcts-maven/health-spring-boot-starter/images/download.svg) ](https://bintray.com/hmcts/hmcts-maven/health-spring-boot-starter/_latestVersion)

This is a Spring Boot _starter_ library whose purpose is to autoconfigure any custom HMCTS actuator health endpoints.
Currently this library contains only the liveness _NOP_ health check needed for Kubernetes to properly operate without restarting the pod. 
The intention for this library is for any extra organisationally customised health to be implemented here and auto-configured for the projects.
 
Currently this module automatically adds the liveness health detail item which then can be access via `[managment]/health/liveness`
Where:
- `[managment]` is where the actuator endpoints are configured. Typically in HMCTS we configure it to `/`
 
## Usage
Super simple just like all Spring boot starters just include the module into the dependency list.
```groovy
 compile 'uk.gov.hmcts.reform:health-spring-boot-starter:x.x.x'
```
To make sure the health checks fit into the HMCTS standard we need to add this yaml snippet to the application.yaml
```yaml
management:
  endpoint:
    health:
      show-details: "always"
  endpoints:
    web:
      base-path: "/"
```

### Prerequisites

- [JDK 8](https://www.oracle.com/java)


## Building

The project uses [Gradle](https://gradle.org) as a build tool but you don't have install it locally since there is a
`./gradlew` wrapper script.  

To build project please execute the following command:

```bash
./gradlew build
```

## Developing

### Coding style tests

To run all checks (including unit tests) please execute the following command:

```bash
./gradlew check
```

## Versioning

We use [SemVer](http://semver.org/) for versioning.
For the versions available, see the tags on this repository.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
