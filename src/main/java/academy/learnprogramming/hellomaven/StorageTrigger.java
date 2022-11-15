package academy.learnprogramming.hellomaven;
import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;
import java.util.logging.Logger;

import com.google.cloud.storage.Bucket;

public class StorageTrigger implements BackgroundFunction<Bucket> {
    private static final Logger logger = Logger.getLogger(StorageTrigger.class.getName());

    @Override
    public void accept(Bucket event, Context context) {
        logger.info("Processing file: " + event.getName());
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
//class GCSEvent {
//    String bucket;
//    String name;
//    String metageneration;
//}
