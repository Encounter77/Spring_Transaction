package service.impl;

import dao.AccountDao;
import org.springframework.transaction.annotation.Transactional;
import service.AccountService;

@Transactional
public class AccountServiceImpl implements AccountService {

    //注入Dao层对象，XML文件的setter方法注入
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        //构建异常 /by Zero
        int d = 1/0;
        accountDao.inMoney(in,money);
    }
}
