//Importieren der Assertion-Methoden
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*; 

public class ArrayComparator {

	// Anlegen vom erwarteten und tatsächlichen Array
	private static int[] expectedArray;
	private static int[] actualArray;

	@BeforeAll
	public static void setUpClass() {
		// Initialisierung des expectedArrays vor allen Tests
		expectedArray = new int[] {1, 2, 3};
	}

    @BeforeEach
	public void setUp() {
		// Initialisierung des actualArrays vor jedem Test
		actualArray = new int[] {1, 2, 3};
	}

	@AfterAll
	public static void tearDownClass() {
		// Aufräumen nach allen Tests
		expectedArray = null;
	}

	@AfterEach
	public void tearDown() {
		// Aufräumen nach jedem Test
		actualArray = null;
	}

	@Test
	public void testArrays() {
		// Vergleich der beiden Arrays
		assertArrayEquals(expectedArray, actualArray);
	}
}





