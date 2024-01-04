package guru.qa;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    @BeforeAll
    static void BeforeAll () {
        System.out.println("###     @BeforeAll\n");
    }

    @AfterAll
    static void AfterAll () {
        System.out.println("###     @AfterAll");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("###     @BeforeEach");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("###     @AfterEach\n");
    }

    @Test
    void firstTest() {
        System.out.println("### @Test firstTest");
        Assertions.assertTrue(2 * 2 == 4);
    }

    @Test
    void secondTest() {
        System.out.println("### @Test secondTest");
        Assertions.assertTrue(2 + 2 == 4);
}
}