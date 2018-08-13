package service;

import dao.GoodsDAO;
import entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    //自动装配
    @Autowired
    GoodsDAO goodsDao;

    //分页
    @Override
    public List<Goods> getGoodsPager(int pageNO, int size) {
        int skip = (pageNO - 1) * size;
        return goodsDao.getGoodsPager(skip, size);
    }

    //获得单个产品对象
    @Override
    public Goods getGoodsById(int id) {
        return goodsDao.getGoodsById(id);
    }

    //获得商品总数
    @Override
    public int getGoodsCount() {
        return goodsDao.getGoodsCount();
    }

    //添加
    @Override
    public int insert(Goods entity) {
        return goodsDao.insert(entity);
    }

    //删除单个
    @Override
    public int delete(int id) {
        return goodsDao.delete(id);
    }

    //删除多个
    @Override
    public int deletes(int[] ids) {
        int rows = 0;
        for (int id : ids) {
            rows += delete(id);
        }
        return rows;
    }

    //更新
    @Override
    public int update(Goods entity) {
        return goodsDao.update(entity);
    }

}
