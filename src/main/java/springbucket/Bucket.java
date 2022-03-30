package springbucket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Bucket {
    List<Integer> itemBucket;
    public Bucket(List<Integer> itemBucket){
        this.itemBucket = itemBucket;
    }

}
