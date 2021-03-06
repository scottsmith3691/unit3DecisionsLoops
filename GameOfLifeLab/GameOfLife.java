import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import java.util.*;


/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    private ActorWorld newWorld;
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 8;
    private final int COLS = 8;
    private ArrayList<java.lang.Object[]> actors = new ArrayList<java.lang.Object[]>();
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 4, Y1 = 0;
        final int X2 = 4, Y2 = 1;
        final int X3 = 4, Y3 = 2;
        final int X4 = 4, Y4 = 3;
        final int X5 = 4, Y5 = 4;
        final int X6 = 4, Y6 = 5;
        final int X7 = 4, Y7 = 6;
        final int X8 = 4, Y8 = 7;
        

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add bugs (a type of Actor) to the three intial locations
        Bug bug1 = new Bug(Color.CYAN);
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, bug1);
        
        Bug bug2 = new Bug(Color.CYAN);
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, bug2);
        
        Bug bug3 = new Bug(Color.CYAN);
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, bug3);
        
        Bug bug4 = new Bug(Color.CYAN);
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, bug4);
        
        Bug bug5 = new Bug(Color.CYAN);
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, bug5);
        
        Bug bug6 = new Bug(Color.CYAN);
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, bug6);
        
        Bug bug7 = new Bug(Color.CYAN);
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, bug7);
        
        Bug bug8 = new Bug(Color.CYAN);
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, bug8);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()throws InterruptedException
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
        for(int i=0;i<COLS;i++)
        {
            for( int x=0;x<ROWS;x++)
            {
                Location l= new Location(x,i);
               
                if(grid.get(l) != null)
                {
                   if (grid.getOccupiedAdjacentLocations(l).size()==2 
                   || grid.getOccupiedAdjacentLocations(l).size()==3)
                   {
                       Bug nBug = new Bug(Color.CYAN);
                       newGrid.put(l,nBug);
                       
  
                   } 
                   else
                   {
                       grid.get(l).setColor(Color.RED);
                   }
                }
                if(grid.get(l) == null)
                {
                    if (grid.getOccupiedAdjacentLocations(l).size()==3)
                    {
                        Bug nBug = new Bug(Color.CYAN);
                        newGrid.put(l,nBug);
                    }
                }
                Thread.sleep(100);
                }
            }
        world.setGrid(newGrid);
        world.show();
        Thread.sleep(1000);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many generations would you like it to run through(1-8): ");
        int gen = scan.nextInt();GameOfLife game = new GameOfLife();
        for(int i = 1; i <= gen; i++)
        {
            game.createNextGeneration();
        }
    }

}