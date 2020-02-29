package cn.itcast.service;

import cn.itcast.daomain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void saveAccoumt(Account account);
}
