# Blogging Application(Backend)

This is a blogging application project that provides a platform for users to create, read, update, and delete blog posts.

## Features

- User authentication: Users can create an account, log in, and manage their profile.
- Blog management: Users can create, read, update, and delete their own blog posts.
- Comment system: Users can comment on blog posts.
- Search functionality: Users can search for blog posts based on keywords or categories.
- Pagination: The application supports pagination to handle a large number of blog posts.
- RESTful API: The backend provides a set of APIs for interacting with the application.

## Technologies Used

- Programming Language: Java
- Framework: Spring Boot
- Database: MySQL
- Object-Relational Mapping (ORM): Hibernate
- API Documentation: Swagger UI

## Installation

To run the blogging application locally, follow these steps:

1. Clone the repository: git clone https://github.com/Yatin-Git/blog-app-apis.git

2. Configure the database:

   - Install MySQL if not already installed.
   - Create a new database named `blog_app`.
   - Update the database configuration in `src/main/resources/application.properties` with your database credentials.

3. Build the application: cd project-directory mvn clean install

4. Run the application: mvn spring-boot:run

The following API endpoints are available:

- `/api/auth`: Authentication-related endpoints for user registration, login, and logout.
- `/api/users`: Endpoints for managing users.
- `/api/blogs`: Endpoints for managing blog posts.
- `/api/comments`: Endpoints for managing comments on blog posts.

For detailed information about each endpoint and the required parameters, refer to the [Swagger UI documentation](http://blogapp-env.eba-c8sptexp.ap-south-1.elasticbeanstalk.com/swagger-ui/index.html) of the application.

## Contributing

Contributions to the blogging application project are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request on the [GitHub repository](https://github.com/Yatin-Git/blog-app-apis).

## License

This project is licensed under the [MIT License](https://github.com/Yatin-Git


