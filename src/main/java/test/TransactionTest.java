package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.AccountService;
import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class TransactionTest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @org.junit.Test
    public void test(){}

    @org.junit.Test
    public void test1(){
        accountService.transfer("aaa","bbb",200d);
    }
}
