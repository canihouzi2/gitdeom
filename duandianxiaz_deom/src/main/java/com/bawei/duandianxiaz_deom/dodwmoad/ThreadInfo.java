package com.bawei.duandianxiaz_deom.dodwmoad;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/4
 *@Time: 10:57:56
 *@Description:
 * */public class ThreadInfo {
    private int id;
    private String url;
    private int start;
    private int end;
    private int finisshed;

    public ThreadInfo() {
    }

    public ThreadInfo(int id, String url, int start, int end, int finisshed) {
        this.id = id;
        this.url = url;
        this.start = start;
        this.end = end;
        this.finisshed = finisshed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getFinisshed() {
        return finisshed;
    }

    public void setFinisshed(int finisshed) {
        this.finisshed = finisshed;
    }

    @Override
    public String toString() {
        return "ThreadInfo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", finisshed=" + finisshed +
                '}';
    }
}
