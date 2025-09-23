class Solution {
  // Main method to compare two version numbers
  public int compareVersion(String version1, String version2) {

    
    final String[] levels1 = version1.split("\\.");
    final String[] levels2 = version2.split("\\.");

    // Split both version strings by '.' into arrays of version segments
    // This ensures we can compare all segments, including trailing zeros
    final int length = Math.max(levels1.length, levels2.length);

    // Loop through each segment index
    for (int i = 0; i < length; ++i) {
      // Parse the segment at index i for version1, or use 0 if out of bounds
      final Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;

      // Parse the segment at index i for version2, or use 0 if out of bounds
      final Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;

      // Compare the two version segments
      final int compare = v1.compareTo(v2);

      // If segments are not equal, return the comparison result
      if (compare != 0)
        return compare;
    }

    // All segments are equal
    return 0;
  }
}

