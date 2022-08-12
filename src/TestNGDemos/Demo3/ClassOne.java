package TestNGDemos.Demo3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ClassOne {

    @Parameters({"url","user","pass","dbName"})
    @BeforeClass
    public void init(String v1, String v2, String v3, String v4){
        System.out.println("url="+v1);
        System.out.println("user="+v2);
        System.out.println("pass="+v3);
        System.out.println("dbName="+v4);
    }

    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}

