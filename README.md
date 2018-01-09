# spring-boot-basic-authentication
Simple Spring Security Basic Authentication Application

## Usage

Test the `public` endpoint:

```sh
curl http://localhost:8080/public
```
Response:
```sh
Hello Public!
```


Test the `private` endpoint without authentication:

```sh
curl http://localhost:8080/private
```
You receive the following response, which indicates you are not authorized to access the resource:
```sh
HTTP Status 401 - Full authentication is required to access this resource
```


Test the `private` endpoint with user authentication:

```sh
curl -u user:password http://localhost:8080/private
```
Response:
```sh
Hello Private!
```


Test the `private` endpoint with wrong user authentication:

```sh
curl -u user:wrongpassword http://localhost:8080/private
```
You receive the following response, which indicates you are not authorized to access the resource:
```sh
HTTP Status 401 - Bad credentials
```
