package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import service.entity.People;

import java.util.List;

/**
 * @author WangYao
 * @date 2020/9/21
 * @function dao层
 */
@Repository("PeopleDao")
public interface PeopleDao {

    @Select("select * from People;")
    List<People> findAll();

    @Insert("insert into People(studentNumber,name,birthday,sex,address) values (#{studentNumber},#{name},#{birthday},#{sex},#{address});")
    void save(People people);
}
