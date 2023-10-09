# springboot-elasticsearch
http://localhost:9200/products/_search
{

    "took": 441,
    "timed_out": false,
    "_shards": {
        "total": 1,
        "successful": 1,
        "skipped": 0,
        "failed": 0
    },
    "hits": {
        "total": {
            "value": 3,
            "relation": "eq"
        },
        "max_score": 1.0,
        "hits": [
            {
                "_index": "products",
                "_type": "_doc",
                "_id": "101",
                "_score": 1.0,
                "_source": {
                    "_class": "com.springboot.esasticsearch.entity.Product",
                    "id": 101,
                    "name": "Sony Laptop",
                    "price": 40000,
                    "description": "Performance is better of this laptop"
                }
            },
            {
                "_index": "products",
                "_type": "_doc",
                "_id": "102",
                "_score": 1.0,
                "_source": {
                    "_class": "com.springboot.esasticsearch.entity.Product",
                    "id": 102,
                    "name": "Mac Laptop",
                    "price": 150000,
                    "description": "Supper Laptop"
                }
            },
            {
                "_index": "products",
                "_type": "_doc",
                "_id": "103",
                "_score": 1.0,
                "_source": {
                    "_class": "com.springboot.esasticsearch.entity.Product",
                    "id": 103,
                    "name": "HP Laptop",
                    "price": 50000,
                    "description": "Low price Laptop"
                }
            }
        ]
    }
}
===============================================================================================
http://localhost:9200/products/_search

body:-

{
    "query":{
        "match":{
            "name":"Mac Laptop"
        }
    }
}
------------------------------------------------------------------
{
    "took": 1041,
    "timed_out": false,
    "_shards": {
        "total": 1,
        "successful": 1,
        "skipped": 0,
        "failed": 0
    },
    "hits": {
        "total": {
            "value": 3,
            "relation": "eq"
        },
        "max_score": 1.1143606,
        "hits": [
            {
                "_index": "products",
                "_type": "_doc",
                "_id": "102",
                "_score": 1.1143606,
                "_source": {
                    "_class": "com.springboot.esasticsearch.entity.Product",
                    "id": 102,
                    "name": "Mac Laptop",
                    "price": 150000,
                    "description": "Supper Laptop"
                }
            },
            {
                "_index": "products",
                "_type": "_doc",
                "_id": "101",
                "_score": 0.13353139,
                "_source": {
                    "_class": "com.springboot.esasticsearch.entity.Product",
                    "id": 101,
                    "name": "Sony Laptop",
                    "price": 40000,
                    "description": "Performance is better of this laptop"
                }
            },
            {
                "_index": "products",
                "_type": "_doc",
                "_id": "103",
                "_score": 0.13353139,
                "_source": {
                    "_class": "com.springboot.esasticsearch.entity.Product",
                    "id": 103,
                    "name": "HP Laptop",
                    "price": 50000,
                    "description": "Low price Laptop"
                }
            }
        ]
    }
}
