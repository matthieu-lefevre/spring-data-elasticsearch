package com.mlefevre.elasticsearch.dto;

public class SearchDto {

    private int pageNb;
    private String search;


    public SearchDto() {

    }


    public int getPageNb() {
        return pageNb;
    }

    public void setPageNb(int pageNb) {
        this.pageNb = pageNb;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
