# Name Sorter

## Description
This project sorts a list of names by last name and then by given names. It reads names from an input file, sorts them, prints the sorted list to the screen, and writes the sorted list to an output file.

## Installation Instructions
1. Clone the repository:
    ```bash
    git clone https://github.com/judejulius/sortingList.git
    cd sortingList
    ```

2. Install Maven if it is not already installed. Follow the instructions at [Maven Installation Guide](https://maven.apache.org/install.html).

## Usage
1. Build the project using Maven:
    ```bash
    mvn clean package
    ```

2. Run the Name Sorter:
    ```bash
    java -jar target/name-sorter-1.0-SNAPSHOT.jar unsorted-names-list.txt
    ```

or
### Unix/Linux/MacOS
1. Run in terminal within directory
   ```bash
   ./name-sorter.sh unsorted-names-list.txt or name-sorter ./unsorted-names-list.txt
### Windows
1. Run in terminal within directory
   ```bash
   name-sorter ./unsorted-names-list.txt
   ```
### Test

1. To run test run the following command in terminal:
    ```bash
     mvn test
    ```


## Example
1. unsorted-names-list.txt containing:
    ```bash
        Janet Parsons
        Vaugh Lewis
        Adonis Julius Archer
        Shelby Nathan Yoder
        Marin Alvarez
        London Lindsey
        Beau Tristan Bentley
        Leo Gardner
        Hunter Uriah Mathew Clarke
        Mikayla Lopez
        Frankie Conner Ritter
    ```
## Output
1. sorted-names-list containing:
    ```bash
        Marin Alvarez
        Adonis Julius Archer
        Beau Tristan Bentley
        Hunter Uriah Mathew Clarke
        Leo Gardner
        Vaugh Lewis
        London Lindsey
        Mikayla Lopez
        Janet Parsons
        Frankie Conner Ritter
        Shelby Nathan Yoder
     ```
# Travis Cl
1. Added .travis.yml file:
    [![Build Status](https://app.travis-ci.com/judejulius/sortingList.svg?branch=master)](https://app.travis-ci.com/judejulius/sortingList)

