# graphql-example
# 📘 Spring Boot GraphQL Example

This is a simple GraphQL API built with Spring Boot. It demonstrates how to define types, queries, and mutations using a basic `Book` and `Author` model.

---

## 🚀 Technologies Used

- Java 21
- Spring Boot 3.x
- GraphQL Java
- Spring GraphQL Starter
- Maven

---

## 📁 Project Structure
```
src/
├── main/
│ ├── java/com/example/graphql/
│ │ ├── model/
│ │ ├── service/
│ │ ├── resolver/
│ │ └── GraphqlExampleApplication.java
│ └── resources/
│ ├── application.yml
│ └── graphql/
│ └── schema.graphqls
```


## ⚙️ Setup Instructions

1. **Clone the repo**

```bash
   git clone https://github.com/shreyamahalle/spring-boot-graphql-example.git
   cd spring-boot-graphql-example
```
2. **Run the application**
   ```
   ./mvnw spring-boot:run
   ```
3. **Access GraphiQL UI**
    Open in browser:
  ```
   http://localhost:8080/graphiql
  ```
📑 GraphQL Schema (schema.graphqls)
```
type Query {
  bookById(id: ID): Book
}

type Book {
  id: ID
  name: String
  pageCount: Int
  author: Author
}

type Author {
  id: ID
  firstName: String
  lastName: String
}
```
 Example Queries
 ```
 query {
  bookById(id: "1") {
    id
    name
    pageCount
    author {
      firstName
      lastName
    }
  }
}
```
