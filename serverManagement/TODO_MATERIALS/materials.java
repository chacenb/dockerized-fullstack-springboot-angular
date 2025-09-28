/* ---------------------------------------------------------------
* A Guide to Mocking With Mockito
* https://dzone.com/articles/a-guide-to-mocking-with-mockito
*
* An example using Mockito
* https://medium.com/javarevisited/getting-started-with-unit-testing-in-spring-boot-bada732a5baa
* */


/* -------------------------------------------------
* Manage transactions with springboot
* https://dev.to/wynnt3o/spring-transactional-rollback-handling-hc8
* */

/* -------------------------------------------------
* Ignoring Fields With the JPA @Transient Annotation
* https://www.baeldung.com/jpa-transient-ignore-field
* */

/* ----------------------------------------------------------
See all java versions installed on linux ?
update-alternatives --config java // After that we will be prompted to select the version to use
*/


/* ----------------------------------------------------------
*  * How to Deploy Spring Boot (2.X or 3.X) Application in Wildfly Application Server (JAKARTA 8- or JAKARTA 10+)
 * link : https://www.mastertheboss.com/jboss-frameworks/spring/spring-boot-hello-world-on-wildfly/
 */


/* -------------------------------------------------------
 * How to install WildFly on Ubuntu 20.04 && Deploy Java Hello World Application on WildFly
 * ***** yt link : https://youtu.be/ULXt-G_-2ws
 * steps document link : https://docs.google.com/document/d/1nDqrJPErhaF6YJEtKuoauEPTv4Mx6ALN/edit
 * steps document also inside materials folder
 * -----------------------------------------------------------------------------
 * How to Deploy Spring Boot Application in Wildfly Application Server
 * url : https://medium.com/swlh/how-to-deploy-spring-boot-application-in-wildfly-application-server-b3670c031ad4
 */


/*
* The <scope> element can take 6 values: compile, provided, runtime, test, system and import.
* url: https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#Dependency_Scope
* */






/*
inside project folder, type "mvn dependency:tree" command to see the project dependency tree structure
 */


/* Logging in springBoot application (Logback & log4j2)
 * link : https://www.youtube.com/playlist?list=PLmCsXDGbJHdhRdnwX3UQE4EcaErBTYqC8
 */


/*
 * Formatting http responses
 * ***** link : https://www.baeldung.com/spring-response-entity
 * "ResponseEntity<T>" Generic type that represents the whole HTTP response: status code, headers, and body.
 * We then use it to fully configure HTTP responses
 */


/*
 * Simple Logging Facade for Java (abbreviated SLF4J) : @Slf4j
 * ****** link ： https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjKoPqc-qr-AhVni_0HHbytBNIQFnoECBEQAw&url=https%3A%2F%2Fwww.baeldung.com%2Fslf4j-with-log4j2-logback&usg=AOvVaw3BCRBgd7A90j-TaUT5-SMP
 * acts as a facade for different logging frameworks (e.g., java.util.logging, logback, Log4j).
 * It offers a generic API, making the logging independent of the actual implementation.
 * This allows for different logging frameworks to coexist.
 */

/*
 * CORS config on a Spring application
 * ***** link : https://howtodoinjava.com/spring-boot2/spring-cors-configuration/
 * 1- LOCAL LEVEL : class or method level
 * -- By using "@CrossOrigin" annotation on controller class (@Controller) or on method, it allows controlling CORS configuration on it”.
 * 2- GLOBAL / APPLICATION LEVEL: define the CORS configuration at the “global level”
 * --  (recommended) Use WebMvcConfigurer Bean by Overriding "addCorsMappings(CorsRegistry registry)" on WebMvcConfigurer bean.
 */
