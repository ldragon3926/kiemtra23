import com.example.kt23.model.Sach;
import com.example.kt23.service.SachService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SachTest {

    SachService sachService = new SachService();
    @Test
    public void testUpdate1() {
        Sach sach = new Sach("S1",100000 ,"Book1", "L", 2005);
        sachService.add(sach);
        Sach sach1 = new Sach("S2",100000 ,"Book1", "L", 2005);
        sachService.UpdateSach(sach1);

        Assertions.assertEquals("S2", sachService.getOne("Book1").getMaSach());
    }

    @Test
    public void testUpdate2() {
        Sach sach = new Sach("S1",100000 ,"Book1", "L", 2005);
        sachService.add(sach);
        Sach sach1 = new Sach("S2",100000 ,"Book1", "Anhhhhhhhhhhhhhh", 2005);
        sachService.UpdateSach(sach1);

        Assertions.assertEquals("Anhhhhhhhhhhhhhh", sachService.getOne("Book1").getTacGia());

    }
    @Test
    public void testUpdate3() {
        Sach sach = new Sach("S1",100000 ,"Book1", "L", 2005);
        sachService.add(sach);
        Sach sach1 = new Sach("S2",100000 ,"Book1", "Anh", 2015);
        sachService.UpdateSach(sach1);

        Assertions.assertEquals(2015, sachService.getOne("Book1").getNamXuatBan());

    }
    @Test
    public void testUpdate4() {
        Sach sach = new Sach("S1",100000 ,"Book1", "L", 2005);
        sachService.add(sach);
        Sach sach1 = new Sach("S2",1300000000 ,"Book1", "Anh", 2015);
        sachService.UpdateSach(sach1);

        Assertions.assertEquals(1300000000, sachService.getOne("Book1").getGia());

    }
    @Test
    public void testUpdate5() {
        Sach sach = new Sach("S1",100000 ,"Book1", "L", 2005);
        sachService.add(sach);
        Sach sach1 = new Sach("S1",130000 ,"Book1", "Anh", 2015);
        Assertions.assertThrows(IllegalArgumentException.class, () ->      sachService.UpdateSach(sach1));

    }
    @Test
    public void testUpdate6() {
        Sach sach = new Sach("S1",100000 ,"Book1", "L", 2005);
        sachService.add(sach);
        Sach sach1 = new Sach("S2",100000 ,"Book1", "L", 2005);
        sachService.add(sach1);
        Sach sach2 = new Sach("S2",130000 ,"Book1", "Anh", 2015);
        Assertions.assertThrows(IllegalArgumentException.class, () ->      sachService.UpdateSach(sach2));

    }
}

