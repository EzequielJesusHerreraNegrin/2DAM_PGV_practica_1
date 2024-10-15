# 2DAM_PGV_practica_1

# Program to Calculate BMI (Body Mass Index) Using Processes to Read and Create Files

This Java program is designed to calculate the Body Mass Index (BMI) of multiple individuals using separate processes. It reads input data from a text file, processes the data to calculate the BMI for each person, and then writes the results into another text file. The program's structure is organized into various packages and classes:

- **operations.java**: Contains the logic for performing BMI calculations.
- **fileManager.java**: Manages reading from and writing to text files, handling input and output operations.
- **processLauncher.java**: Manages the execution of processes, potentially handling the distribution of tasks for BMI calculations.
- **App.java**: Likely serves as the main entry point for the application, coordinating the flow of reading data, processing it, and writing results.
- **input.txt**: The input file where data (e.g., height, weight) for multiple people is stored.

### Warning: Before Start, Create the Following Folders in the root of the directory.
- **output/errorFiles & output/resultFiles**: Directories where output files are stored. `resultFiles` would contain the BMI results, while `errorFiles` may store logs or errors encountered during processing.

Overall, this program streamlines the calculation of BMI for multiple people by reading data from a file, processing it using distributed tasks, and saving the results to a separate output file.




