package com.mlefevre.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "underlyings", type = "shares")
public class EquitiesIndex extends Underlying {



}
