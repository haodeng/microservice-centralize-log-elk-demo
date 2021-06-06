# Microservice centralize logs using ELK stack
Proof of concept

## Setup env
Start elasticsearch

    docker network create elastic
    docker pull docker.elastic.co/elasticsearch/elasticsearch:7.13.0

    # start a single-node Elasticsearch cluster
    docker run --name es01-test --net elastic -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.13.0
    
    # check up and running
    http://localhost:9200/

Start kibana    

    docker pull docker.elastic.co/kibana/kibana:7.13.0
    docker run --name kib01-test --net elastic -p 5601:5601 -e "ELASTICSEARCH_HOSTS=http://es01-test:9200" docker.elastic.co/kibana/kibana:7.13.0
    
    # check up and running
    http://localhost:5601

