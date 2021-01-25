import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

        Printer printer;
        Printer printer2;

        @Before
        public void before(){
        printer = new Printer(100,50);
        printer2 = new Printer(5, 0 );
        }

        @Test
        public void hasPaper(){
            assertEquals(100, printer.getCurrentPaper());
        }

        @Test
        public void hasToner(){
            assertEquals(50, printer.getTonerLeft());
        }

        @Test
        public void canPrint(){
            printer.startPrinting(1, 5);
            assertEquals(95, printer.getCurrentPaper());
    }





}
