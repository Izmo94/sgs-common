package com.sgs.common.model.message;

public class KafkaRequest {

    private Operation operation;
    private KafkaData data;
    private Params params;

    private KafkaRequest() {
    }

    public KafkaRequest(Operation operation, KafkaData data, Params params) {
        this.operation = operation;
        this.data = data;
        this.params = params;
    }

    public Operation getOperation() {
        return operation;
    }

    public KafkaData getData() {
        return data;
    }

    public Params getParams() {
        return params;
    }

    public static RequestBuilder builder() {
        return new RequestBuilder();
    }

    public static class RequestBuilder {

        KafkaRequest request = new KafkaRequest();

        public RequestBuilder setOperation(Operation operation) {
            request.operation = operation;
            return this;
        }

        public RequestBuilder setParams(Params params) {
            request.params = params;
            return this;
        }

        public RequestBuilder setData(KafkaData data) {
            request.data = data;
            return this;
        }

        public KafkaRequest build() {
            return request;
        }
    }
}
