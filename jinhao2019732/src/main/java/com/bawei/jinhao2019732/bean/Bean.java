package com.bawei.jinhao2019732.bean;

import java.util.List;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 09:38:35
 *@Description:
 * */public class Bean {

    /**
     * code : 1000
     * data : {"news":[{"comment":false,"id":0,"imageUrl":"image/banner1.jpeg","publishAt":"2019-03-22","title":"特朗普：是时候承认以色列对戈兰高地拥有主权了 ","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":1,"imageUrl":"image/banner5.jpeg","publishAt":"2019-03-22","title":"外交部回应蔡英文将\u201c过境\u201d夏威夷：已向美方提出严正交涉","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":2,"imageUrl":"image/banner2.jpeg","publishAt":"2019-03-22","title":"你无可替代 隋文静/韩聪上演\u201c王者归来\u201d","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":3,"imageUrl":"image/banner4.jpeg","publishAt":"2019-03-22","title":"华为新MateBook X Pro体验：全面屏有了更多黑科技","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":4,"imageUrl":"image/banner3.jpeg","publishAt":"2019-03-22","title":"高分五号、六号卫星正式投入使用","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":5,"imageUrl":"image/banner1.jpeg","publishAt":"2019-03-22","title":"脸书再曝安全漏洞：数亿用户密码没加密保存，员工可直接浏览","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":6,"imageUrl":"image/banner2.jpeg","publishAt":"2019-03-22","title":"华为P30新机发布在即，去年老旗舰华为Mate20开始降价","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":7,"imageUrl":"image/banner3.jpeg","publishAt":"2019-03-22","title":"尴尬！蔡英文抵达帕劳 当地民众不知道她是谁\u2026","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":8,"imageUrl":"image/banner4.jpeg","publishAt":"2019-03-22","title":"应急管理部工作组到达江苏盐城指导救援处置工作","type":"news","url":"724D6A55496A11726628.html"},{"comment":false,"id":9,"imageUrl":"image/banner5.jpeg","publishAt":"2019-03-22","title":"那声惨叫让所有人傻眼!隋文静夺冠后才说:赛前我捡回了一条命","type":"news","url":"724D6A55496A11726628.html"}],"topnews":[{"comment":false,"id":0,"imageUrl":"image/banner1.jpeg","publishAt":"2019-03-22","title":"波音接受质询","type":"topnews","url":"724D6A55496A11726628.html"},{"comment":false,"id":1,"imageUrl":"image/banner2.jpeg","publishAt":"2019-03-22","title":"欧阳娜娜声明","type":"topnews","url":"724D6A55496A11726628.html"},{"comment":false,"id":2,"imageUrl":"image/banner3.jpeg","publishAt":"2019-03-22","title":"王思聪 姿态","type":"topnews","url":"724D6A55496A11726628.html"},{"comment":false,"id":3,"imageUrl":"image/banner4.jpeg","publishAt":"2019-03-22","title":"小米收购九维宽频","type":"topnews","url":"724D6A55496A11726628.html"},{"comment":false,"id":4,"imageUrl":"image/banner5.jpeg","publishAt":"2019-03-22","title":"隋文静韩聪夺冠","type":"topnews","url":"724D6A55496A11726628.html"}]}
     * msg : 成功
     */

    public int code;
    public DataBean data;
    public String msg;

    public static class DataBean {
        public List<NewsBean> news;
        public List<TopnewsBean> topnews;

        public static class NewsBean {


            public boolean comment;
            public int id;
            public String imageUrl;
            public String publishAt;
            public String title;
            public String type;
            public String url;
        }

        public static class TopnewsBean {

            public boolean comment;
            public int id;
            public String imageUrl;
            public String publishAt;
            public String title;
            public String type;
            public String url;
        }
    }
}
