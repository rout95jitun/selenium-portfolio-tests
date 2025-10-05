# Selenium Portfolio Tests (Java + TestNG)

Simple Selenium automation project for testing a public demo portfolio website:
[https://vcard-react.vercel.app/](https://vcard-react.vercel.app/)

## Features Tested
- Verify page title
- Navigate to "About" section
- Check presence of Contact form fields

## Tools & Dependencies
- Java 17+ (or 11+)
- Maven
- Selenium 4.x
- TestNG 7.x
- ChromeDriver

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/selenium-portfolio-tests.git
   cd selenium-portfolio-tests
   mvn clean install
   mvn test
