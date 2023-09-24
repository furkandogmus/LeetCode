class TimeMap {
    HashMap<Integer,HashMap<String,String>> tm;
    HashMap<String,List<Integer>> stampList;
    public TimeMap() {
        tm= new HashMap<>();
        stampList = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!tm.containsKey(timestamp)){
            tm.put(timestamp,new HashMap<>());
            if(!stampList.containsKey(key)){
                stampList.put(key,new ArrayList<>());
            }
        }
        tm.get(timestamp).put(key,value);
        List<Integer> stamp = stampList.get(key);
       
        if(!stamp.isEmpty() &&stamp.get(0)<=timestamp){
            stamp.add(0,timestamp);
        }else{
            stamp.add(timestamp);
        }
        
    }

    public String get(String key, int timestamp) {
        if(!tm.containsKey(timestamp)){
            if(!stampList.containsKey(key)) return "";
            for(int i: stampList.get(key)){
                if(i<timestamp) {
                    if (tm.containsKey(i) && tm.get(i).containsKey(key)) return tm.get(i).get(key);
                }
            }
            return "";
        }
        if(!tm.get(timestamp).containsKey(key)) return "";
        return tm.get(timestamp).get(key);
    }
}