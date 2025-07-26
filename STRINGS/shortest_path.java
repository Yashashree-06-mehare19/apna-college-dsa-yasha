import java.util.Scanner;

public class shortest_path {
     public static double getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        // Calculate the shortest distance from (0,0) to (x,y)
        return Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path (e.g. NNEESW): ");
        String path = sc.nextLine().toUpperCase(); // convert to uppercase just in case

        double shortestPath = getShortestPath(path);
        System.out.printf("Shortest distance from origin: %.2f\n", shortestPath);
sc.close();
        
    }
    
}
