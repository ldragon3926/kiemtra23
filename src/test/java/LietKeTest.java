import com.example.kt23.service.LietKe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LietKeTest {
    LietKe lietke = new LietKe();
    @Test
    public void testLK1() {
        Assertions.assertEquals("1 2 3 4 6 7 8 9 11 12 13 14 16 17 18 19 21 22 23 24 26 27 28 29 31 32 33 34 36 37 38 39 41 42 43 44 46 47 48 49 51 52 53 54 56 57 58 59 61 62 63 64 66 67 68 69 71 72 73 74 76 77 78 79 81 82 83 84 86 87 88 89 91 92 93 94 96 97 98 99 ", lietke.printTu1Den100());
    }
    @Test
    public void testLK2() {
        Assertions.assertEquals("6 7 8 9 11 12 13 14 16 17 18 19 21 22 23 24 26 27 28 29 31 32 33 34 36 37 38 39 41 42 43 44 46 47 48 49 51 52 53 54 56 57 58 59 61 62 63 64 66 67 68 69 71 72 73 74 76 77 78 79 81 82 83 84 86 87 88 89 91 92 93 94 96 97 98 99 ", lietke.printTu1Den100ex(5));
    }
    @Test
    public void testLK3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> lietke.printTu1Den100ex(100));
    }
    @Test
    public void testLK4() {
        Assertions.assertEquals("51 52 53 54 56 57 58 59 61 62 63 64 66 67 68 69 71 72 73 74 76 77 78 79 81 82 83 84 86 87 88 89 91 92 93 94 96 97 98 99 ",  lietke.printTu1Den100ex(50));
    }
    @Test
    public void testLK5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> lietke.printTu1Den100ex(-100));    }

}
