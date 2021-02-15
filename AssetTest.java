import org.junit.jupiter.api.Test;

class AssetTest {
    @Test
    void CompareTo(){
        Asset a = new Asset(59);
        a.compareTo(new Asset(59));
    }
