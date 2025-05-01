# Java-Mail-Sender
The Java Mail Sender project allows you to send emails using Spring Boot and JavaMailSender. The app can send simple text emails as well as emails with attachments (such as images). Email settings are configured using Spring Boot properties, making it easy to send emails over SMTP using Gmail.

#Features:

Send simple text emails.

Send emails with attachments (such as images).

Integrates with Gmail using SMTP.

Based on Spring Boot for easy configuration and flexibility.

---


## How to Run the Application:

### Set Up Spring Boot:

1. **Clone or download the project from GitHub**:
   ```bash
   git clone https://github.com/your-repo/Java_Mail_Sender.git
   ```

### Configure the Application:

1. **Open the project in your IDE** (e.g., IntelliJ IDEA or Eclipse).

2. **Make sure you have Java 11 or higher installed**.

3. **Add the email configuration settings** to the `application.properties` file:
   ```properties
   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=your-email@gmail.com
   spring.mail.password=your-app-password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```

### Run the Application:

You can run the application using Maven or from your IDE:

```bash
mvn spring-boot:run
```

---

## How to Create an App Password in Gmail:

### Enable Two-Factor Authentication (2FA):

1. Go to [Google Account Security Settings](https://myaccount.google.com/security).
2. Under **"Signing in to Google,"** ensure **Two-Step Verification** is enabled.

### Create an App Password:

1. After enabling 2FA, go to the [App Passwords page](https://myaccount.google.com/apppasswords).
2. Select **"Mail"** as the app and **"Windows"** (or **"Custom App"**) as the device.
3. Click **Generate** and copy the generated 16-character password.

### Use the App Password:

1. Replace your regular email password in the `application.properties` file with the newly generated **app password**.
---
