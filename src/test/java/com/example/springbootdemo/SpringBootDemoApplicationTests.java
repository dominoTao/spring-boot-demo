package java.com.example.springbootdemo;

import com.example.springbootdemo.controller.IndexController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class SpringBootDemoApplicationTests {
//    private MockMvc mvc;
//    @Before
//    public void before(){
//        this.mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
//    }
//    @Test
//    public void contextLoads() throws Exception {
//        RequestBuilder req = get("/index");
//        mvc.perform(req).andExpect(status().isOk()).andExpect(content().string("hello world"));
//    }

}
