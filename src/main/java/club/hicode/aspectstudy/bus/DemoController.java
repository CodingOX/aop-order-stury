package club.hicode.aspectstudy.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/9/2
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/save")
    public String invokeSave() {
        demoService.save();
        return "SUCCESS";
    }
}
