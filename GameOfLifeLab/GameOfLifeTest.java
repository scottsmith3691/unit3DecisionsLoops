
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 
         *  0 - - - - - - - -
         *  1 - - - - - - - -
         *  2 - - - - - - - -
         *  3 - - - - - - - -
         *  4 X X X X X X X X
         *  5 - - - - - - - -
         *  6 - - - - - - - -
         *  7 - - - - - - - -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 4 && col == 0) ||
                        (row == 4 && col == 1) ||
                        (row == 4 && col == 2) ||
                        (row == 4 && col == 3) ||
                        (row == 4 && col == 4) ||
                        (row == 4 && col == 5) ||
                        (row == 4 && col == 6) ||
                        (row == 4 && col == 7))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* expected pattern after 3 generations
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 
         *  0 - - - - - - - -
         *  1 - - - X X - - -
         *  2 - - X X X X - -
         *  3 - X X X X X X -
         *  4 X X - - - - X X
         *  5 - X X X X X X -
         *  6 - - X X X X - -
         *  7 - - - X X - - -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 1 && col == 3) ||
                        (row == 1 && col == 4) ||
                        (row == 2 && col == 2) ||
                        (row == 2 && col == 3) ||
                        (row == 2 && col == 4) ||
                        (row == 2 && col == 5) ||
                        (row == 3 && col == 1) ||
                        (row == 3 && col == 2) ||
                        (row == 3 && col == 3) ||
                        (row == 3 && col == 4) ||
                        (row == 3 && col == 5) ||
                        (row == 4 && col == 0) ||
                        (row == 4 && col == 1) ||
                        (row == 4 && col == 6) ||
                        (row == 4 && col == 7) ||
                        (row == 5 && col == 1) ||
                        (row == 5 && col == 2) ||
                        (row == 5 && col == 3) ||
                        (row == 5 && col == 4) ||
                        (row == 5 && col == 5) ||
                        (row == 5 && col == 6) ||
                        (row == 6 && col == 2) ||
                        (row == 6 && col == 3) ||
                        (row == 6 && col == 4) ||
                        (row == 6 && col == 5) ||
                        (row == 7 && col == 3) ||
                        (row == 7 && col == 4))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

