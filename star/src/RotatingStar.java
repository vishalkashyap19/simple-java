public class RotatingStar {
    public static void main(String[] args) throws InterruptedException {
        // Define the positions for the star in a circular pattern
        String[] positions = {
                "    *    ",  // Top
                "   *     ",  // Top-right
                "        *",  // Right
                "       * ",  // Bottom-right
                "    *    ",  // Bottom
                " *       ",  // Bottom-left
                "*        ",  // Left
                "     *   "   // Top-left
        };

        // Infinite loop to animate the rotation
        while (true) {
            for (String position : positions) {
                // Clear the console (use an ANSI escape sequence for most systems)
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Print the star in the current position
                System.out.println(position);

                // Wait for 200 milliseconds (adjust for speed)
                Thread.sleep(200);
            }
        }
    }
}

