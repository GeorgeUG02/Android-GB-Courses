import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void test_a1_1(){
        int[] a=Main.a1(new int[]{1,2,3,4,5,4,7});
        Assert.assertEquals(1,a.length);
        Assert.assertEquals(7,a[0]);
    }
    @Test
    public void test_a1_2(){
        int[] a=Main.a1(new int[]{2,4,5,4,7,8,15});
        Assert.assertEquals(3,a.length);
        int[] b= {7,8,15};
        for (int i=4;i<7;i++){
            Assert.assertEquals(b[i-4],a[i-4]);
        }
    }
    @Test
    public void test_a1_3(){
        Assert.assertThrows(RuntimeException.class,()->Main.a1(new int[]{5,7,3}));
    }
    @Test
    public void test_a2_1(){
        Assert.assertEquals(true,Main.a2(new int[]{1,4,4,4,1,1,1}));
    }
    @Test
    public void test_a2_2(){
        Assert.assertEquals(false,Main.a2(new int[]{1,1,1,1}));
    }
    @Test
    public void test_a2_3(){
        Assert.assertEquals(false,Main.a2(new int[]{4,4,4}));
    }
    @Test
    public void test_a2_4(){
        Assert.assertEquals(false,Main.a2(new int[]{2,1,4,1,5}));
    }
}
