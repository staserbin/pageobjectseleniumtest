import org.junit.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NOTLaunchTest {
    /* Последовательность выполнения тестов: @BeforeClass -> @Before -> @Test #1 -> @After -> @Before -> @Test #2 ->
     @After -> @Before -> @Test #3 -> @After -> @AfterClass */

    /* В самом начале перед ВСЕМИ тестовыми методами будет выполняться метод с анотацией @BeforeClass */
    @BeforeClass
    public void beforeClassMethod() {

     }

    /* Перед КАЖДЫМ тестовым методом будет выполняться метод с анотацией @Before */
     @Before
     public void setUp() {

     }

     @Test
     public void method1() {

     }

    /* Анотация @Ignore - позволяет игнорировать определённый тестовый метод */
     @Test
    @Ignore
    public void method2() {

    }

    @Test
    public void method3() {

    }

    /* После КАЖДОГО тестового метода будет выполняться метод с анотацией @After */
     @After
     public void tearDown() {

     }

    /* После ВСЕХ выполненных тестовых методов будет выполняться метод с анотацией @AfterClass */
     @AfterClass
    public void afterClassMethod() {

     }
}



/* ASSERTS */

/*
    Если условие выполняется (2 = 2), тогда тест пройден
    Assert.assertTrue(1 + 1 == 2);

    Или тест провалится:
    Assert.assertTrue("Values are NOT equal", 1 + 1 == 5);

    Если условие выполняется (2 != 3), тогда тест пройден
    Assert.assertFalse(1 + 1 == 3);

    Assert.assertNull();
    Assert.assertNotNull();

    Используется для сравнения ожидаемого и актуального результата
    Assert.assertEquals(exp_res, act_res);
    Assert.assertEquals(10, 5 + 5);
    Assert.assertEquals("Header name", signInHeader);

    Assert.assertNotEquals(exp_res, act_res);

*/