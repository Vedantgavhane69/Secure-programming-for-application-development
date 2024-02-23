Secure Application Development Report
This is the project report for the Continuous Assessment 2 (CA2) assignment in the Secure Programming for Application Development module during my MS in Cybersecurity program at National College of Ireland.

Report Contents
The report covers application security testing performed on a library management system application written in Java with a MySQL database. Main topics include:

State of the Art

** Overview of latest programming paradigms like imperative, declarative, parallel, etc.
- Evolution of Java security across versions
- Security aspects of MySQL
- Security Testing Techniques

** Current state of application security testing methodologies
- Integration of security in SDLC
- Types of testing like SAST, DAST, etc.
- Application Security Testing

** Testing of library app using open source tools like SonarLint, VCG, Codacy 
- Manual code review to find SQL injection, hardcoded passwords, etc.
- Suggested fixes using Java security libraries

** Performed Penetration Testing and found some critical vulnerabilities
- SQL injection
- Accepting older date formats
- Hard coded password found in DB.java
- Improper input validation found in login page
- Saving password in plaintext 

** Proposed a solution to fix these vulnerabilities 
