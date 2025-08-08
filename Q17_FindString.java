// Write a program to find a string in a text file in Java


boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
    
    // Create a File object using the provided file path
    File file = new File(filePath);

    // Create a Scanner object to read the file
    // This will throw FileNotFoundException if the file doesn't exist
    Scanner scanner = new Scanner(file);

    // Read the file line by line
    while (scanner.hasNextLine()) {
        // Read the next line from the file
        String line = scanner.nextLine();

        // Check if the current line contains the target string
        if (line.contains(str)) {
            // Close the scanner to free up resources
            scanner.close();
            
            // Return true as the string was found
            return true;
        }
    }

    // Close the scanner after finishing reading all lines
    scanner.close();

    // Return false if the string was not found in any line
    return false;
}
