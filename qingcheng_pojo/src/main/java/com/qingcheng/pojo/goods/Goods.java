package com.qingcheng.pojo.goods;

import java.io.Serializable;
import java.util.List;

/**
 * @author 炼丹小童子
 * @create 2019-08-02 9:38
 * @name qingcheng_parent - com.qingcheng.pojo.goods    Alchemist
 */
public class Goods implements Serializable {
    private Spu spu;
    private List<Sku> skuList;

    @Override
    public String toString() {
        return "Goods{" + "spu=" + spu + ", skuList=" + skuList + '}';
    }

    public Spu getSpu() {
        return spu;
    }

    public void setSpu(Spu spu) {
        this.spu = spu;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }
}
