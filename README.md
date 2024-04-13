# Consulting the FIPE table

## About The Project
Application to consult the average value of vehicles (cars, motorcycles or trucks) according to the FIPE table.

## Usage
- The objective of the project is to have a flow similar to what is done on the website, but with some improvements.
- The project was developed in Spring with command line, using the Scanner class to interact with the user via the terminal.
- The user need to enter the type of vehicle desired (car, truck or motorcycle).
- Once this is done, we will list all the brands of that type of vehicle, asking the user to choose a brand using the code.
- After this choice, we will list all vehicle models of that brand.
- The user need to type an excerpt from the model they want to view.
- The application will only list models that have the word typed in their name.
- User will choose a specific model using the code and, unlike the website, we will already list the evaluations for ALL available years of that model.

## Built With
- Spring Boot 3.2.4
- Java 17
- FIPE alt API [link](https://deividfortuna.github.io/fipe/)
- Jackson Object Mapper
