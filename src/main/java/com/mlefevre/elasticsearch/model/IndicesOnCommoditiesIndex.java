package com.mlefevre.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "underlyings", type = "indices_on_commidities")
public class IndicesOnCommoditiesIndex extends Underlying {



}
