## About This Project

Local Music is an idea to create a API and database of music events. The goal is to use this database to notify users of events close to them based off music preference and the users own music library. 

The secondary goal is to design a interface that venues can use to list there events on this database and use this information to show there events on the venues website. 

The users main interaction with the database would be through a mobile app that would pull the users music preference from there choice of music libraries, like Spotify and Apple Music. 

### What Is This Project For

The goal of this project is to allow me the creator to learn more about the full development process. I plan to use this to get a better handle on creating a project from start to finish. I will also focus on learning new concepts and practices. Like setting up testing for my code, and learning the Spring Framework for managing a database.

This project will be used to as an interduction to Spring and the concepts of developing a web app. The project will be set up with some web app access to allow for managment of the updating of the SQL database. This project will also create a customer facing web app for venue owners to be able to take controll of the information stored in the database. Once the web app is complete, the strech goals would be to set up mobile app access to allow users to sync a selected music library to use as a band search function in the database to give the user information about bands that they lisen to and if they are playing nerby. This project will be ever changing, and will be created in an agile manager. My first priority will be to develop a minimally viable product and then add features from that point.

The minimally viable product will be the creation of the web app for venue managment. This means that the system will access the Live Nation api and pull the venue information localed in this database, store it in the LiveMusic data base. One this information is gather then the app will be programed to access the events api from Live Nation and add this information to each venue. The managment web app will show the list of all events and the last time the list was updated. 

This project is also meant to only be used to show my work and ability to learn new concepts and then apply these concepts into a working project.

#### Current Work being done.
- [x] Design classes for holding the information gathered from the Live Nation API
- [x] Design API parser class to use faster JSON parsing 
- [x] Design connection to LiveNation's Java API.
- [ ] Design connection with Java Spring to connect to SQL database.
- [ ] Implement tests to verify that the data is being pulled from the LiveNation API and then being stored in the LiveMusic database. 
- [ ] Refactor Java code after the testing has been setup and completed.
- [ ] Design a simple user interface to be implemented on a smart phone and tablet.
- [ ] Implement user interface design and program a functioning iPhone app.
- [ ] Set up testing for the iPhone application.
- [ ] Implement user interface design and program a functioning Android app.
- [ ] Set up testing for the Android application.
- [ ] Refactor Code as needed once testing is complete.
- [ ] Design a simple user interface to be implemented on a web page to be used to allow venues and update and add events outside of LiveNation API.
- [ ] Implement the web site to allow venue managers to login and add and manage events.
- [ ] Set up testing for the web application.
- [ ] Refactor code as needed.
- [ ] Design a program that will craw the web looking for venues and calendar events that are not apart of the LiveNation database. 
- [ ] Implement web crawler program with Python.
- [ ] Setup tests for the web crawling program.
- [ ] Refactor code as needed.
- [ ] Design web tool for venues to use as a calendar widget to show events on the venues webpage, this information will be used in the overall database to let users know about upcoming events.
- [ ] Implement web widget.
- [ ] Setup tests for web widget.
- [ ] Refactor code as needed. 
- [ ] Evaluate project in its current state to see if other functions or applications could be added to make the user experience better. 

