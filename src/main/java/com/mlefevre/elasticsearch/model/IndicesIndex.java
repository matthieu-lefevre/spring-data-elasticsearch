package com.mlefevre.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "underlyings", type = "indices")
public class IndicesIndex extends Underlying {
}
