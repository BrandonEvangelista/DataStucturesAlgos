/**
 * 
 */

/**
 * @author Evangelista
 *
 */
import java.awt.Point;

public class Lab1 {






	public static String[][] build2DArray (int n){
		//creates the array and initialize 
		int maxSide= (n*10);// ensures only odd number of rows/ columns
		if (n == 0) {
			maxSide = 5;
		}
		
		
		if (maxSide%2 == 0) {
			maxSide = maxSide-1;
		}
		
		String[][] array2d = new String[maxSide][maxSide];
		
		for (int i = 0; i < maxSide; i++) {
			for(int j = 0; j < maxSide; j++ ) {
				array2d[i][j] = " ";  //fill each with coords
				}
			}
		return array2d;
	}
	
	
	public static void printArray (String[][] array2d ) {
		for (int i = 0 ; i < array2d.length; i++) {
			for(int j = 0;j < array2d[i].length;j++) {
				System.out.print(array2d[i][j]);
				}
				System.out.println();
				}	
	}
	
	public static Point[] findVertex(String[][] array2d ){ // [0],[max/2]
		Point[] vertABC = new Point[3];
		
		
		int max = array2d[0].length;
		int middle = max/2;
		 

		Point vertexA  = new Point (0,middle);
		Point vertexB = new Point (max-1,0);
		Point vertexC = new Point (max-1,max-1);
		
		vertABC[0]= vertexA;
		vertABC[1]= vertexB;
		vertABC[2]= vertexC;
		
		return  vertABC;
	}
	
	public static Point getMiddle (Point a, Point b) { // calc the middle coord
		    int x1 = (int) a.getX();
	        int y1 = (int) a.getY();
	        int x2 = (int) b.getX();
	        int y2 = (int) b.getY();

	        int middleX = (x1 + x2) / 2;
	        int middleY = (y1 + y2) / 2;
	        
	        Point mid = new Point(middleX,middleY);
	        return mid;
		
		
	}
	//********************recursive **********************************************************
	public static void drawTriangle(int depth,String[][] array2d, Point vertexA, Point vertexB, Point vertexC) {
		
		if (depth == 0) {
			int x1 = (int) vertexA.getX();
	        int y1 = (int) vertexA.getY();
	        int x2 = (int) vertexB.getX();
	        int y2 = (int) vertexB.getY();
	        int x3 = (int) vertexC.getX();
	        int y3 = (int) vertexC.getY();
	        
	        array2d[x1][y1] = "*";
	        array2d[x2][y2] = "*";
	        array2d[x3][y3] = "*";
	        
		}
			else {
				Point midAB = getMiddle(vertexA,vertexB);
				Point midAC = getMiddle(vertexA,vertexC); 
				Point midBC = getMiddle(vertexB,vertexC); 
				drawTriangle(depth-1,array2d,vertexA,midAB,midAC);
				drawTriangle(depth-1,array2d,midAB,vertexB,midBC);
				drawTriangle(depth-1,array2d,midAC,midBC,vertexC);
				
			}
		  
	}
	
//*************************************************************************************************	
	
	
	
	public static void main(String[] args) {
		
		int depth  = 6; // set depth here
		
		String[][] myArray = build2DArray(depth ); //
		Point[] threeVertex = findVertex(myArray);
		
		drawTriangle(depth,myArray,threeVertex[0],threeVertex[1],threeVertex[2]);
		
		printArray(myArray);
		System.out.println("Vert A is " + threeVertex[0]);
		System.out.println("Vert B is " + threeVertex[1]);
		System.out.println("Vert C is " + threeVertex[2]);
	
				
	}

}
