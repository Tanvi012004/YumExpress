🍽️ YumExpress – Desktop-Based Restaurant & Food Delivery Management System:

YumExpress is a Java-based desktop application designed to streamline restaurant and food delivery management.
Built using Java GUI (Swing) for the frontend and Oracle Database for the backend, YumExpress offers a powerful, user-friendly platform for both restaurant owners and customers.

🚀 Key Features
- Restaurant Registration: Restaurant owners can register their business on YumExpress and manage their profile.
- Product Management: Add and manage food items, prices, and product images.
- Delivery Staff Management: Add delivery personnel with contact details for order assignment.
- Customer Portal: Customers can register, log in, browse menus, and add items to their cart.
- Order Placement: Customers can place orders with automatic email confirmation.
- Email Integration: On successful order placement, an email is sent to the customer with: 1. OTP for order verification
                                                                                           2. Assigned delivery staff name and contact number
                                                                                           3. Order summary including food item details
  
                                                                                         

🧩 Technologies Used

- Layer	Technology
- Frontend	Java Swing (GUI)
- Backend	Oracle Database
- APIs	Mail API (JavaMail), Food API
- Java JDK	JDK 1.8
- Libraries	Activation, Commons-Codec, HttpClient, JSON, OJDBC, Unirest, and more
- 
Prerequisites:
- Java JDK 1.8+
- NetBeans IDE (or any Java IDE)
- Oracle Database
- All JAR files (already included in lib/ folder)

JAR Dependencies:

These are stored inside the lib/ folder:
1. activation-1.1.1.jar
2. commons-codec-1.6.jar
3. commons-logging-1.1.3.jar
4. commons-validator-1.7.jar
5. httpasyncclient-4.0.2.jar
6. httpclient-4.3.6.jar
7. httpcore-4.3.3.jar
8. httpcore-nio-4.3.2.jar
9. httpmime-4.3.6.jar
10. javax.mail-1.6.2.jar
11. json-20140107.jar
12. ojdbc6.jar
13. unirest-java-1.4.7.jar
Ensure NetBeans is set to include these JARs in the project libraries.

🧩 Notes:
Use Oracle/MySQL VARCHAR and BLOB types appropriately depending on your DBMS.
Default password fields are stored as plain text—consider encrypting in a real-world scenario.
Foreign key relationships must be properly defined during table creation.
