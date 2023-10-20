package org.example.service;

import org.example.domain.Account;

import java.util.List;

/**
 * @author: zh
 * @date: 2023/10/20 16:21
 * @description:
 */
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<List> findAll();

    Account findById(Integer id);
}
