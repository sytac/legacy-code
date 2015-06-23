package nl.sytac.tdd.legacy;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class GameRunnerGoldenMaster {

    @Test
    public void createGoldenMaster() throws FileNotFoundException {
        System.setOut(new PrintStream("C:\\Programming\\Private\\legacy-code\\golden_master.txt"));

        for (int i = 0; i < 10000; i++) {
            GameRunner.rand = new Random(i);

            GameRunner.main(null);
        }
    }
}