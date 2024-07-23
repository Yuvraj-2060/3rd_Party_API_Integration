# 3rd_Party_API_Integration

![image](https://github.com/user-attachments/assets/2721ed8a-f6d0-4963-a65a-52e989b3397d)


# Loan Account API

This project is a Spring Boot application for managing loan accounts, integrating with an external API, persisting data to an H2 database, and exposing a new API endpoint.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This Spring Boot application is designed to manage loan accounts. It integrates with an external API, stores data in an H2 in-memory database, and provides various endpoints to interact with the loan account data.

## Features

- Integrate with an external API to fetch loan details
- Persist loan data to an H2 in-memory database
- Expose RESTful endpoints for managing loan accounts
- Calculate total dues and next due dates for loan accounts

## Technologies Used

- Java
- Spring Boot
- Lombok
- H2 Database
- Maven

## Prerequisites

- Java 17 or later
- Maven 3.8.1 or later

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/loan-account-api.git
   cd loan-account-api

