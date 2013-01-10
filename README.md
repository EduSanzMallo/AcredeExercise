AcredeExercise
==============
Create Registration Form 

Imagine that you are part of a team that is creating a new library from scratch to capture user registration details and store them in a repository. 

The library is intended to be consumed by different front-end applications (including web).
1.  Requirements

•	We need to capture and the following user details:
•	Username
•	PostCode
•	Email Address
•	Please see the table below for the email business rules:
Domain	Allowed Email Addresses

com-en (English)	.org.uk, co.uk, .biz

Com-br (Brazil)	.org.br, .info

com-es (Spanish)	.miapuesta-es, .vistabet

•	The repository to store user data is an xml data store that will be replaced in the next 6 – 12 months by a database.Therefore we should be able to seamlessly switch from one data source to another at some point in the future.  Please take this into account when designing the solution. (In case you find XML tough you can use HSQL)
•	You may wish to implement a front-end design of your choice.
•	The application needs to be well-architected, robust, scalable and secure. 

2.	Note

We value quality over quantity - this is intended to be a gauge of your development approach, so prioritise carefully.

Unit test cases are mandatory.

Solution
========
This exercise is to create a registration form and the data will save in a xml file that will be exposed by SOAP so that third-party applications can consummed it.
- First of all, I create a domain class called User with its fields and validations.
- I create a controller (UserController) with its CRUD operations and build its views with scaffolding. The main operation is 'create'.
- In the create view I create a form to type the user data and save them in the memory-database.
- I create a service to list all user instances and build xml file to exposed by SOAP with the CXF plugin.
  To check the wsdl where the operations and attributes are exposed -> http://localhost:8080/acrede/services/user?wsdl 
  To check the xml file generated -> http://localhost:8080/acrede/services/user/getUsers 

