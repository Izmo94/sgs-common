package com.sgs.common.model.message;

public class KafkaResponse {

    private ResponseCode code;
    private KafkaData data;
    private String message;

    private KafkaResponse() {
    }

    public KafkaResponse(ResponseCode code, KafkaData data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ResponseCode getCode() {
        return code;
    }


    public KafkaData getData() {
        return data;
    }


    public String getMessage() {
        return message;
    }

    public ResponseBuilder builder() {
        return new ResponseBuilder();
    }

    public static class ResponseBuilder {

        KafkaResponse response = new KafkaResponse();

        public ResponseBuilder setCode(ResponseCode code) {
            response.code = code;
            return this;
        }

        public ResponseBuilder setData(KafkaData data) {
            response.data = data;
            return this;
        }

        public ResponseBuilder setMessage(String message) {
            response.message = message;
            return this;
        }

        public KafkaResponse build() {
            return response;
        }
    }
}
