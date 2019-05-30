package com.censoft.project.util;

import java.util.HashMap;
import java.util.Map;

public class FileuploadContext {
	
	private Map<String,Map<String,String>> params = new HashMap<>();

	private FileuploadContext() {}

    private static class SingletonInstance {
        private static final FileuploadContext INSTANCE = new FileuploadContext();
    }

    public static FileuploadContext getInstance() {
    	FileuploadContext fileuploadContext = SingletonInstance.INSTANCE;
    	return fileuploadContext;
    }
    
    public Map<String,String> getParams(String key){
    	return params.get(key);
    }
    public void setParams(String key,Map<String,String> value){
    	params.put(key, value);
    }
    public void deleteParams(String key){
    	params.remove(key);
    }
}
