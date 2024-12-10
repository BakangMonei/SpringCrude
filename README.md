# **Instructions**

The code already includes all the required components to perform CRUD operations for the users table using Spring Boot,
PostgreSQL, and endpoints suitable for testing in Postman.

#### Endpoints for Testing

Here’s a summary of the endpoints for CRUD operations:

##### **1. Create a User**

- **Method:** POST
- **Endpoint:** `http://localhost:8080/api/users`
- **Body (JSON):**
  ```
  {
  "email": "johndoe@example.com",
  "firstname": "John",
  "lastname": "Doe",
  "phonenumber": "1234567890",
  "physicaladdress": "123 Main St"
  }
  ```

##### **2. Retrieve All Users**

- **Method:** GET
- **Endpoint:** `http://localhost:8080/api/users`

##### **3. Retrieve a User by Email**

* **Method**: GET
* **Endpoint**: `http://localhost:8080/api/users/{email}`
* **Example**: `http://localhost:8080/api/users/johndoe@example.com`

##### **4. Update a User**

* **Method**: PUT
* **Endpoint**: `http://localhost:8080/api/users/{email}`
* **Body (JSON):**

    ```{
    "firstname": "John",
    "lastname": "Smith",
    "phonenumber": "0987654321",
    "physicaladdress": "456 Elm St"
    }```

##### **5.Delete a User**

* **Method:** DELETE
* **Endpoint:** `http://localhost:8080/api/users/{email}`
* **Example:** `http://localhost:8080/api/users/johndoe@example.com`
