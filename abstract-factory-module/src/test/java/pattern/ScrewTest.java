package pattern;

import com.etc.pattern.core.AScrewFactory;
import com.etc.pattern.core.AbstractWorkshopFactory;
import com.etc.pattern.core.BScrewFactory;
import com.etc.pattern.pojo.Screw;
import com.etc.pattern.pojo.ScrewCap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class ScrewTest {

    private Long startTime;
    private Long endTime;

    @Before
    public void setUp() {
        startTime = System.currentTimeMillis();
        System.out.println("---------------------------测试抽象工厂模式--------------------------");
    }

    @Test
    public void test() throws Exception {
        //创建A车间
        AbstractWorkshopFactory workshopFactory = new AScrewFactory();
        for (int i = 0; i < 100; i++) {
            Screw screw = workshopFactory.generatorScrew();
            ScrewCap screwCap = workshopFactory.generatorScrewCap();
            screw.remarking();
            screwCap.remarking();
            System.out.println();
        }
    }

    @Test
    public void test2() throws Exception {
        //创建B车间
        AbstractWorkshopFactory workshopFactory = new BScrewFactory();
        for (int i = 0; i < 100; i++) {
            Screw screw = workshopFactory.generatorScrew();
            ScrewCap screwCap = workshopFactory.generatorScrewCap();
            screw.remarking();
            screwCap.remarking();
            System.out.println();
        }
    }

    @After
    public void after(){
        endTime = System.currentTimeMillis();
        System.out.println("---------------------------测试抽象工厂模式--------------------------");
        System.out.println("运行时间"+(endTime - startTime)+"ms");
    }
}
