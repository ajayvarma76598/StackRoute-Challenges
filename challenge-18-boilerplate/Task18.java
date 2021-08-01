public class Task18 {
    static int width = 13,height = 13;
    int startX = 1;int startY = 1;
    int endX=0, endY=1;
    static char mazeChar[][] = new char[width][height];
    static char maze[][]= {
    {'‡','S','‡','‡','‡','‡','‡','‡','‡','‡','‡','‡','‡'},
                {'‡',' ','‡',' ','‡',' ','‡',' ',' ',' ',' ',' ','‡'},
                {'‡',' ','‡',' ',' ',' ','‡',' ','‡','‡','‡',' ','‡'},
                {'‡',' ',' ',' ','‡','‡','‡',' ',' ',' ',' ',' ','‡'},
                {'‡',' ','‡',' ','‡',' ',' ',' ','‡','‡','‡',' ','‡'},
                {'‡',' ','‡',' ','‡','‡','‡',' ','‡',' ',' ',' ','‡'},
                {'‡',' ','‡',' ','‡',' ',' ',' ','‡','‡','‡',' ','‡'},
                {'‡',' ','‡',' ','‡','‡','‡',' ','‡',' ','‡',' ','‡'},
                {'‡','‡',' ',' ',' ',' ',' ',' ',' ',' ','‡','E','‡'},
                {'‡','‡','‡','‡','‡','‡','‡','‡','‡','‡','‡','‡','‡'}};
    
    public static void main(String[] args) {
    // int n = 20;
    createMaze();
    System.out.println("the more");
    System.out.println("----------");
    printMaze();
    solve(0,1);
    System.out.println("the solved maze");
    System.out.println("--------");
    printMaze();
    
    }
    public static void createMaze() {
    for(int i=0;i<maze.length;i++) {
    for(int j= 0;j<maze[0].length;j++) {
    if(maze[i][j] == '‡') {
    mazeChar[i][j] = '‡';
    }
    if(maze[i][j] == ' ') {
    mazeChar[i][j] = ' ';
    }
    if(maze[i][j] == 'S') {
    mazeChar[i][j] = 'S';
    }
    if(maze[i][j] == 'E') {
    mazeChar[i][j] = 'E';
    }
    }
    }
    }
    private static boolean solve(int i, int j) {
    if(mazeChar[i][j] == '‡') {
    return false;
    }
    if(mazeChar[i][j] == 'E') {
    return true;
    }
    if(mazeChar[i][j] == '*') {
    return false;
    }
    mazeChar[i][j] = '*';
    
    if((solve(i+1,j)) == true ) {
    return true;
    }
    if((solve(i,j-1)) == true) {
    return true;
    }
    if((solve(i,j+1)) == true) {
    return true;
    }
    if((solve(i-1,j)) == true) {
    return true;
    }
    mazeChar[i][j] = ' ';
    return false;
    }
    public static void printMaze() {
    for(int i=0;i<mazeChar.length;i++) {
    System.out.println(mazeChar[i]);
    }
    }
    
    }
    