package ro.ase.cts.unitestslab.tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.cts.unitestslab.AplicatieBancara;
import ro.ase.cts.unitestslab.Calculator;
import ro.ase.cts.unitestslab.ContBancar;

import java.io.FileWriter;
import java.time.Instant;

import static org.junit.Assert.assertSame;

public class AplicatieBancaraTests {
    private AplicatieBancara aplicatieBancara;
    private static FileWriter resultsFile;
    private static int passedTests = 0;


    @BeforeClass
    public static void globalSetUp() throws Exception {
        resultsFile = new FileWriter(Instant.now().getEpochSecond() + "-results.txt");
        System.out.println("Fisierul este pregatit pentru scriere.");
    }

    @Before
    public void setUp() throws Exception {
        aplicatieBancara = AplicatieBancara.getInstance();
    }
    @Test
    public void testSingleton()
    {
        AplicatieBancara aplicatieBancaraTest = AplicatieBancara.getInstance();
        assertSame("Singleton nu este implementat corect.", aplicatieBancara, aplicatieBancaraTest);
        passedTests++;
    }

    @Test
    public void testAdaugareContInLista(){
        ContBancar c = new ContBancar("ABC123","Denisian",300);
        aplicatieBancara.inregistrareCont("ABC123","Denisian",300);
        

    }
    @AfterClass
    public static void globalCleanUp() throws Exception {
        resultsFile.write("" + passedTests);
        resultsFile.close();
        System.out.println("Fisier inchis cu succes.");
    }
}
