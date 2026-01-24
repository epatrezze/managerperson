<h2>Digital Innovation: Expert class - Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

This project is a Person Management System built with Spring Boot. It provides a RESTful API for managing person records with CRUD operations.

## Features

- **Create, Read, Update, Delete (CRUD)** operations for person entities
- **RESTful API** design following best practices
- **Data validation** using Bean Validation
- **Exception handling** with custom exceptions
- **DTO pattern** for data transfer objects
- **Entity mapping** using MapStruct
- **JPA/Hibernate** for database persistence
- **Proper documentation** with standardized comments and headers

## Architecture

The application follows a layered architecture:

- **Controller Layer**: Handles HTTP requests and responses
- **Service Layer**: Contains business logic
- **Repository Layer**: Manages data persistence
- **Entity Layer**: Represents domain models
- **DTO Layer**: Transfers data between layers

## Technologies Used

- **Java 8+**
- **Spring Boot 2.x**
- **Spring Web MVC**
- **Spring Data JPA**
- **Hibernate**
- **MapStruct** for object mapping
- **Lombok** for boilerplate code reduction
- **Maven** for dependency management

## Improvements Made

The following improvements and refactorings have been implemented:

- **Standardized Documentation**: Added comprehensive JavaDoc comments to all classes and methods with clear descriptions of purpose, parameters, and return values
- **Class Headers**: Added consistent header comments to all classes with author, version, and creation date information
- **Method Documentation**: Enhanced method comments to clearly specify what each method does, what parameters it receives, and what it returns
- **Code Readability**: Improved overall code readability through consistent formatting and descriptive comments
- **Maintainability**: Enhanced code maintainability by providing clear documentation for future developers

## Endpoints

The API provides the following endpoints:

- `POST /api/v1/people` - Create a new person
- `GET /api/v1/people` - Retrieve all people
- `GET /api/v1/people/{id}` - Retrieve a person by ID
- `PUT /api/v1/people/{id}` - Update a person by ID
- `DELETE /api/v1/people/{id}` - Delete a person by ID

## Running the Application

To run the project in your terminal, execute the following command:

```shell script
mvn spring-boot:run 
```

After running the above command, open the following address in your browser to access the API:

```
http://localhost:8080/api/v1/people
```

## Usage Examples

### Creating a Person

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "cpf": "12345678901",
  "birthDate": "1990-01-01",
  "phones": [
    {
      "type": "MOBILE",
      "number": "(11) 99999-9999"
    }
  ]
}
```

## Testing

The application includes unit tests to validate functionality (tests would be located in the src/test/java directory).

## Deployment

The system can be deployed to cloud platforms like Heroku.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.

## License

This project is licensed under the terms specified by Digital Innovation One.