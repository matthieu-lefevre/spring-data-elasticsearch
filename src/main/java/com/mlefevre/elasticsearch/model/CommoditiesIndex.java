package com.mlefevre.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "underlyings", type = "commodities")
public class CommoditiesIndex extends Underlying {



}
