package service.impl;

import dao.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PeopleService;
import service.entity.People;

import java.util.List;

/**
 * @author WangYao
 * @date 2020/9/21
 * @function 业务层实现类
 */
@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    PeopleDao peopleDao;

    @Override
    public List<People> findAll() {
        return peopleDao.findAll();
    }

    @Override
    public void save(People people) {
        peopleDao.save(people);
    }
}
