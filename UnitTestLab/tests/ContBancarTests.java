package ro.ase.cts.unitestslab.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.cts.unitestslab.Calculator;
import ro.ase.cts.unitestslab.ContBancar;

import java.io.FileWriter;
import java.time.Instant;

import static org.junit.Assert.assertSame;

public class ContBancarTests {
    private static FileWriter resultsFile;
    private static int passedTests = 0;

    @BeforeClass
    public static void globalSetUp() throws Exception {
        resultsFile = new FileWriter(Instant.now().getEpochSecond() + "-results.txt");
        System.out.println("Fisierul este pregatit pentru scriere.");
    }
    @Test
    public void testSetareCont()
    {
        ContBancar c = new ContBancar("ABC123","Denisian",300);
        assertSame("Numele contului nu este setat corect", c.getNume(), "Denisian");
        assertSame("Numarul contului nu este setat corect", c.getNumarCont(), "ABC123");
        passedTests++;
    }

    @Test
    public void testContBlocat(){
        ContBancar c = new ContBancar("ABC123","Denisian",300);
        c.setStatus("LOCKED");
        assertSame("Blocarea contului nu se seteaza corect", c.getStatus(), "LOCKED");
        passedTests++;
    }

    @AfterClass
    public static void globalCleanUp() throws Exception {
        resultsFile.write("" + passedTests);
        resultsFile.close();
        System.out.println("Fisier inchis cu succes.");
    }
}
