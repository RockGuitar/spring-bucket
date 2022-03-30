package springbucket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Controller {
    private final BucketService bucketService;
    public Controller(BucketService bucketService){
        this.bucketService = bucketService;
    }
    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items){
        bucketService.addItems(items);
        return items;
    }
    @GetMapping("/get")
    public List<Integer> getItems(){
        return bucketService.getBucket();
    }
}
