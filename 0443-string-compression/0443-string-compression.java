class Solution {
        public int compress(char[] chars) {
                int n = chars.length;
                        int index = 0; // position to write
                                int i = 0;

                                        while (i < n) {
                                                    char currentChar = chars[i];
                                                                int count = 0;

                                                                            // count occurrences of currentChar
                                                                                        while (i < n && chars[i] == currentChar) {
                                                                                                        i++;
                                                                                                                        count++;
                                                                                                                                    }

                                                                                                                                                // write the character
                                                                                                                                                            chars[index++] = currentChar;

                                                                                                                                                                        // write the count if > 1
                                                                                                                                                                                    if (count > 1) {
                                                                                                                                                                                                    for (char c : String.valueOf(count).toCharArray()) {
                                                                                                                                                                                                                        chars[index++] = c;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                    return index; // length of compressed array
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        
