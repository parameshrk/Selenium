package TestNGDemos.Demo3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"url","user","pass","dbName"})
    @BeforeClass
    public void init(String v1, String v2, String v3, String v4){
        System.out.println("url="+v1);
        System.out.println("user="+v2);
        System.out.println("pass="+v3);
        System.out.println("dbName="+v4);
    }

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
