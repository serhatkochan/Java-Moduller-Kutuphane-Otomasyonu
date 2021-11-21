package KitapIslemleriPaketi;
import java.sql.ResultSet;

public interface IKitapPersonel extends IKitapPersonelBilgisi{ // kalıtım
    void ekleme();
    ResultSet listeleme();
    ResultSet ara(int personelID);
    void guncelle();
    void silme();
}
