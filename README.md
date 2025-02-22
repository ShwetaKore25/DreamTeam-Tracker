# DreamTeam-Tracker

DreamTeam-Tracker is a powerful IPL player management system that allows users to efficiently manage and track player statistics such as runs, wickets, and team affiliation. Built using JDBC and MySQL, this system provides an intuitive interface to interact with data, including adding, updating, deleting, and retrieving player information. This system is designed for cricket enthusiasts, analysts, and team managers who want to keep track of player performance and other important statistics.

## Table of Contents

serial_no ->(PK)

jn ->(Jersey NO)

name ->(Player Name)

runs ->(player Runs)

wickets ->(Player Wickets)

tname ->(Player IPL Team)

## Project Structure

DreamTeam-Tracker/

├── com.shwetu.client/

│ └── IPL_Client.java

├── com.shwetu.controller/

│ └── IPLController.java

├── com.shwetu.dao/

│ └── IPL_Dao.java

├── com.shwetu.entity/

│ └── Player.java

├── com.shwetu.service/

│ └── IPL_Service.java

├── com.shwetu.utility/

│ └── IPLUtility.java

└── README.md

## Project Overview

DreamTeam-Tracker enables the tracking of IPL (Indian Premier League) player statistics such as runs, wickets, and team affiliations. The system is built on top of a relational database (MySQL), using JDBC for seamless integration between the application and the database. Users can manage player data, view player profiles, and perform various analyses.

## Features

Manage Player Data: Add, update, delete, and retrieve player information.

Team-based Filtering: View players from specific teams (e.g., CSK, MI, RCB).

Statistical Queries: Run queries to calculate player statistics such as total runs and wickets, or identify top performers.

CRUD Operations: Full support for Create, Read, Update, and Delete operations on player data.

Interactive Reports: Generate detailed reports for individual players or teams.

## Technologies Used

Java (JDBC): Used to handle the interaction between the application and the MySQL database.

MySQL: Relational database management system to store player data.

MySQL Workbench: For querying and managing the MySQL database.

Eclipse/IntelliJ IDEA: Integrated Development Environment (IDE) for development.
