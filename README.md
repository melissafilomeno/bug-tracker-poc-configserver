# About

This project is a config server for bug-tracking application (WIP).


# Getting Started


Pre-requisites :
* Java 17.0.12
* Maven 3.9.8
* Postman 11.19.0

Setup :
* Clone config repos (bug-tracker-poc-config and bug-tracker-poc-config-perf)
* Create .env file with the following :
  - ENCRYPT_KEY
  - CLOUD_CONFIG_USER
  - CLOUD_CONFIG_PASS
  - USER_NAME (your github username)
* Setup config repos (bug-tracker-poc-config and bug-tracker-poc-config-perf)

Run :
* Run `mvn clean install`
* Run `mvn spring-boot:run`


Verification :
* Import environment and postman_collection (not management) under postman/, select 'local' environment, set 'current value' from 'initial value', run the collection and verify
