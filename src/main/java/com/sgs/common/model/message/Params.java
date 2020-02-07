package com.sgs.common.model.message;

import java.util.HashMap;
import java.util.Map;

public class Params {

    private Map<String, Object> parameters;

    private Params(){
    }

    public Params(Map<String, Object> params){
        this.parameters = params;
    }

    public Object getParameter(String k){
        return this.parameters.get(k);
    }

    public static ParamsBuilder builder(){
        return new ParamsBuilder();
    }

    public static class ParamsBuilder {

        Params params = new Params(new HashMap<>());

        public ParamsBuilder addParameter(String k, Object v){
            params.parameters.put(k, v);
            return this;
        }

        public Params build() {
            return params;
        }
    }
}
