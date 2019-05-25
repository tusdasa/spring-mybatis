package ssm.dao;

import java.io.Serializable;
import java.util.List;


/**
 * DAO公共基类，由MybatisGenerator自动生成请勿修改
 * @param <Model> The Model Class 这里是泛型不是Model类
 * @param <PK> The Primary Key Class 如果是无主键，则可以用Model来跳过，如果是多主键则是Key类
 */
public interface MyBatisBaseDao<Model, PK extends Serializable> {
    int insert(Model record);
    int insertSelective(Model record);
    int deleteById(PK id);
    int updateById(Model record);
    Model selectById(PK id);
    List<Model> findAll();
    List<Model> findAllByPage(Integer start, Integer size);
}