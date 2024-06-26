# Monopoly Game

Monopoly Game is a simple board game simulation written in Java. The game consists of players moving pieces on a board based on dice rolls. The objective is to demonstrate object-oriented programming principles, including dependency injection, encapsulation, and modular design.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Classes](#classes)
- [License](#license)

## Installation

To run this project, you need to have Java installed on your machine. You can download and install Java from the [official website](https://www.oracle.com/java/technologies/javase-downloads.html).

1. Clone the repository:
   ```sh
   git clone https://github.com/ThanawatPtd/UML_diagramToOOP.git
   ```
2. Navigate to the project directory:
   ```sh
   cd MGame
   ```

## Usage

To run the game, compile the Java files and execute the `Main` class:

1. Compile the code:
   ```sh
   javac Main.java Board.java Die.java MGame.java Player.java Square.java Piece.java
   ```
2. Run the game:
   ```sh
   java Main
   ```

You will see output indicating the positions of the players' pieces on the board after each round.

## Classes

### Main

The `Main` class contains the `main` method which initializes the game with players and starts the game.

### Board

The `Board` class represents the game board. It contains a list of `Square` objects and methods to create squares and retrieve a square based on the current location and dice roll.

### Die

The `Die` class simulates a six-sided die with methods to roll the die and get the face value.

### MGame

The `MGame` class manages the game flow, including player turns and rounds. It initializes the game with players, dice, and the board.

### Player

The `Player` class represents a player in the game. Each player has a name, a piece, and methods to take a turn, set the board, and set the dice.

### Square

The `Square` class represents a square on the board. Each square has a name.

### Piece

The `Piece` class represents a game piece on the board. It has methods to get and set its location on the board.
