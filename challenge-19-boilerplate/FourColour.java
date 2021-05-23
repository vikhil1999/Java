import java.util.*;
 
public class FourColour {
    private static Scanner o;
    private static int N;
    private static String[] regions;
    private static int[][] neighbours;
    private static String colors[] = {"Blue","Red","Green", "Black", "Yellow"};
 
    private static int[] assignedColors;
    private static int COLOR_SIZE = 4;
 
    public static void main(String[] args) {
        o = new Scanner(System.in);
 
        Regiondetails();
        int index = 0;
        int totalColorsUsed = Color(index);
        
        if(totalColorsUsed != 0){
            System.out.println("Total number of colors used: " + totalColorsUsed);
 
            System.out.println("The color for each region are as follows:");
 
            for(int i = 0; i < N; i += 1){
                System.out.print(regions[i] + " (" + colors[assignedColors[i]] + ") " + "-> ");
                for(int j = 0; j < neighbours[i].length; j += 1){
                    System.out.print(regions[neighbours[i][j]] + " (" + colors[assignedColors[neighbours[i][j]]] + ") ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Regions can not be coloured with " + COLOR_SIZE + " colors.");
        }
    }
 
   
 
 public static void Regiondetails(){
        System.out.println("Enter number of regions: ");
        N = o.nextInt();
        
        neighbours = new int[N][];
        regions = new String[N];
 
        System.out.println("Enter the names of " + N + " regions:");
        for(int i = 0; i < N; i += 1){
            regions[i] = o.next();
        }
 
        System.out.println(N + " regions with assigned Region Numbers are: ");
        for(int i = 0; i < N; i += 1){
            System.out.println(i + " " + regions[i]);
        }
 
        for(int i = 0; i < N; i += 1){
            System.out.println("Enter the number of neighbours of '" + regions[i] + "' region:");
            int K = o.nextInt();
            neighbours[i] = new int[K];
 
            System.out.println("Enter the neighbours of " + regions[i] + " region. Provide region number:");
            for(int j = 0; j < K; j += 1){
                int H = o.nextInt();
                neighbours[i][j] = H;
            }
        }
        System.out.println("There are 8 regions in the map: ");
        for(int i = 0; i < N; i += 1){
            System.out.print(regions[i] + " ");
        }
        System.out.println();
 
        System.out.println("The neighbouring regions for each region are as follows:");
 
        for(int i = 0; i < N; i += 1){
            System.out.print(regions[i] + " -> ");
            for(int j = 0; j < neighbours[i].length; j += 1){
                System.out.print(regions[neighbours[i][j]] + " ");
            }
            System.out.println();
 
 
        }
    }
    public static int Color(int index)
    {
        assignedColors = new int[N];
        Arrays.fill(assignedColors, -1);
 
 
        if(helperColorMap(index) == false){
            return 0;
        }
 
        boolean[] availableColors = new boolean[5];
        Arrays.fill(availableColors, true);
 
        int totalColorsUsed = 0;
        for(int i = 0; i < N; i += 1){
            System.out.println(i + ": " + assignedColors[i]);
            availableColors[assignedColors[i]] = false;
        }
 
        for(int i = 0; i < COLOR_SIZE; i += 1){
            if(availableColors[i] == false){
                totalColorsUsed += 1;
            }
        }
 
        return totalColorsUsed;
 
    }
 
    public static boolean helperColorMap(int index){
        if(index == N){
            return true;
        }
 
        for(int color = 0; color < COLOR_SIZE; color += 1) {
 
            if(isSafeToColor(index, color)){
                assignedColors[index] = color;
 
                if(helperColorMap(index + 1)){
                    return true;
                }
 
                assignedColors[index] = -1;
            }
        }
        return false;
    }
 
    public static boolean isSafeToColor(int index, int color){
 
        for(int i = 0; i < neighbours[index].length; i += 1){
            int v = neighbours[index][i];
            if(color == assignedColors[v]){
                return false;
            }
        }
 
        return true;
    }
}
