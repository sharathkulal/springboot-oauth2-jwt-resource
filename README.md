# springboot-oauth2-jwt-resource
springboot oauth2 jwt resource

run springboot fat jar using:
java SpringBoot-OAuth2-JWT-Resource.jar

default port: 8080
default jwt signing key: secretkey

you can specify port and/or jwt signing key using:
java SpringBoot-OAuth2-JWT-Resource.jar --port=9000 --jwtkey=secret

the two endpoint are
GET /simple - does not use any authemntication and just returns "Hello World!"
GET /secure - uses authentication (scope:read). if successful, returns "Hello World! Secure"

dependencies:
you need oauth2 server jar to get the accesstoken which you can use against this resource.
oauth2 server jar is at: https://github.com/sharathkulal/springboot-oauth2-jwt
