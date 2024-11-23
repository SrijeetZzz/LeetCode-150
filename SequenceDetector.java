public class SequenceDetector {
    private int state;

    public SequenceDetector() {
        this.state = 0;  // Initial state is 0
    }

    public void reset() {
        this.state = 0;  // Reset state after each detection
    }

    public String detectSequence(String[][] input) {
        StringBuilder result = new StringBuilder();

        // Iterate through the pairs
        for (String[] pair : input) {
            char first = pair[0].charAt(0);  // First character of the pair
            char second = pair[1].charAt(0); // Second character of the pair

            // Detect "abc" sequence
            if (state == 0) {
                if (first == 'a') {
                    state = 1;  // Transition to state 1 on 'a'
                }
            } else if (state == 1) {
                if (second == 'b') {
                    state = 2;  // Transition to state 2 on 'b'
                } else if (first == 'a') {
                    state = 1;  // Stay in state 1 if 'a' repeats
                } else {
                    reset();  // Reset if sequence is broken
                }
            } else if (state == 2) {
                if (second == 'c') {
                    result.append("1");  // Detected "abc", append 1
                    reset();  // Reset after detection
                    continue;  // Skip appending 0
                } else {
                    reset();  // Reset if the sequence is broken
                }
            }

            // If no sequence detected, append 0
            if (result.length() == 0 || result.charAt(result.length() - 1) != '1') {
                result.append("0");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SequenceDetector detector = new SequenceDetector();

        // Input format: {Character1, Character2}
        String[][] input = {
            {"a", "b"},
            {"a", "a"},
            {"b", "a"},
            {"b", "c"},
            {"c", "c"},
            {"d", "a"},
            {"d", "b"},
            {"c", "d"}
        };

        String output = detector.detectSequence(input);
        System.out.println(output);  // Expected output: 1101
    }
}
