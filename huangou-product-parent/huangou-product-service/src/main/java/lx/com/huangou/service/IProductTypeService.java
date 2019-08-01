package lx.com.huangou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import lx.com.huangou.domain.ProductType;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author solargen
 * @since 2019-07-31
 */
public interface IProductTypeService extends IService<ProductType> {

    /**
     * 加载类型树
     * @return
     */
    List<ProductType> loadTypeTree();

    void genHomePage();
}
