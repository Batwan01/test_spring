package testserver.cd.testproject.controller;
import testserver.cd.testproject.model.InfoVO;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class Postcontroller {
    @RequestMapping(method = RequestMethod.POST, path = "/postRequestApi")
    public InfoVO postRequestApi(@RequestBody InfoVO infoVO){ // post 방식은 data를 body에 받아오기 때문에 RequestBody 어노테이션을 사용한다.
        /*try {
            return infoVO;
        } catch(IllegalArgumentException e) {
            System.out.println(e);
            return null;
        }
        */
        return infoVO;
    }
}
