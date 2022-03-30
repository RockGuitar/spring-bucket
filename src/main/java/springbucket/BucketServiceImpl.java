package springbucket;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketServiceImpl implements BucketService {
    public List<Integer> getBucket (){
        return itemBucket;
    }

    public void addItems (List<Integer> items){
        itemBucket.addAll(items);
    }
}
