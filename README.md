 Company Mailer System

This project is a simple company mailer system developed using HTML for front-end, Servlet for back-end, and MySQL for database management. It allows users to send emails within the company.

 Features

- User authentication: Users can log in to the system using their credentials.
- Compose and send emails: Authenticated users can compose emails and send them to other users within the company.
- Inbox management: Users can view received emails in their inbox.
- Simple user interface: The front-end is designed to be user-friendly.

 Technologies Used

- HTML/CSS: For front-end design.
- Servlet: For handling server-side logic.
- MySQL: For database management.
- JDBC: For connecting the application to the MySQL database.

Setup

1. Clone the repository:

    ```
    git clone https://github.com/yourusername/company-mailer.git
    ```

2. Database Setup:

    - Install MySQL if not already installed.
    - Create a new database named `company_mailer`.
    - Import the provided SQL schema file (`company_mailer.sql`) into the `company_mailer` database.

3.IDE Setup:

    - Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, etc.).

4. Configure Database Connection:

    - Open the `db.properties` file located in the `src` directory.
    - Update the database URL, username, and password according to your MySQL setup.

5. Run the Application:

    - Run the project on your IDE. The application will start on the configured server (e.g., Tomcat).
    - Access the application through your web browser at `http://localhost:8080/company-mailer`.

 Usage

1. Login:

    - Navigate to the login page (`/login.html`) and enter your credentials.
    - Upon successful authentication, you will be redirected to the mailbox page.

2. Compose Email:

    - Click on the "Compose" button to compose a new email.
    - Enter the recipient's email address, subject, and message content.
    - Click on the "Send" button to send the email.

3. View Inbox:

    - Click on the "Inbox" link to view received emails.
    - Click on an email to view its details.

4. Logout:

    - Click on the "Logout" button to log out of the system.

