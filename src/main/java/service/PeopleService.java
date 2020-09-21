package service;

import service.entity.People;

import java.util.List;

/**
 * @author WangYao
 * @date 2020/9/21
 * @function 业务层
 */
public interface PeopleService {
    List<People> findAll();

    void save(People people);
}
