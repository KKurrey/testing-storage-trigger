package academy.learnprogramming.hellomaven;
import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;
import java.util.logging.Logger;

public class StorageTrigger implements BackgroundFunction<GCSEvent> {
    private static final Logger logger = Logger.getLogger(StorageTrigger.class.getName());

    @Override
    public void accept(GCSEvent event, Context context) {
        logger.info("Processing file: " + event.name);
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
class GCSEvent {
    String bucket;
    String name;
    String metageneration;
}
