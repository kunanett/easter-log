package pkg;

import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    private static final Marker NATURE_MARKER = MarkerManager.getMarker("NATURE_MARKER");
    private static final Marker EASTER_MARKER = MarkerManager.getMarker("EASTER_MARKER");

    public static void main(String[] args) throws InterruptedException {

        int iteration = Integer.parseInt(args[0]);

        for (int i = 0; i<iteration; i++){
            ThreadContext.put("iteration", String.valueOf(i));

            logger.info(NATURE_MARKER, "Zöld erdőben jártam,");
            logger.debug(NATURE_MARKER, "Kék ibolyát láttam,");
            logger.fatal("El akart hervadni,");
            logger.warn(EASTER_MARKER, "Szabad-e locsolni?");
            Thread.sleep(2000);

            ThreadContext.clearMap();
        }
    }
}
