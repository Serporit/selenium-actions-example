package reporting;

import org.apache.logging.log4j.LogManager;

public class Logger {

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(Logger.class);

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void error(String message) {
        LOGGER.error(message);
    }

    public static void debug(String message) {
        LOGGER.debug(message);
    }

    public static void attach(String filePath, String message) {
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", filePath, message);
    }
}
