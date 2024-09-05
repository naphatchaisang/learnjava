### Concepts in Spring and Related Technologies

- **Spring**: A powerful, lightweight framework that provides comprehensive infrastructure support for developing Java applications. It simplifies enterprise-level applications through dependency injection and aspect-oriented programming.

- **Spring Boot**: An extension of Spring that simplifies the setup, configuration, and development of Spring applications. It provides embedded servers, auto-configuration, and production-ready features to help create stand-alone, production-grade applications quickly.

- **Maven**: A build automation tool used primarily for Java projects. It manages project dependencies, compiles code, runs tests, and builds JAR or WAR files. It uses a `pom.xml` file to define project structure, dependencies, and build settings.

- **IoC (Inversion of Control)**: A design principle in which the control of object creation and management is transferred to a container or framework, like Spring. It promotes loose coupling and easier testing by managing dependencies automatically.

- **JPA (Java Persistence API)**: A specification for managing relational data in Java applications. JPA provides a way to map Java objects to database tables and manage data using an object-oriented approach, often implemented using frameworks like Hibernate.

- **Dependency Injection**: A core concept in Spring, where the framework automatically provides the required dependencies to a class rather than the class creating them itself. This promotes loose coupling, testability, and maintainability.

- **ResponseEntity**: A Spring class that represents the entire HTTP response, including the status code, headers, and body. It allows full control over the HTTP response sent to the client.

- **Component Scan**: Spring will automatically scan the source code for classes with annotations like `@RestController`, `@Service`, and `@Component`, and register them as Spring beans. This allows the framework to discover and manage components that handle incoming requests and other business logic.



### Annotations

- **@SpringBootApplication**: Combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`. Marks the main class of a Spring Boot application.

- **@ComponentScan**: Scans the specified package for Spring components. Use `excludeFilters` to exclude specific components.

- **@RestController**: Combines `@Controller` and `@ResponseBody`. Handles HTTP requests and returns JSON or XML.

- **@RequestMapping("/path")**: Maps HTTP requests to specific handler methods or classes.

- **@Autowired**: Automatically injects dependencies into Spring-managed components.

- **@PersistenceContext**: Injects an `EntityManager` for database operations with JPA.

### HTTP Method Mapping Annotations

- **@GetMapping("/path/{pathvariable}")**: Maps HTTP GET requests to a handler method.

- **@PostMapping("/path")**: Maps HTTP POST requests to a handler method for creating resources.

- **@PatchMapping("/path")**: Maps HTTP PATCH requests to a handler method for partial updates.

- **@DeleteMapping("/path")**: Maps HTTP DELETE requests to a handler method for deleting resources.

### Parameter Binding Annotations

- **@PathVariable**: Binds a method parameter to a URI template variable.

- **@RequestParam**: Binds a method parameter to a web request parameter (query string).

### Spring Stereotype Annotations

- **@Service**: Indicates that the class is a service component for business logic.

- **@Component**: A generic annotation to denote a class as a Spring-managed component.

- **@Configuration**: Marks the class as a source of Spring bean definitions.

- **@Bean**: Marks a method that returns a Spring bean managed by the container.

- **@Qualifier**: Used to specify which bean to inject when multiple beans of the same type are available in the Spring context. Helps resolve ambiguity in dependency injection.

### JPA and Lombok Annotations

- **@Entity**: Marks a class as a JPA entity mapped to a database table.

- **@Id**: Specifies the primary key of an entity.

- **@Accessors(chain = true)**: (Lombok) Enables chainable setters for fields.

- **@Getter** (Lombok): Automatically generates a getter method for each field in the class. Reduces boilerplate code by avoiding manual creation of getter methods.

- **@Setter** (Lombok): Automatically generates a setter method for each field in the class. Simplifies code by eliminating the need to manually write setter methods.

- **@Table(name = "Store")**: Specifies the table in the database to which the entity class is mapped. The `name` attribute defines the exact table name used in the database.

- **@Column**: Maps a field in an entity class to a column in the database table. Allows customization of column properties like name, length, nullable, etc.

- **@Data**: (Lombok) Combines `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, and `@RequiredArgsConstructor`.

### Additional Recommended Annotations

- **@Controller**: Marks a class as a Spring MVC controller.

- **@Repository**: Marks a class as a DAO (Data Access Object) that interacts with the database.

- **@RequestBody**: Binds the HTTP request body to a method parameter.

- **@ResponseBody**: Indicates that the return value should be written to the HTTP response body.

- **@EnableAutoConfiguration**: Automatically configures Spring beans based on classpath settings.
