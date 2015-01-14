import org.apache.log4j.Logger;

/**
 * Just testing Log4j again...
 */
public class TestLog4jFunc {
    static Logger logger = org.apache.log4j.Logger.getLogger(TestLog4jFunc.class);

    public static void main(String[] args) {
        double dvalue = 0.47;
        logger.info("First log-message "+dvalue+"%");
    }
}
