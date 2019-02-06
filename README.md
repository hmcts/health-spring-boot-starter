# HMCTS health library

[![Build Status](https://travis-ci.com/hmcts/health-springboot-starter.svg?branch=master)](https://travis-ci.com/hmcts/health-springboot-starter)
[ ![Download](https://api.bintray.com/packages/hmcts/hmcts-maven/health-springboot-starter/images/download.svg) ](https://bintray.com/hmcts/hmcts-maven/health-springboot-starter/_latestVersion)

This library is the autoconfiguration library for the globally health endpoints needed for 

## Getting started

### Prerequisites

- [JDK 8](https://www.oracle.com/java)

## Usage

Components provided by this library will get automatically configured in a Spring context if `idam.api.url` configuration property is defined and does not equal `false`. 

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
