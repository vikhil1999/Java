import java.util.Arrays;
public class task1 {
/**
     *
     */
    static int row,col;
    public static void main(String[] args) {
     String[] a= {"#S###########",
                "# # # #     #",
                "# #   # ### #",
                "#   ###     #",
                "# #     ### #",
                "# # ### #   #",
                "# # #   ### #",
                "# # ### # # #",
                "#         #E#",
                "#############"
            };
task1 t=new task1();
int i=0,j=0; 
char[][] maze=new char[a.length][];
for(i=0;i<a.length;i++)
{
    maze[i]=a[i].toCharArray();
    System.out.println(maze[i]);
}  
row=maze.length;
col=maze[0].length;
hi:
for(i=0;i<row;i++)
{
    for(j=0;j<col;j++)
    {
        if(maze[i][j]=='S')
        break hi;
    }
} 
boolean[][] visited=new boolean[row][col];
t.solve(i,j,maze,visited);
}
void solve(int i,int j,char[][] maze,boolean[][] visited)
{
    if(i<0||i>row||j<0||j>col||maze[i][j]=='#')
    {
        return;
    }
    if(maze[i][j]=='E')
    {
        printmaze(maze);
    }
    if(visited[i][j]==false)
    {
        char temp;
        temp=maze[i][j];
        maze[i][j]='*';
        visited[i][j]=true;
        solve(i-1, j, maze, visited); //Go North
        solve(i+1, j, maze, visited); //Go South
        solve(i, j+1, maze, visited); //Go East
        solve(i, j-1, maze, visited); //Go West
        maze[i][j]=temp;
        visited[i][j]=false;
    }
}
    public static void printmaze(char[][] maze)
    {
        int i;
        System.out.println("Solved Maze");
        for(i=0;i<row;i++)
        {
            System.out.println(maze[i]);
        }
    }
}
