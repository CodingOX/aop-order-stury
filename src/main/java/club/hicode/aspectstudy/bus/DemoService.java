package club.hicode.aspectstudy.bus;

import club.hicode.aspectstudy.aspect.Authority;
import club.hicode.aspectstudy.aspect.Log;
import org.springframework.stereotype.Service;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/9/2
 */
@Service
public class DemoService {

    @Log
    @Authority
    public void save() {
        System.out.println("save...");
    }
}
