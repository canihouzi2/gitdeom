package com.bawei.jinhao2019732.bean;

import java.util.List;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 09:07:33
 *@Description:
 * */public class ShopBean {

    /**
     * code : 1000
     * msg : 成功
     * result : [{"children":[{"id":4,"title":"风景","type":2,"url":"/fengjing"},{"id":5,"title":"美女","type":2,"url":"/meinv"},{"id":6,"title":"动漫卡通","type":2,"url":"/dongma"},{"id":7,"title":"娱乐明星","type":2,"url":"/yule"},{"id":8,"title":"萌宠","type":2,"url":"/mengchong"},{"id":9,"title":"汽车","type":2,"url":"/qiche"},{"id":10,"title":"游戏","type":2,"url":"/youxi"}],"id":0,"title":"新闻","type":1,"url":""},{"id":1,"title":"要务","type":1,"url":""},{"id":2,"title":"圈子","type":1,"url":""},{"id":3,"title":"我的","type":1,"url":""}]
     */

    public int code;
    public String msg;
    public List<ResultBean> result;

    public static class ResultBean {
        /**
         * children : [{"id":4,"title":"风景","type":2,"url":"/fengjing"},{"id":5,"title":"美女","type":2,"url":"/meinv"},{"id":6,"title":"动漫卡通","type":2,"url":"/dongma"},{"id":7,"title":"娱乐明星","type":2,"url":"/yule"},{"id":8,"title":"萌宠","type":2,"url":"/mengchong"},{"id":9,"title":"汽车","type":2,"url":"/qiche"},{"id":10,"title":"游戏","type":2,"url":"/youxi"}]
         * id : 0
         * title : 新闻
         * type : 1
         * url :
         */

        public int id;
        public String title;
        public int type;
        public String url;
        public List<ChildrenBean> children;

        public static class ChildrenBean {
            /**
             * id : 4
             * title : 风景
             * type : 2
             * url : /fengjing
             */

            public int id;
            public String title;
            public int type;
            public String url;
        }
    }
}
