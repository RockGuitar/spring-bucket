package springbucket;


import java.util.ArrayList;
import java.util.List;

public interface BucketService {
    List<Integer> itemBucket = new ArrayList<>();
    void addItems (List<Integer> items);
    List<Integer> getBucket ();
}
